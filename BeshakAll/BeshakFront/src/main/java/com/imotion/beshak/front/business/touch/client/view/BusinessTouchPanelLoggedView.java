package com.imotion.beshak.front.business.touch.client.view;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.imotion.beshak.front.business.client.presenter.BusinessTouchScreenViewLoggedDisplay;
import com.imotion.beshak.front.business.touch.client.view.widget.header.BusinessHeaderTouchDeclarativeView;
import com.selene.arch.exe.gwt.client.ui.header.AEGWTHeaderDisplay;
import com.selene.arch.exe.gwt.client.ui.header.AEGWTIHeader;
import com.selene.arch.exe.gwt.client.view.AEGWTCompositeTouchPanelLoggedView;

public abstract class BusinessTouchPanelLoggedView extends AEGWTCompositeTouchPanelLoggedView implements BusinessTouchScreenViewLoggedDisplay {


	@Override
	public void initContentPanel(HasWidgets contentPanel) {
		// Declarative Header
		AEGWTIHeader  headerView = createHeaderView();
		createScreenBodyContainer((Widget) contentPanel);

		initContentPanel(contentPanel, (Widget)headerView);
	}

	@Override
	protected AEGWTIHeader createHeaderView() {
		AEGWTHeaderDisplay header = new BusinessHeaderTouchDeclarativeView();
		header.setComponentVisibility(AEGWTHeaderDisplay.LOGO_VISIBLE |
										AEGWTHeaderDisplay.LOGOUT_VISIBLE |
										AEGWTHeaderDisplay.USERNAME_VISIBLE |
										AEGWTHeaderDisplay.BACK_VISIBLE);
		return header;
	}
	
	/*******************************************************************
	 *                        PRIVATE FUNCTIONS						   *
	 *******************************************************************/
	
	private void createScreenBodyContainer(Widget contentPanel) {
		SimplePanel div = new SimplePanel();
		div.setStyleName("fact-touch-sreenBodyContainer");
		div.setWidget(contentPanel);
		contentPanel.addStyleName("fact-touch-screenBody");
	}
}
