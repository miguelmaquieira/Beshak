package com.imotion.facturaqua.front.business.client.presenter.dashboard;

import com.imotion.facturaqua.front.business.client.presenter.base.BusinessDesktopBasePresenter;
import com.selene.arch.base.exe.core.appli.metadata.element.AEMFTMetadataElementComposite;

public class BusinessDesktopDashboardPresenter extends BusinessDesktopBasePresenter<BusinessDesktopDashboardDisplay> implements BusinessDashboardPresenterConstants {

	public static final String NAME = "BusinessDesktopDashboardPresenter";
	
	private BusinessDashboardPresenterCommonUtils common;

	public BusinessDesktopDashboardPresenter(BusinessDesktopDashboardDisplay dashboardView) {
		super(dashboardView);
	}

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	protected void bind() {
		initWidgets();
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
		AEMFTMetadataElementComposite data 	= getContextDataController().getContext();
		if (data != null) {
			getView().setData(data);
		} else {
			String username = getContextDataController().getElementAsString(SESSION_USERNAME);
			loadBusinessesData(username);
		}
	}

	private void loadBusinessesData(final String username) {

	}
		
}
