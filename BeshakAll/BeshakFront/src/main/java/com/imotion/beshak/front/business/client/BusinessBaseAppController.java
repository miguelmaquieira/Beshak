package com.imotion.beshak.front.business.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window.Location;
import com.imotion.beshak.business.BSKBUIServiceConstant;
import com.imotion.beshak.front.business.client.presenter.BusinessPresenterBaseConstants;
import com.imotion.beshak.front.business.client.presenter.logout.BusinessLogoutPresenter;
import com.selene.arch.exe.gwt.client.common.AEGWTBaseAppContextMapper;
import com.selene.arch.exe.gwt.client.common.AEGWTMessageWrapper;
import com.selene.arch.exe.gwt.client.phonegap.AEGWTBasePhoneGapConstants;
import com.selene.arch.exe.gwt.client.presenter.controller.AEGWTControllerPresenter;
import com.selene.arch.exe.gwt.client.presenter.controller.AEGWTLoginAppController;
import com.selene.arch.exe.gwt.client.presenter.flow.AEGWTIFlowController;
import com.selene.arch.exe.gwt.mvp.AEGWTIPresenter;
import com.selene.arch.exe.gwt.mvp.context.ContextRetriever;

public abstract class BusinessBaseAppController extends AEGWTLoginAppController {

	private AEGWTIFlowController 			flowController;
	private AEGWTControllerPresenter 		presenterController;
	
	private AEGWTBaseAppContextMapper 		contextMapper;
	private BusinessMessageWrapper			messageWrapper;

	@Override
	protected String getModuleBaseUrl() {
		return GWT.getModuleBaseURL();
	}

	@Override
	public String getApplicationId() {
		return BusinessPresenterBaseConstants.APPLICATION_ID;
	}
	
	@Override
	public String getModuleId() {
		return null;
	}

	@Override
	protected AEGWTIPresenter getLogoutPresenter() {
		return new BusinessLogoutPresenter(null);
	}

	@Override
	public AEGWTMessageWrapper getMessages() {
		if (messageWrapper == null) {
			messageWrapper = new BusinessMessageWrapper();
		}
		return messageWrapper;
	}

	@Override
	public String getApplicationStoreName() {
		return BusinessBaseAppControllerConstants.BUSINESS_STORE;
	}

	@Override
	public AEGWTIFlowController getFlowController() {
		if (flowController == null) {
			flowController = createFlowController();
		}
		return flowController;
	}
	
	
	public String getBusinessLoginService() {
		return BSKBUIServiceConstant.CTE_SRV_BUSINESS_LOGIN_SERVICE_DEFAULT_IMPL;
	}

	@Override
	protected AEGWTControllerPresenter getControllerPresenter() {
		if (presenterController == null) {
			presenterController = createPresenterController();
		}
		return presenterController;
	}

	@Override
	protected String getServiceRelativeUrl() {
		return AEGWTBasePhoneGapConstants.CTE_PHONEGAP_RELATIVE_SERVICE_URL;
	}

	@Override
	protected ContextRetriever instantiateContextRetriever(final String retrieverId, final String arg) {
		ContextRetriever rc = null;

		
		return rc;
	}

	@Override
	protected AEGWTBaseAppContextMapper getContextMapper() {
		if (contextMapper == null) {
			contextMapper = createContextMapper();
		}
		return contextMapper;
	}

	@Override
	protected void redirectToWebVersion (WEB_VERSION webVersion) {
		String url = "";
		if (WEB_VERSION.TOUCH.equals(webVersion)) {
			url = BusinessBaseAppControllerConstants.TOUCH_URI;
		} else {
			url = BusinessBaseAppControllerConstants.DESKTOP_URI;
		}
		Location.assign(url);
	}

	/**********************************************************************
	 *                           PRIVATE FUNCTIONS
	 **********************************************************************/

}

