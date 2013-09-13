package com.imotion.beshak.front.business.desktop.client.view.signup;

import java.util.ArrayList;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.DeckPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.imotion.beshak.front.business.client.presenter.signup.BusinessDesktopSignUpDisplay;
import com.imotion.beshak.front.business.desktop.client.view.BusinessDesktopPanelView;
import com.imotion.beshak.front.business.desktop.client.view.widget.common.BusinessNotLoggedScreenContainer;
import com.selene.arch.base.exe.core.appli.metadata.element.AEMFTMetadataElementComposite;
import com.selene.arch.exe.gwt.client.business.ui.widget.signup.AEGWTBusinessDesktopSignUpInfoForm;
import com.selene.arch.exe.gwt.client.business.ui.widget.signup.AEGWTBusinessDesktopSignUpTermsForm;
import com.selene.arch.exe.gwt.client.common.AEGWTI18NCommonMessageKeys;
import com.selene.arch.exe.gwt.client.common.AEGWTMessageWrapper.MESSAGE_VIEW_TYPE;
import com.selene.arch.exe.gwt.client.ui.widget.signup.AEGWTDesktopStepsTourContainer;
import com.selene.arch.exe.gwt.client.view.signup.AEGWTI18NSignUpTexts;

public class BusinessDesktopSignUpScreenView extends BusinessDesktopPanelView implements BusinessDesktopSignUpDisplay {

	private static final String 					NAME 			= "BusinessDesktopSignUpScreenView";
	private static final AEGWTI18NSignUpTexts		SIGNUP_TEXTS 	= GWT.create(AEGWTI18NSignUpTexts.class);
	
	private 	AEGWTDesktopStepsTourContainer 		stepWidget;
	private 	AEGWTBusinessDesktopSignUpInfoForm 	formStep1;
	private		AEGWTBusinessDesktopSignUpTermsForm formLastStep;
	private 	DeckPanel 							formSwitch;

	public BusinessDesktopSignUpScreenView() {

		// VerticalPanel containing all
		VerticalPanel contentPanel = new VerticalPanel();
		contentPanel.setWidth("100%");
		initContentPanel(contentPanel);	

		ArrayList<String> stepsTittles = new ArrayList<String>();
		stepsTittles.add(SIGNUP_TEXTS.step_personal_info_text());
		stepsTittles.add(SIGNUP_TEXTS.step_acceptTerms_text());


		ArrayList<String> stepsDescriptions = new ArrayList<String>();
		stepsDescriptions.add(SIGNUP_TEXTS.personal_info_descriptionLabel_text());
		stepsDescriptions.add(SIGNUP_TEXTS.step_acceptTerms_descLabel_text());

		String claimImagesPath = "images/claim/"; 
		ArrayList<String> stepsEnabledImageUrlList = new ArrayList<String>();
		stepsEnabledImageUrlList.add(claimImagesPath + "1on.png");
		stepsEnabledImageUrlList.add(claimImagesPath + "2on.png");
		
		ArrayList<String> stepsDisabledImageUrlList = new ArrayList<String>();
		stepsDisabledImageUrlList.add(claimImagesPath + "1off.png");
		stepsDisabledImageUrlList.add(claimImagesPath + "2off.png");

		stepWidget = new  AEGWTDesktopStepsTourContainer(true, SIGNUP_TEXTS.label_title_text(), SIGNUP_TEXTS.label_title_text(), stepsTittles, stepsDescriptions, stepsEnabledImageUrlList, stepsDisabledImageUrlList);
		
		VerticalPanel contentForStepsTour = new VerticalPanel();
		contentForStepsTour.setWidth("100%");

		formSwitch = new DeckPanel();
		formStep1 = new AEGWTBusinessDesktopSignUpInfoForm (stepWidget);
		formSwitch.add(formStep1);
		
		formLastStep = new AEGWTBusinessDesktopSignUpTermsForm(stepWidget);
		formLastStep.setTerms(SIGNUP_TEXTS.terms_and_conditions_content_text());
		formSwitch.add(formLastStep);

		contentForStepsTour.add(formSwitch);

		stepWidget.setContent(contentForStepsTour);
		stepWidget.setContentHeight("350px");
		BusinessNotLoggedScreenContainer sreenContainer = new BusinessNotLoggedScreenContainer();
		sreenContainer.add(stepWidget);
		contentPanel.add(sreenContainer);
		
		setCurrentStep(0);
	}


	@Override
	public void setData(AEMFTMetadataElementComposite data) {
		// nothing to do
	}

	@Override
	public void setCurrentStep(int currentStep) {
		if (currentStep > stepWidget.getCurrentStep()) {
			stepWidget.nextStep();
		} else if (currentStep < stepWidget.getCurrentStep()) {
			stepWidget.backStep();
		}

		switch (currentStep) {
		case 1:
			formSwitch.showWidget(0);
			stepWidget.setCurrentForm(formStep1);
			stepWidget.initFormValidation();
			stepWidget.setVisibleSkipButton(false);
			formStep1.setFocus();
			break;
		case 2:
			formSwitch.showWidget(1);
			stepWidget.setCurrentForm(formLastStep);
			stepWidget.initFormValidation();
			stepWidget.setVisibleSkipButton(false);
			formLastStep.setFocus();
			break;
		}
	}

	@Override
	public String getName() {
		return NAME;
	}
	
	@Override
	public String getUserEmail() {
		return formStep1.getUserNameEmail();
	}


	@Override
	public String getUserName() {
		return formStep1.getUserNameEmail();
	}
	
	@Override
	public String getUserFirstName() {
		return formStep1.getUserFirstName();
	}
	
	@Override
	public String getUserLastName() {
		return formStep1.getUserLastName();
	}
	
	@Override
	public String getUserPhone() {
		return formStep1.getUserPhone();
	}
	
	@Override
	public String getPassword() {
		return formStep1.getPassword();
	}
	
	@Override
	public void invalidEmailTaken() {
		showMessageById(MESSAGE_VIEW_TYPE.POPUP_INFO, AEGWTI18NCommonMessageKeys.SAILOR_MSG_SIGNUP_EMAIL_OR_USERNAME_TAKEN_ERROR);
	}
	
	@Override
	public void invalidUsername() {
		showMessageById(MESSAGE_VIEW_TYPE.POPUP_INFO, AEGWTI18NCommonMessageKeys.SAILOR_MSG_SIGNUP_EMAIL_OR_USERNAME_TAKEN_ERROR);
	}
	
	
	@Override
	public void errorCreatingUser() {
		showMessageById(MESSAGE_VIEW_TYPE.POPUP_INFO, AEGWTI18NCommonMessageKeys.SAILOR_MSG_SIGNUP_CREATING_USER_ERROR);
	}
	
	@Override
	public void invalidCaptcha() {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void resetNewUserValidation() {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void postDisplay() {
		super.postDisplay();
	}
}
