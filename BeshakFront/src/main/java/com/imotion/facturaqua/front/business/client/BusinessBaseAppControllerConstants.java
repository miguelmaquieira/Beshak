package com.imotion.facturaqua.front.business.client;

import com.selene.arch.base.exe.core.common.AEMFTICommonConstants;
import com.selene.arch.exe.gwt.client.presenter.info.AEGWTInfoPresenterConstants;

public interface BusinessBaseAppControllerConstants {

	// Other data
	public static final String BUSINESS 							= "BUSINESS";
	public static final String BUSINESS_PREFIX 						= BUSINESS +  AEMFTICommonConstants.CTE_MFT_AE_CORE_COMM_ELEMENT_SEPARATOR;


	//Info
	public static final String INFO_TITLE_TEXT 							= AEGWTInfoPresenterConstants.DATA_IN_TITLE_TEXT;
	public static final String INFO_DESCRIPTION_TEXT 					= AEGWTInfoPresenterConstants.DATA_IN_DESCRIPTION_TEXT;
	public static final String INFO_IMAGE_ICON_URL 						= AEGWTInfoPresenterConstants.DATA_IN_DESCRIPTION_TEXT;
	
	//URLS
	public static final String DESKTOP_URI								= "BusinessDesktopModule.jsp";
	public static final String TOUCH_URI								= "BusinessTouchModule.jsp";
	public static final String DESKTOP_URI_DEV							= "BusinessDesktopModule.jsp?gwt.codesvr=127.0.0.1:9997";
	public static final String TOUCH_URI_DEV							= "BusinessTouchModule.jsp?gwt.codesvr=127.0.0.1:9997";
	
	// STORE
	public static final String BUSINESS_STORE 							= "BUSINESS_STORE";
}
