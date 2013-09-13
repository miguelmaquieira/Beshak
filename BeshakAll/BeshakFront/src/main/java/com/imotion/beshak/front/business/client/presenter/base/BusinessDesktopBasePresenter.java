package com.imotion.beshak.front.business.client.presenter.base;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.imotion.beshak.front.business.client.presenter.BusinessDesktopScreenViewLoggedDisplay;
import com.imotion.beshak.front.business.client.presenter.BusinessPresenterBaseConstants;
import com.selene.arch.exe.gwt.client.ui.header.AEGWTHeaderDisplay;
import com.selene.arch.exe.gwt.client.ui.header.AEGWTIHeader;
import com.selene.arch.exe.gwt.client.ui.widget.composite.popup.AEGWTPopupNavigatorContainerTreeLevelMenu;
import com.selene.arch.exe.gwt.mvp.event.navigator.AEGWTHasNavigationEventHandlers;
import com.selene.arch.exe.gwt.mvp.event.navigator.AEGWTNavigationEvent;
import com.selene.arch.exe.gwt.mvp.event.navigator.AEGWTNavigationEventTypes.NAVIGATOR_TYPE;

public abstract class BusinessDesktopBasePresenter<T extends BusinessDesktopScreenViewLoggedDisplay> extends BusinessBaseLoggedPresenter<T>  implements AEGWTHasNavigationEventHandlers {

	public BusinessDesktopBasePresenter(T view) {
		super(view);
	}
	
	@Override
	protected void viewAdded() {
		super.viewAdded();
		getLogicalEventHandlerManager().addEventHandler(AEGWTHasNavigationEventHandlers.TYPE, this);
	}
	
	@Override
	protected void addHeaderEventHandlers() {
		super.addHeaderEventHandlers();
		final AEGWTIHeader header = getView().getHeader();
		if (header != null && (header instanceof AEGWTHeaderDisplay)) {
			AEGWTHeaderDisplay headerActions = (AEGWTHeaderDisplay) header;
			// Action More
			headerActions.getAnchorMore().addClickHandler(new ClickHandler() {
				
				@Override
				public void onClick(ClickEvent event) {
					getView().showHeaderDropDownMenu(event.getClientX());
				}
			});
		}
	}
	
	@Override
	public void dispatchEvent(AEGWTNavigationEvent evt) {
		super.dispatchEvent(evt);
		if (!evt.isStopPropagation()) {
			String sourceWidget = evt.getSourceWidget();
			String sourceWidgetId = evt.getSourceWidgetId();
			if (AEGWTPopupNavigatorContainerTreeLevelMenu.NAME.equals(sourceWidget)) {
				if (BusinessPresenterBaseConstants.BUSINESS_HEADER_MENU_FEEDBACK_ID.equals(sourceWidgetId)) {
					fireNavigationEvent(BusinessPresenterBaseConstants.EVENT_FEEDBACK);
				} else if (BusinessPresenterBaseConstants.BUSINESS_HEADER_MENU_BLOG_ID.equals(sourceWidgetId)) {
					fireNavigationEvent(BusinessPresenterBaseConstants.EVENT_BLOG);
				}
			}
		}
	}

	@Override
	public boolean isDispatchEventType(NAVIGATOR_TYPE type) {
		return type == NAVIGATOR_TYPE.ITEM_SELECTED;
	}
	
	/****************************************************************************
	 *                          PRIVATE FUNCTIONS
	 ****************************************************************************/
}
