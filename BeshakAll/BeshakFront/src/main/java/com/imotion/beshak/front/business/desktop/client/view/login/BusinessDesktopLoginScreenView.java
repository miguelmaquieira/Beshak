package com.imotion.beshak.front.business.desktop.client.view.login;

import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.imotion.beshak.front.business.client.presenter.login.BusinessLoginDisplay;
import com.imotion.beshak.front.business.desktop.client.view.BusinessDesktopPanelView;
import com.imotion.beshak.front.business.desktop.client.view.widget.common.BusinessNotLoggedScreenContainer;
import com.selene.arch.base.exe.core.appli.metadata.element.AEMFTMetadataElementComposite;
import com.selene.arch.exe.gwt.client.ui.widget.login.AEGWTLoginForm;
import com.selene.arch.exe.gwt.client.ui.widget.login.AEGWTLoginFormDisplay.ERRORS;

public class BusinessDesktopLoginScreenView extends BusinessDesktopPanelView implements BusinessLoginDisplay {

	private static final String 						NAME 				= "BusinessClaimDesktopScreenView";

	private AEGWTLoginForm 						loginForm;

	public BusinessDesktopLoginScreenView() {

		// VerticalPanel containing all
		VerticalPanel contentPanel = new VerticalPanel();
		contentPanel.setWidth("100%");
		initContentPanel(contentPanel);

		// Login form
		loginForm = new AEGWTLoginForm();
		loginForm.setWidth("350px");
		loginForm.addStyleName("busi-loginFormContainer");

		BusinessNotLoggedScreenContainer screenContainer = new BusinessNotLoggedScreenContainer();
		screenContainer.add(loginForm);
		screenContainer.setContentSize("100%","450px");
		contentPanel.add(screenContainer);
	}

	@Override
	public void setData(AEMFTMetadataElementComposite data) {
		// nothing to do
	}

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public void postDisplay() {
		this.loginForm.setFocus();
	}

	@Override
	public HasClickHandlers getSignInButton() {
		return this.loginForm.getLoginAction();
	}

	@Override
	public HasClickHandlers getAnchorForgotPassword() {
		return this.loginForm.getForgotPasswordAction();
	}

	@Override
	public String getCredentials() {
		return this.loginForm.getCredentials();
	}

	@Override
	public String getPassword() {
		return this.loginForm.getPassword();
	}

	@Override
	public void manageErrors(ERRORS[] errors) {
		this.loginForm.manageValidationError(errors);
	}

	@Override
	public void clearValidation() {
		this.loginForm.clearValidation();
	}
}
