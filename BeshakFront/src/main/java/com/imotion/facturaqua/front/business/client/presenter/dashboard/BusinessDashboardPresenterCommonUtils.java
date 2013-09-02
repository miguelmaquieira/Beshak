package com.imotion.facturaqua.front.business.client.presenter.dashboard;

import com.imotion.facturaqua.front.business.client.presenter.BusinessPresenterCommonUtilsBase;
import com.imotion.facturaqua.front.business.client.presenter.base.BusinessBaseLoggedPresenter;
import com.selene.arch.exe.gwt.client.presenter.base.AEGWTBasePresenter;
import com.selene.arch.exe.gwt.mvp.AEGWTCompositePanelViewDisplay;
import com.selene.arch.exe.gwt.mvp.event.logic.AEGWTHasLogicalEventHandlers;
import com.selene.arch.exe.gwt.mvp.event.logic.AEGWTLogicalEvent;
import com.selene.arch.exe.gwt.mvp.event.logic.AEGWTLogicalEventTypes.LOGICAL_TYPE;


public class BusinessDashboardPresenterCommonUtils extends BusinessPresenterCommonUtilsBase implements BusinessDashboardPresenterConstants, AEGWTHasLogicalEventHandlers {

	private BusinessBaseLoggedPresenter<?> 	presenter;
	private BusinessDashboardDisplay 		view;
	private boolean 						businessAvaliable;

	@SuppressWarnings("unused")
	private BusinessDashboardPresenterCommonUtils() {
		// 
	}

	public BusinessDashboardPresenterCommonUtils(BusinessBaseLoggedPresenter<?> presenter, BusinessDashboardDisplay view) {
		this.presenter 	= presenter;
		this.view		= view;
	}

	public boolean isBusinessAvailable() {
		return businessAvaliable;
	}

	public void setBusinessAvailable(boolean businessAvailable) {
		this.businessAvaliable = businessAvailable;
	}

	@Override
	public void dispatchEvent(AEGWTLogicalEvent evt) {
		/*String widgetName = evt.getSourceWidget();
		String widgetSourceId = evt.getSourceWidgetId();*/
	}

	@Override
	public boolean isDispatchEventType(LOGICAL_TYPE type) {
		return 	LOGICAL_TYPE.CHANGE_EVENT.equals(type)
				|| LOGICAL_TYPE.ADD_EVENT.equals(type)
				|| LOGICAL_TYPE.NEW_EVENT.equals(type); 
	}
	
	@Override
	protected AEGWTBasePresenter<?> getPresenter() {
		return presenter;
	}

	@Override
	protected AEGWTCompositePanelViewDisplay getView() {
		return view;
	}

	/********************************************************************
	 *                        PRIVATE FUNCTION
	 ********************************************************************/
}
