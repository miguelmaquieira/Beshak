package com.imotion.facturaqua.front.business.client.presenter.dashboard;

import com.imotion.facturaqua.bom.FACTBOIDataConstants;
import com.imotion.facturaqua.front.business.client.presenter.BusinessPresenterBaseConstants;
import com.selene.arch.exe.gwt.client.presenter.controller.AEGWTLoginAppControllerConstants;

public interface BusinessDashboardPresenterConstants extends BusinessPresenterBaseConstants {
					
	// Context Mapping in
	public static final String SESSION_USERNAME 				= AEGWTLoginAppControllerConstants.SESSION_USERNAME;
	public static final String SESSION_LAST_LOGIN 				= AEGWTLoginAppControllerConstants.SESSION_LAST_LOGIN;
	public static final String BUSINESS_NAME 					= FACTBOIDataConstants.BUSINESS_NAME;
	
	
		
	public static final String[] IN_MAPPING = { SESSION,
												BUSINESS,
												};

		
}
