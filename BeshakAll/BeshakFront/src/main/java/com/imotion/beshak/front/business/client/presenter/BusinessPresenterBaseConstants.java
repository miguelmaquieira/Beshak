package com.imotion.beshak.front.business.client.presenter;


import com.imotion.beshak.SAPPConstants;
import com.imotion.beshak.bom.SAPPBOIDataConstants;
import com.imotion.beshak.front.common.client.presenter.CommonPresenterBaseConstants;
import com.selene.arch.exe.gwt.client.presenter.controller.AEGWTLoginAppControllerConstants;

public interface BusinessPresenterBaseConstants extends CommonPresenterBaseConstants {
	
	public static final String APPLICATION_ID	= SAPPConstants.CTE_SAPP_APPLI_NAME;
	
	public static final String EVENT_BLOG			 			= "EVENT_BLOG";
	public static final String EVENT_CHAT			 			= "EVENT_CHAT";
	
	// SESSION
	public static final String SESSION 							= AEGWTLoginAppControllerConstants.SESSION;
	public static final String SESSION_USER_ID					= AEGWTLoginAppControllerConstants.SESSION_USER_ID;
	public static final String SESSION_USER_EMAIL				= AEGWTLoginAppControllerConstants.SESSION_EMAIL;
		
	// BUSINESS
	public static final String BUSINESS 						= SAPPBOIDataConstants.BUSINESS;
	public static final String BUSINESS_ID 						= SAPPBOIDataConstants.BUSINESS_ID;
	public static final String BUSINESS_NAME 					= SAPPBOIDataConstants.BUSINESS_NAME;
		
		
	public static final String[] IN_MAPPING_COMMON = {	};
		
	// HEADER MENU ITEMS
	public static final String BUSINESS_HEADER_MENU_FEEDBACK_ID 			= "FEEDBACK_MENU_ID";
	public static final String BUSINESS_HEADER_MENU_BLOG_ID 				= "BLOG_MENU_ID";
	public static final String BUSINESS_HEADER_MENU_LIVE_CHAT_SERVICE_ID 	= "LIVE_CHAT_MENU_ID";
	
}
