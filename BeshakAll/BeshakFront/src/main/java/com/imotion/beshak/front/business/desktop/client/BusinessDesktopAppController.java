package com.imotion.beshak.front.business.desktop.client;


import com.imotion.beshak.front.business.client.BusinessBaseAppController;
import com.imotion.beshak.front.business.client.presenter.controller.BusinessControllerDisplay;
import com.imotion.beshak.front.business.client.presenter.controller.BusinessControllerPresenter;
import com.imotion.beshak.front.business.client.presenter.dashboard.BusinessDesktopDashboardPresenter;
import com.imotion.beshak.front.business.client.presenter.login.BusinessLoginPresenter;
import com.imotion.beshak.front.business.client.presenter.signup.BusinessDesktopSignUpPresenter;
import com.imotion.beshak.front.business.desktop.client.flow.BusinessDesktopAppFlowController;
import com.imotion.beshak.front.business.desktop.client.view.controller.BusinessDesktopControllerScreenView;
import com.imotion.beshak.front.business.desktop.client.view.dashboard.BusinessDesktopDashboardScreenView;
import com.imotion.beshak.front.business.desktop.client.view.info.BusinessDesktopInfoScreenView;
import com.imotion.beshak.front.business.desktop.client.view.login.BusinessDesktopLoginScreenView;
import com.imotion.beshak.front.business.desktop.client.view.signup.BusinessDesktopSignUpScreenView;
import com.selene.arch.base.exe.core.appli.metadata.element.AEMFTMetadataElement;
import com.selene.arch.base.exe.core.appli.metadata.element.AEMFTMetadataElementComposite;
import com.selene.arch.exe.gwt.client.AEGWTHistoryNavigationConstants;
import com.selene.arch.exe.gwt.client.common.AEGWTBaseAppContextMapper;
import com.selene.arch.exe.gwt.client.presenter.base.AEGWTBasePresenter;
import com.selene.arch.exe.gwt.client.presenter.controller.AEGWTControllerPresenter;
import com.selene.arch.exe.gwt.client.presenter.error.AEGWTErrorDisplay;
import com.selene.arch.exe.gwt.client.presenter.flow.AEGWTIFlowController;
import com.selene.arch.exe.gwt.client.utils.AEGWTStringUtils;
import com.selene.arch.exe.gwt.mvp.AEGWTIPresenter;
import com.selene.arch.exe.gwt.mvp.context.ContextRetriever;

public class BusinessDesktopAppController extends BusinessBaseAppController {

	@Override
	protected ContextRetriever instantiateContextRetriever(final String retrieverId, final String arg) {
		ContextRetriever rc = null;
		
		return rc;
	}
	
	@Override
	protected AEGWTErrorDisplay getErrorScreenView() {
		return new BusinessDesktopInfoScreenView(true);
	}

	@Override
	public String getApplicationName() {
		return BusinessDesktopAppConstants.APP_NAME;
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
		return new BusinessDesktopAppFlowController(this, getView());
	}
	
	@Override
	protected AEGWTBaseAppContextMapper createContextMapper() {
		return new BusinessDesktopAppContextMapper(this);
	}
	
	@Override
	protected AEGWTControllerPresenter createPresenterController() {
		return new BusinessControllerPresenter((BusinessControllerDisplay) new BusinessDesktopControllerScreenView());
	}
	
	@Override
	protected AEGWTIPresenter getPresenter(String[] tokenElements) {
		String token1 = tokenElements[0];
		if (AEGWTStringUtils.isEmptyString(token1)) {
			token1 = AEGWTHistoryNavigationConstants.TOKEN_DASHBOARD;
		}

		AEGWTBasePresenter<?> presenter = null;
		
		if (AEGWTHistoryNavigationConstants.TOKEN_LOGIN.equals(token1) || AEGWTHistoryNavigationConstants.TOKEN_LOGIN_APP.equals(token1)) {
			presenter = new BusinessLoginPresenter(new BusinessDesktopLoginScreenView());
		} else if (AEGWTHistoryNavigationConstants.TOKEN_DASHBOARD.equals(token1)) {
			presenter = new BusinessDesktopDashboardPresenter(new BusinessDesktopDashboardScreenView());
		} else if (isRegisterAllowed() && AEGWTHistoryNavigationConstants.TOKEN_SIGN_UP.equals(token1)) {
			presenter = new BusinessDesktopSignUpPresenter(new BusinessDesktopSignUpScreenView());
		}
		
		getContextMapper().inMapping(presenter);
		return presenter;
	}
	
	/**********************************************************************
	 *                           PRIVATE FUNCTIONS
	 **********************************************************************/
}

