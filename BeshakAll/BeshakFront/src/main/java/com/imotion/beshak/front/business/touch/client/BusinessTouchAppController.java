package com.imotion.beshak.front.business.touch.client;


import com.imotion.beshak.front.business.client.BusinessBaseAppController;
import com.imotion.beshak.front.business.client.presenter.controller.BusinessControllerPresenter;
import com.imotion.beshak.front.business.client.presenter.login.BusinessLoginPresenter;
import com.imotion.beshak.front.business.touch.client.flow.BusinessTouchAppFlowController;
import com.imotion.beshak.front.business.touch.client.view.login.BusinessTouchLoginScreenView;
import com.selene.arch.base.exe.core.appli.metadata.element.AEMFTMetadataElement;
import com.selene.arch.base.exe.core.appli.metadata.element.AEMFTMetadataElementComposite;
import com.selene.arch.exe.gwt.client.AEGWTHistoryNavigationConstants;
import com.selene.arch.exe.gwt.client.business.ui.view.controller.AEGWTBusinessTouchControllerScreenView;
import com.selene.arch.exe.gwt.client.common.AEGWTBaseAppContextMapper;
import com.selene.arch.exe.gwt.client.presenter.base.AEGWTBasePresenter;
import com.selene.arch.exe.gwt.client.presenter.controller.AEGWTControllerPresenter;
import com.selene.arch.exe.gwt.client.presenter.error.AEGWTErrorDisplay;
import com.selene.arch.exe.gwt.client.presenter.flow.AEGWTIFlowController;
import com.selene.arch.exe.gwt.client.utils.AEGWTStringUtils;
import com.selene.arch.exe.gwt.mvp.AEGWTIPresenter;
import com.selene.arch.exe.gwt.mvp.context.ContextRetriever;

public class BusinessTouchAppController extends BusinessBaseAppController {

	@Override
	protected ContextRetriever instantiateContextRetriever(final String retrieverId, final String arg) {
		ContextRetriever rc = null;
		
		return rc;
	}
	
	@Override
	protected AEGWTErrorDisplay getErrorScreenView() {
		return null;
	}

	@Override
	public String getApplicationName() {
		return BusinessTouchAppConstants.APP_NAME;
	}

	@Override
	public void saveUserDataInClientStorage(AEMFTMetadataElementComposite result) {
		super.saveUserDataInClientStorage(result);
	}

	@Override
	public AEMFTMetadataElement getLoginDataRequested() {
		return null;
	}
	
	@Override
	protected AEGWTIFlowController createFlowController() {
		return new BusinessTouchAppFlowController(this, getView());
	}
	
	@Override
	protected AEGWTBaseAppContextMapper createContextMapper() {
		return new BusinessTouchAppContextMapper(this);
	}
	
	@Override
	protected AEGWTControllerPresenter createPresenterController() {
		return new BusinessControllerPresenter(new AEGWTBusinessTouchControllerScreenView());
	}
	
	@Override
	protected AEGWTIPresenter getPresenter(String[] tokenElements) {
		String token1 = tokenElements[0];
		if (AEGWTStringUtils.isEmptyString(token1)) {
			token1 = AEGWTHistoryNavigationConstants.TOKEN_DASHBOARD;
		}

		AEGWTBasePresenter<?> presenter = null;
		
		if (AEGWTHistoryNavigationConstants.TOKEN_LOGIN.equals(token1) || AEGWTHistoryNavigationConstants.TOKEN_LOGIN_APP.equals(token1)) {
			presenter = new BusinessLoginPresenter(new BusinessTouchLoginScreenView());
		} /*else if (BusinessBaseAppHistoryNavigationConstants.TOKEN_DASHBOARD.equals(token1)) {
			presenter = new BusinessTouchDashboardPresenter(new BusinessTouchDashboardScreenView());
		} */
		
		getContextMapper().inMapping(presenter);
		return presenter;
	}
	
	/**********************************************************************
	 *                           PRIVATE FUNCTIONS
	 **********************************************************************/
}

