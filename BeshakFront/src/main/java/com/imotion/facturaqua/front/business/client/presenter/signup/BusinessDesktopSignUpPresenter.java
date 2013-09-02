package com.imotion.facturaqua.front.business.client.presenter.signup;

import com.google.gwt.core.client.GWT;
import com.imotion.facturaqua.front.business.client.presenter.BusinessPresenterBase;
import com.imotion.facturaqua.front.common.client.I18NCommonTexts;
import com.selene.arch.base.bom.AEMFTILoginDataConstants;
import com.selene.arch.base.bom.AEMFTIUserDataConstants;
import com.selene.arch.base.exe.bus.login.AEMFTIBusinessBaseLoginServiceConstant;
import com.selene.arch.base.exe.bus.login.AEMFTIBusinessBaseLoginServiceConstant.LoginResult;
import com.selene.arch.base.exe.bus.service.AEMFTIBusinessServiceIdConstant;
import com.selene.arch.base.exe.core.appli.metadata.AEMFTIMetadataContextController;
import com.selene.arch.base.exe.core.appli.metadata.element.AEMFTMetadataElementComposite;
import com.selene.arch.base.exe.core.appli.metadata.element.controller.AEMFTMetadataElementController;
import com.selene.arch.base.exe.core.common.AEMFTICommonConstants;
import com.selene.arch.exe.gwt.client.service.comm.AEGWTCommClientAsynchCallbackRequest;
import com.selene.arch.exe.gwt.client.utils.AEGWTStringUtils;
import com.selene.arch.exe.gwt.mvp.event.logic.AEGWTHasLogicalEventHandlers;
import com.selene.arch.exe.gwt.mvp.event.logic.AEGWTLogicalEvent;
import com.selene.arch.exe.gwt.mvp.event.logic.AEGWTLogicalEventTypes.LOGICAL_TYPE;

public class BusinessDesktopSignUpPresenter extends BusinessPresenterBase<BusinessDesktopSignUpDisplay>  implements AEGWTHasLogicalEventHandlers , BusinessSignUpPresenterConstants {
	
	private static final I18NCommonTexts 	COMMON_TEXTS 	= GWT.create(I18NCommonTexts.class);
	
	public BusinessDesktopSignUpPresenter(BusinessDesktopSignUpDisplay view) {
		super(view);
	}

	@Override
	public String getName() {
		return BusinessSignUpPresenterConstants.NAME;
	}

	@Override
	protected void bind() {

		getLogicalEventHandlerManager().addEventHandler(AEGWTHasLogicalEventHandlers.TYPE, this);

		int currentStep = getCurrentStepFromContext();
		setCurrentStep(currentStep);
	}
	
	@Override
	public void dispatchEvent(AEGWTLogicalEvent evt) {
		LOGICAL_TYPE type = evt.getEventType();
		if (LOGICAL_TYPE.BACK_EVENT.equals(type)) {
			goBack();
		} else if (LOGICAL_TYPE.NEXT_EVENT.equals(type)) {
			goNext();
		} else if (LOGICAL_TYPE.SKIP_EVENT.equals(type)) {
			skip();
		}
	}

	@Override
	public boolean isDispatchEventType(LOGICAL_TYPE type) {
		return type == LOGICAL_TYPE.BACK_EVENT || 
				type == LOGICAL_TYPE.NEXT_EVENT || 
				type == LOGICAL_TYPE.EDIT_EVENT;
	}

	@Override
	public String[] getInMapping() {
		return BusinessSignUpPresenterConstants.IN_MAPPING;
	}
	
	/****************************************************************************
	 *                          PRIVATE FUNCTIONS
	 ****************************************************************************/

	private void setCurrentStep(int step) {
		int currentStep = 1;
		if (step != -1) {
			currentStep = step;
		}
		setCurrentStepInContext(currentStep);
		getView().setCurrentStep(currentStep);
	}

	private void setCurrentStepInContext(int i) {
		getContextDataController().setElement(
								BusinessSignUpPresenterConstants.SIGNUP_DATA 
								+ AEMFTICommonConstants.CTE_MFT_AE_CORE_COMM_ELEMENT_SEPARATOR 
								+ BusinessSignUpPresenterConstants.SIGNUP_CURRENT_STEP, 
								i);
	}

	private int getCurrentStepFromContext() {
		int currentStep =  getContextDataController().getElementAsInt(
				BusinessSignUpPresenterConstants.SIGNUP_DATA 
				+ AEMFTICommonConstants.CTE_MFT_AE_CORE_COMM_ELEMENT_SEPARATOR 
				+ BusinessSignUpPresenterConstants.SIGNUP_CURRENT_STEP);
		if (currentStep == -1) {
			return 1;
		} else {
			return currentStep;
		}
	}

	private void processStep1() {
		int currentStep = getCurrentStepFromContext();
		setCurrentStep(currentStep + 1);
	}

	private void processLastStep() {
		if (getView().validate()) {
			AEMFTIMetadataContextController contextData = getContextDataController();
			
			contextData.setElement(AEMFTIUserDataConstants.EMAIL, 				getView().getUserEmail());
			contextData.setElement(AEMFTILoginDataConstants.HASH, 				AEGWTStringUtils.encodeMd5(getView().getPassword()));
			contextData.setElement(AEMFTIUserDataConstants.FIRST_NAME, 			getView().getUserFirstName());
			contextData.setElement(AEMFTIUserDataConstants.LAST_NAME, 			getView().getUserLastName());
			contextData.setElement(AEMFTIUserDataConstants.PHONE, 				getView().getUserPhone());


			getClientServerConnection().executeComm(contextData.getContext(), AEMFTIBusinessServiceIdConstant.CTE_MTF_AE_BUS_SERVICE_LOGIN_PROCESS_NEW_USER_ID, new AEGWTCommClientAsynchCallbackRequest<AEMFTMetadataElementComposite>(this) {
				
				@Override
				public void onResult(AEMFTMetadataElementComposite dataResult) {
					getView().resetNewUserValidation();
					String resultStr = AEMFTMetadataElementController.getElementAsString(
							AEMFTILoginDataConstants.LOGIN_RESULT
							, dataResult);

					AEMFTIBusinessBaseLoginServiceConstant.LoginResult result = LoginResult.valueOf(resultStr);

					switch (result) {
					case USERNAME_TAKEN:
						getView().invalidUsername();
						break;
					case EMAIL_TAKEN:
						getView().invalidEmailTaken();
						break;
					case INCORRECT_CAPTCHA:
						getView().invalidCaptcha();
						break;
					case SUCCESS:
						fireNavigationEvent(EVENT_SIGNUP_SUCCEED);
					case ACCEPT_PENDING:
						getAppController().getContextDataController().setElement(INFO_TITLE_TEXT, COMMON_TEXTS.common_email_sent_text());
						fireNavigationEvent(EVENT_SIGNUP_PENDING);
						break;
					default:
						getAppController().getContextDataController().setElement(INFO_TITLE_TEXT, COMMON_TEXTS.common_info_problem_text());
						fireErrorEvent(new RuntimeException(
								"Unknown NewUser creation result: " + result.toString())
								);
					}
				}
				
				@Override
				public void onError(Throwable th) {
					getView().errorCreatingUser();
				}
			});
		}
		// Once the data from appController was saved in the presenter, then it is removed.
		getAppController().getContextDataController().removeElement(BusinessSignUpPresenterConstants.SIGNUP_DATA);
	}

	private void skip() {
		int currentStep = getCurrentStepFromContext();
		setCurrentStep(currentStep + 1);
	}

	private void goNext() {
		int currentStep = getCurrentStepFromContext();
		if (currentStep == 1) {
			processStep1();
		} else if (currentStep == 2) {
			processLastStep();
		}
	}

	private void goBack() {
		int currentStep = getCurrentStepFromContext();
		setCurrentStep(currentStep - 1);
	}
}


