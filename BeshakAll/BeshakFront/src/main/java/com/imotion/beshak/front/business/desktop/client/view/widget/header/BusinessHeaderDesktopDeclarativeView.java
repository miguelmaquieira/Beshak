package com.imotion.beshak.front.business.desktop.client.view.widget.header;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;
import com.selene.arch.base.exe.core.appli.metadata.element.AEMFTMetadataElementComposite;
import com.selene.arch.exe.gwt.client.ui.header.AEGWTHeaderDisplay;
import com.selene.arch.exe.gwt.client.ui.widget.anchor.AEGWTAnchor;
import com.selene.arch.exe.gwt.client.ui.widget.anchor.AEGWTImageAnchor;
import com.selene.arch.exe.gwt.client.view.header.AEGWTHeaderDeclarativeActionsView;

public class BusinessHeaderDesktopDeclarativeView extends AEGWTHeaderDeclarativeActionsView {

	public static final String 					NAME 		= "BusinessHeaderDesktopDeclarativeView";

	private static final Binder binder = GWT.create(Binder.class);

	interface Binder extends UiBinder<Widget, BusinessHeaderDesktopDeclarativeView> {
	}

	@UiField AEGWTImageAnchor 	logout;
	@UiField AEGWTImageAnchor 	help;
	@UiField AEGWTImageAnchor 	back;
	@UiField AEGWTImageAnchor 	more;
	@UiField AEGWTImageAnchor 	logo;
	@UiField AEGWTAnchor 		username;

	public BusinessHeaderDesktopDeclarativeView() {
		initWidget(binder.createAndBindUi(this));
		username.setMaxWidth(150);
		setNumberOfThreads(0);
		initTimer();
	}

	@Override
	public void setUsername(String user) {
		username.setText(user);
	}

	@Override
	public HasClickHandlers getAnchorHelp() {
		return help;
	}

	@Override
	public HasClickHandlers getAnchorLogout() {
		return logout;
	}

	@Override
	public HasClickHandlers getAnchorLogo() {
		return logo;
	}

	@Override
	public HasClickHandlers getAnchorUsername() {
		return username;
	}

	@Override
	public HasClickHandlers getAnchorBack() {
		return back;
	}
	
	@Override
	public HasClickHandlers getAnchorMore() {
		return more;
	}
	
	@Override
	public void setComponentVisibility(long visibilityCode) {
		username.setVisible((visibilityCode & AEGWTHeaderDisplay.USERNAME_VISIBLE) == AEGWTHeaderDisplay.USERNAME_VISIBLE);
		logo.setVisible(	(visibilityCode & AEGWTHeaderDisplay.LOGO_VISIBLE) 	== AEGWTHeaderDisplay.LOGO_VISIBLE);
		back.setVisible(	(visibilityCode & AEGWTHeaderDisplay.BACK_VISIBLE) 	== AEGWTHeaderDisplay.BACK_VISIBLE);
		more.setVisible(	(visibilityCode & AEGWTHeaderDisplay.MORE_VISIBLE) 	== AEGWTHeaderDisplay.MORE_VISIBLE);
		help.setVisible(	(visibilityCode & AEGWTHeaderDisplay.HELP_VISIBLE) 	== AEGWTHeaderDisplay.HELP_VISIBLE);
		logout.setVisible(	(visibilityCode & AEGWTHeaderDisplay.LOGOUT_VISIBLE) 	== AEGWTHeaderDisplay.LOGOUT_VISIBLE);
	}

	@Override
	public void setData(AEMFTMetadataElementComposite data) {
		// Nothing to do
	}

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public void setLogo(String imageUrlLogo) {
		logo.setImageUrl(imageUrlLogo);
		logo.setImageOverUrl(imageUrlLogo);
	}
	
	/**********************************************************************
	 * 							PRIVATE FUNCTIONS
	 **********************************************************************/
}
