package com.imotion.beshak.front.business.touch.client.flow;

import com.google.gwt.user.client.History;
import com.imotion.beshak.front.business.client.presenter.dashboard.BusinessTouchDashboardPresenter;
import com.imotion.beshak.front.business.client.presenter.login.BusinessLoginPresenterConstants;
import com.selene.arch.exe.gwt.client.AEGWTHistoryNavigationConstants;
import com.selene.arch.exe.gwt.client.presenter.base.AEGWTBasePresenterConstants;
import com.selene.arch.exe.gwt.client.presenter.controller.AEGWTControllerPresenterConstants;
import com.selene.arch.exe.gwt.client.presenter.controller.AEGWTLoginAppControllerConstants;
import com.selene.arch.exe.gwt.client.presenter.flow.AEGWTBaseFlowController;
import com.selene.arch.exe.gwt.client.presenter.login.AEGWTLoginPresenterConstants;
import com.selene.arch.exe.gwt.mvp.AEGWTCompositePanelViewDisplay;
import com.selene.arch.exe.gwt.mvp.AEGWTIPresenter;
import com.selene.arch.exe.gwt.mvp.event.flow.AEGWTFlowEvent;

public class BusinessTouchAppFlowController extends AEGWTBaseFlowController {
	
	public static final String NAME = "BusinessTouchAppFlowController";
	
	public BusinessTouchAppFlowController(AEGWTIPresenter presenter, AEGWTCompositePanelViewDisplay display) {
		super(display);
		initialize(presenter);
	}

	@Override
	public void dispatchEvent(AEGWTFlowEvent evt) {
		boolean processed = false;

		processed = processHeaderEvent(evt);
		processed = processQuickAccessButton(evt);
		
		String sourceWindow = evt.getSourceWindow();
		
		if (!processed) {
			if (AEGWTLoginPresenterConstants.NAME.equals(sourceWindow) || AEGWTControllerPresenterConstants.NAME.equals(sourceWindow)) {
				loginScreenProcessFlowEvent(evt);
				
			} else if (AEGWTLoginAppControllerConstants.NAME.equals(sourceWindow)) {
				appControlerProcessFlowEvent(evt);
			} else if (BusinessTouchDashboardPresenter.NAME.equals(sourceWindow)) {
				dashBoardProcessFlowEvent(evt);
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

	private boolean processHeaderEvent(AEGWTFlowEvent evt){
		String sourceWidget = evt.getSourceWidget();
		boolean processed = false;
		if (AEGWTBasePresenterConstants.EVENT_LOGOUT.equals(sourceWidget)) {
			processed = true;
			History.newItem(AEGWTLoginAppControllerConstants.TOKEN_LOGOUT);
			
		} else if (AEGWTBasePresenterConstants.EVENT_HOME.equals(sourceWidget)) {
			processed = true;
			History.newItem(AEGWTHistoryNavigationConstants.TOKEN_DASHBOARD);
			
		} else if (AEGWTBasePresenterConstants.EVENT_USERNAME.equals(sourceWidget)) {
			processed = true;
			History.newItem(AEGWTHistoryNavigationConstants.TOKEN_DASHBOARD);
			
		} else if (AEGWTBasePresenterConstants.EVENT_FEEDBACK.equals(sourceWidget)) {
			processed = true;
			History.newItem(AEGWTHistoryNavigationConstants.TOKEN_FEEDBACK);
			
		} else if (AEGWTBasePresenterConstants.EVENT_BACK.equals(sourceWidget)) {
			processed = true;
			History.back();
		}
		return processed;
	}
	
	private void appControlerProcessFlowEvent(AEGWTFlowEvent evt) {
		String sourceWidget = evt.getSourceWidget();
		
		if (AEGWTLoginAppControllerConstants.EVENT_INIT_APP.equals(sourceWidget)) {
			History.newItem(AEGWTHistoryNavigationConstants.TOKEN_INIT_APP);
			
		} else if (AEGWTLoginAppControllerConstants.EVENT_INIT_MAIN_SCREEN.equals(sourceWidget)) {
			History.newItem(AEGWTHistoryNavigationConstants.TOKEN_DASHBOARD);
			
		} else if (AEGWTLoginAppControllerConstants.EVENT_LOGIN.equals(sourceWidget)) {
			History.newItem(AEGWTHistoryNavigationConstants.TOKEN_LOGIN_APP);
		}
	}
	
	private void loginScreenProcessFlowEvent(AEGWTFlowEvent evt) {
		String sourceWidget = evt.getSourceWidget();
		
		if (AEGWTLoginPresenterConstants.EVENT_LOGIN.equals(sourceWidget)) {
			History.newItem(AEGWTHistoryNavigationConstants.TOKEN_LOGIN);
			
		} else if (AEGWTLoginPresenterConstants.EVENT_REGISTER.equals(sourceWidget)) {
			History.newItem(AEGWTHistoryNavigationConstants.TOKEN_SIGN_UP);
			
		} else if (AEGWTLoginPresenterConstants.EVENT_FORGOT_PASSWORD.equals(sourceWidget)) {
			History.newItem(AEGWTHistoryNavigationConstants.TOKEN_PASSWORD_FORGOT);
			
		} else if (AEGWTLoginPresenterConstants.EVENT_RESET_PASSWORD.equals(sourceWidget)) {
			History.newItem(AEGWTHistoryNavigationConstants.TOKEN_PASSWORD_RESET);
			
		} else if (BusinessLoginPresenterConstants.EVENT_BUSINESS_SUBSCRIPTION_DONE.equals(sourceWidget)) {
			History.newItem(AEGWTHistoryNavigationConstants.TOKEN_INFO_MESSAGE);
		}
	}
	
	private void dashBoardProcessFlowEvent(AEGWTFlowEvent evt) {
		
	}

	private boolean processQuickAccessButton(AEGWTFlowEvent evt) {
		return false;
	}

}
