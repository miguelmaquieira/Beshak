package com.imotion.beshak.front.business.client.presenter.dashboard;

import com.imotion.beshak.front.business.client.presenter.base.BusinessTouchBasePresenter;

public class BusinessTouchDashboardPresenter extends BusinessTouchBasePresenter<BusinessTouchDashboardDisplay> implements BusinessDashboardPresenterConstants {

	public static final String 					NAME = "BusinessTouchDashboardPresenter";
	
	private BusinessDashboardPresenterCommonUtils 	common;

	public BusinessTouchDashboardPresenter(BusinessTouchDashboardDisplay dashboardView) {
		super(dashboardView);
	}

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	protected void bind() {

		initWidgets();

		// Handler
		getLogicalEventHandlerManager().addLogicalEventHandler(getCommonPresenter());

	}

	@Override
	public String[] getInMapping() {
		return IN_MAPPING;
	}

	/********************************************************************
	 *                        PRIVATE FUNCTION
	 ********************************************************************/
	
	private BusinessDashboardPresenterCommonUtils getCommonPresenter() {
		if (common == null) {
			common = new BusinessDashboardPresenterCommonUtils(this, getView());
		}
		return common;
	}

	private void initWidgets() {
		// nothing to do
	}
}
