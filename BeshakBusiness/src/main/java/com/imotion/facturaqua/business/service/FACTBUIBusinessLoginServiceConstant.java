package com.imotion.facturaqua.business.service;

import com.imotion.facturaqua.business.FACTBUIConstant;
import com.selene.arch.base.MFTIConstant;

public interface FACTBUIBusinessLoginServiceConstant {

	// BusinessLoginService types
	public static long 		CTE_BUSINESS_LOGIN_SERVICE_TYPE 		= FACTBUIServiceConstant.CTE_FACT_APP_BUS_LOGIN_SERVICE_SUBTYPE | FACTBUIConstant.CTE_FACT_APP_BUSINESS_SERVICE_TYPE;
	public static String 	CTE_BUSINESS_LOGIN_SERVICE_HEX_TYPE 	= Long.toHexString(CTE_BUSINESS_LOGIN_SERVICE_TYPE);
	public static String 	CTE_BUSINESS_LOGIN_SERVICE_NAME 		= "FACTBUIBusinessLoginServiceConstant";

	// Constants
	public static long CTE_BUSINESS_LOGIN_SERVICE_RANGE_TRACE 		= CTE_BUSINESS_LOGIN_SERVICE_TYPE | MFTIConstant.CTE_MFT_RANGE_TRACE;

	public static String BUSINESS_APPLICATION_NAME 	= "BUSINESS";
}