package com.imotion.beshak.business.service;

import com.imotion.beshak.business.BSKBUIConstant;
import com.selene.arch.base.MFTIConstant;

public interface BSKBUIBusinessLoginServiceConstant {

	// BusinessLoginService types
	public static long 		CTE_BUSINESS_LOGIN_SERVICE_TYPE 		= BSKBUIServiceConstant.CTE_BSK_APP_BUS_LOGIN_SERVICE_SUBTYPE | BSKBUIConstant.CTE_BSK_APP_BUSINESS_SERVICE_TYPE;
	public static String 	CTE_BUSINESS_LOGIN_SERVICE_HEX_TYPE 	= Long.toHexString(CTE_BUSINESS_LOGIN_SERVICE_TYPE);
	public static String 	CTE_BUSINESS_LOGIN_SERVICE_NAME 		= "BSKBUIBusinessLoginServiceConstant";

	// Constants
	public static long CTE_BUSINESS_LOGIN_SERVICE_RANGE_TRACE 		= CTE_BUSINESS_LOGIN_SERVICE_TYPE | MFTIConstant.CTE_MFT_RANGE_TRACE;

	public static String BUSINESS_APPLICATION_NAME 	= "BUSINESS";
}