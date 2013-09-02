package com.imotion.facturaqua.front.business.desktop.client.flow;

import com.google.gwt.user.client.History;
import com.imotion.facturaqua.front.business.client.presenter.password.BusinessForgotPasswordPresenterConstants;
import com.imotion.facturaqua.front.business.client.presenter.password.BusinessResetPasswordPresenterConstants;
import com.imotion.facturaqua.front.business.desktop.client.view.widget.common.BusinessNotLoggedScreenContainer;
import com.selene.arch.exe.gwt.client.AEGWTHistoryNavigationConstants;
import com.selene.arch.exe.gwt.client.presenter.base.AEGWTBasePresenterConstants;
import com.selene.arch.exe.gwt.client.presenter.controller.AEGWTControllerPresenterConstants;
import com.selene.arch.exe.gwt.client.presenter.controller.AEGWTLoginAppControllerConstants;
import com.selene.arch.exe.gwt.client.presenter.flow.AEGWTBaseFlowController;
import com.selene.arch.exe.gwt.client.presenter.info.AEGWTInfoPresenterConstants;
import com.selene.arch.exe.gwt.client.presenter.login.AEGWTLoginPresenterConstants;
import com.selene.arch.exe.gwt.mvp.AEGWTCompositePanelViewDisplay;
import com.selene.arch.exe.gwt.mvp.AEGWTIPresenter;
import com.selene.arch.exe.gwt.mvp.event.flow.AEGWTFlowEvent;


public class BusinessDesktopAppFlowController extends AEGWTBaseFlowController {

	public static final String NAME = "BusinessDesktopAppFlowController";

	public BusinessDesktopAppFlowController(AEGWTIPresenter presenter, AEGWTCompositePanelViewDisplay display) {
		super(display);
		initialize(presenter);
	}

	@Override
	public void dispatchEvent(AEGWTFlowEvent evt) {
		boolean processed = false;

		processed = processHeaderEvent(evt);
		processed = processQuickAccessButton(evt);

		String sourceWindow = evt.getSourceWindow();
		getAppController().setPreviousWindowName(sourceWindow);
		if (!processed) {
			if (AEGWTLoginPresenterConstants.NAME.equals(sourceWindow) || AEGWTControllerPresenterConstants.NAME.equals(sourceWindow)) {
				loginScreenProcessFlowEvent(evt);
				
			} else if (AEGWTLoginAppControllerConstants.NAME.equals(sourceWindow)) {
				appControlerProcessFlowEvent(evt);

			} else if (AEGWTInfoPresenterConstants.NAME.equals(sourceWindow)) {
				infoProcessFlowEvent(evt);

			} else if (BusinessNotLoggedScreenContainer.NAME.equals(evt.getSourceWidget())) {
				History.newItem("");
				
			}  else if (BusinessResetPasswordPresenterConstants.NAME.equals(evt.getSourceWidget())) {
				History.newItem("");
				
			} else if (BusinessForgotPasswordPresenterConstants.NAME.equals(evt.getSourceWidget())) {
				History.newItem(AEGWTHistoryNavigationConstants.TOKEN_INFO_MESSAGE);
				
			}
		}
	}

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	protected void bind() {
		// nothing to do
	}

	/**********************************************************************
	 *                           PRIVATE FUNCTIONS
	 **********************************************************************/


	private void infoProcessFlowEvent(AEGWTFlowEvent evt) {
		if (AEGWTInfoPresenterConstants.EVENT_HOME_BUTTON.equals(evt.getSourceWidget())) {
			History.newItem("");
		}
	}

	private void appControlerProcessFlowEvent(AEGWTFlowEvent evt) {
		if (AEGWTLoginAppControllerConstants.EVENT_INIT_APP.equals(evt.getSourceWidget())) {
			History.newItem(AEGWTHistoryNavigationConstants.TOKEN_INIT_APP);
		} else if (AEGWTLoginAppControllerConstants.EVENT_INIT_MAIN_SCREEN.equals(evt.getSourceWidget())) {
			History.newItem(AEGWTHistoryNavigationConstants.TOKEN_DASHBOARD);
		} else if (AEGWTLoginAppControllerConstants.EVENT_LOGIN.equals(evt.getSourceWidget())) {
			History.newItem(AEGWTHistoryNavigationConstants.TOKEN_LOGIN_APP);
		}
	}

	private void loginScreenProcessFlowEvent(AEGWTFlowEvent evt) {
		if (AEGWTLoginPresenterConstants.EVENT_LOGIN.equals(evt.getSourceWidget())) {
			History.newItem(AEGWTHistoryNavigationConstants.TOKEN_LOGIN);
		} else if (AEGWTLoginPresenterConstants.EVENT_REGISTER.equals(evt.getSourceWidget())) {
			History.newItem(AEGWTHistoryNavigationConstants.TOKEN_SIGN_UP);
		} else if (AEGWTLoginPresenterConstants.EVENT_FORGOT_PASSWORD.equals(evt.getSourceWidget())) {
			History.newItem(AEGWTHistoryNavigationConstants.TOKEN_PASSWORD_FORGOT);
		} else if (AEGWTLoginPresenterConstants.EVENT_RESET_PASSWORD.equals(evt.getSourceWidget())) {
			History.newItem(AEGWTHistoryNavigationConstants.TOKEN_PASSWORD_RESET);
		} else if (AEGWTLoginPresenterConstants.EVENT_SUBSCRIPTION_DONE.equals(evt.getSourceWidget())) {
			History.newItem(AEGWTHistoryNavigationConstants.TOKEN_INFO_MESSAGE);
		}
	}

	private boolean processHeaderEvent(AEGWTFlowEvent evt){
		boolean processed = false;
		if (AEGWTBasePresenterConstants.EVENT_LOGOUT.equals(evt.getSourceWidget())) {
			processed = true;
			History.newItem(AEGWTLoginAppControllerConstants.TOKEN_LOGOUT);
		} else if (AEGWTBasePresenterConstants.EVENT_HOME.equals(evt.getSourceWidget())) {
			processed = true;
			History.newItem(AEGWTHistoryNavigationConstants.TOKEN_DASHBOARD);
		} else if (AEGWTBasePresenterConstants.EVENT_USERNAME.equals(evt.getSourceWidget())) {
			processed = true;
			History.newItem(AEGWTHistoryNavigationConstants.TOKEN_DASHBOARD);
		} else if (AEGWTBasePresenterConstants.EVENT_FEEDBACK.equals(evt.getSourceWidget())) {
			processed = true;
			History.newItem(AEGWTHistoryNavigationConstants.TOKEN_FEEDBACK);
		} else if (AEGWTBasePresenterConstants.EVENT_BACK.equals(evt.getSourceWidget())) {
			processed = true;
			History.back();
		}
		return processed;
	}
	
	private boolean processQuickAccessButton(AEGWTFlowEvent evt) {
		return false;
	}
}
