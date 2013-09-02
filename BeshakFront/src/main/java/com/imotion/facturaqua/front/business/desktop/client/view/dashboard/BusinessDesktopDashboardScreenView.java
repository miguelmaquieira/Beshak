package com.imotion.facturaqua.front.business.desktop.client.view.dashboard;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;
import com.imotion.facturaqua.front.business.client.presenter.dashboard.BusinessDesktopDashboardDisplay;
import com.imotion.facturaqua.front.business.client.view.dashboard.I18NBusinessDashboardTexts;
import com.imotion.facturaqua.front.business.desktop.client.view.BusinessDesktopPanelLoggedView;
import com.imotion.facturaqua.front.business.desktop.client.view.widget.header.BusinessHeaderDesktopDeclarativeView;
import com.selene.arch.base.exe.core.appli.metadata.element.AEMFTMetadataElementComposite;
import com.selene.arch.exe.gwt.client.ui.header.AEGWTHeaderDisplay;

public class BusinessDesktopDashboardScreenView extends BusinessDesktopPanelLoggedView implements BusinessDesktopDashboardDisplay {

	public final static String 						NAME 				= "BusinessDashboardDesktopScreenView";
	public final static int							HELP_INDEX_SIZE		= 3;
	
	private static final I18NBusinessDashboardTexts DASHBOARD_TEXTS 	= GWT.create(I18NBusinessDashboardTexts.class);
	private static final Binder binder = GWT.create(Binder.class);
	
	interface Binder extends UiBinder<Widget, BusinessDesktopDashboardScreenView> {
	}
	
	//@UiField BusinessDesktopStatusWidgetPanel statusWidgetPanel;
	@UiField BusinessHeaderDesktopDeclarativeView header;

	public BusinessDesktopDashboardScreenView() {
		
		initWidget(binder.createAndBindUi(this));
		
		addStyleName("host-screenBody");
		addStyleName("host-screenBody-dashboard");
		setHeader(header);
		header.setComponentVisibility(AEGWTHeaderDisplay.LOGOUT_VISIBLE |
										AEGWTHeaderDisplay.LOGO_VISIBLE |
										AEGWTHeaderDisplay.HELP_VISIBLE |
										AEGWTHeaderDisplay.MORE_VISIBLE |
										AEGWTHeaderDisplay.USERNAME_VISIBLE);
		
	}

	@Override
	public void setData(AEMFTMetadataElementComposite data) {
		//statusWidgetPanel.setData(data);
	}

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public void postDisplay() {
		super.postDisplay();
		//statusWidgetPanel.postDisplay();
	}

	@Override
	public int getHelpStepSize() {
		return HELP_INDEX_SIZE;
	}

	@Override
	public String getHelpStreenTitle() {
		return DASHBOARD_TEXTS.main_screen_title_text();
	}
}
