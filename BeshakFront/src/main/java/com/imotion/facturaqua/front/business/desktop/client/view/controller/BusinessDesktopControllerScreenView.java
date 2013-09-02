package com.imotion.facturaqua.front.business.desktop.client.view.controller;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Widget;
import com.imotion.facturaqua.front.business.client.presenter.controller.BusinessControllerDisplay;
import com.imotion.facturaqua.front.business.desktop.client.view.BusinessDesktopPanelView;
import com.selene.arch.base.exe.core.appli.metadata.element.AEMFTMetadataElementComposite;
import com.selene.arch.exe.gwt.client.ui.widget.image.AEGWTImageContainer;

public class BusinessDesktopControllerScreenView extends BusinessDesktopPanelView implements BusinessControllerDisplay {

	public static String 		NAME	= "BusinessDesktopControllerScreenView";

	private static final Binder binder 	= GWT.create(Binder.class);

	@UiField Anchor 				showLogin;
	@UiField Anchor 				createAccount;
	@UiField AEGWTImageContainer 	progressContainer;

	interface Binder extends UiBinder<Widget, BusinessDesktopControllerScreenView> {
	}

	public BusinessDesktopControllerScreenView() {
		initWidget(binder.createAndBindUi(this));
	}
	
	@Override
	public void showSubscriptionPopup() {
		
	}

	@Override
	public HasClickHandlers getSubscribeButton() {
		return null;
	}
	
	@Override
	public HasClickHandlers getAnchorLogin() {
		return showLogin;
	}
	
	@Override
	public HasClickHandlers getAnchorCreateAccount() {
		return createAccount;
	}

	@Override
	public String getSubscriberEmail() {
		return null;
	}

	@Override 
	public void invalidSubscriberEmail() {
		
	}
	
	@Override
	public void setData(AEMFTMetadataElementComposite data) {
		// TODO Auto-generated method stub
	}

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public void postDisplay() {
		if (progressContainer != null) {
			progressContainer.setVisible(false);
		}
	}
	
	/************************************************************************
	 *                        PRIVATE FUNCTIONS
	 ************************************************************************/
	
}
