package com.imotion.beshak.front.business.desktop.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.imotion.beshak.front.business.client.presenter.BusinessDesktopScreenViewLoggedDisplay;
import com.imotion.beshak.front.business.client.presenter.BusinessPresenterBaseConstants;
import com.imotion.beshak.front.business.desktop.client.view.widget.header.BusinessHeaderDesktopDeclarativeView;
import com.imotion.beshak.front.common.client.I18NCommonTexts;
import com.selene.arch.exe.gwt.client.ui.header.AEGWTIHeader;
import com.selene.arch.exe.gwt.client.ui.widget.common.AEGWTIWidgetUtilsContant.SIZE;
import com.selene.arch.exe.gwt.client.ui.widget.composite.treelevel.AEGWTMenuNavigatorContainer;
import com.selene.arch.exe.gwt.client.ui.widget.popup.AEGWTPopup;
import com.selene.arch.exe.gwt.client.view.AEGWTCompositeDesktopPanelLoggedView;

public abstract class BusinessDesktopPanelLoggedView extends AEGWTCompositeDesktopPanelLoggedView implements BusinessDesktopScreenViewLoggedDisplay {
	
	private static final I18NCommonTexts 	COMMON_TEXTS 	= GWT.create(I18NCommonTexts.class);
	
	private AEGWTPopup 							menuPopup;
	
	@Override
	public void initContentPanel(HasWidgets contentPanel) {
		// Declarative Header
		AEGWTIHeader  headerView = createHeaderView();
		SimplePanel div = new SimplePanel();
		div.setStyleName("host-sreenBodyContainer");
		
		Widget contentPanelWidget = (Widget) contentPanel;
		div.add(contentPanelWidget);
		contentPanelWidget.addStyleName("host-screenBody");
		
		initContentPanel(contentPanel, (Widget)headerView);
	}
	
	@Override
	protected AEGWTMenuNavigatorContainer createMoreMenu() {
		
		AEGWTMenuNavigatorContainer menuNavigator = super.createMoreMenu();
		
		menuNavigator.addItem(COMMON_TEXTS.header_menu_blog_text(),
				"images/spechbubble_sq_line_icon_black-48.png",
				"images/spechbubble_sq_line_icon_white-48.png",
				"images/spechbubble_sq_line_icon_white-48.png",
				BusinessPresenterBaseConstants.BUSINESS_HEADER_MENU_BLOG_ID,
				SIZE.REGULAR);
		
		menuNavigator.addItem(COMMON_TEXTS.header_menu_feedback_text(),
				"images/lightbulb_icon_black-48.png",
				"images/lightbulb_icon_white-48.png",
				"images/lightbulb_icon_white-48.png",
				BusinessPresenterBaseConstants.BUSINESS_HEADER_MENU_FEEDBACK_ID,
				SIZE.REGULAR);
		
		menuNavigator.addItem(COMMON_TEXTS.header_menu_live_chat_service_text(),
				"images/spechbubble_2_icon_black-48.png",
				"images/spechbubble_2_icon_white-48.png",
				"images/spechbubble_2_icon_white-48.png",
				BusinessPresenterBaseConstants.BUSINESS_HEADER_MENU_LIVE_CHAT_SERVICE_ID,
				SIZE.REGULAR);
		
		int childCount = menuNavigator.getContentPanel().getWidgetCount();
		menuNavigator.setSize("160px", 45 * childCount + "px");
		getLogicalEventHandlerManager().addLogicalEventHandler(menuNavigator);
		return menuNavigator;
	}
	
	@Override
	protected AEGWTIHeader createHeaderView() {
		return new BusinessHeaderDesktopDeclarativeView();
	}
	
	@Override
	public void showHeaderDropDownMenu(final int leftPosition) {
		getPopupMenu().setPopupPositionAndShow(new PopupPanel.PositionCallback() {
			
			@Override
			public void setPosition(int offsetWidth, int offsetHeight) {
				int topPos = 50;
				int leftPos = leftPosition - getPopupMenu().getOffsetWidth() / 2 ;
				getPopupMenu().setPopupPosition(leftPos, topPos);
				
			}
		});
	}
	
	/****************************************************************************
	 *                          PRIVATE FUNCTIONS
	 ****************************************************************************/
	
	private AEGWTPopup getPopupMenu() {
		if (menuPopup == null) {
			menuPopup = new AEGWTPopup(true, this);
			menuPopup.addStyleName("host-businessHeaderPopupMenu");
			AEGWTMenuNavigatorContainer menu = createMoreMenu();
			menuPopup.setContentWidget(menu);
		}
		return menuPopup;
	}
}
