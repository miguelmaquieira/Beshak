package com.imotion.beshak.business.service;

import com.imotion.beshak.business.BSKBUIConstant;
import com.selene.arch.base.MFTIConstant;

public interface BSKBUIBusinessCommonServiceConstant {
	
	// BusinessServiceCommonConstant
	public static long CTE_BUSINESS_SERVICE_COMMON_TYPE 		= BSKBUIServiceConstant.CTE_BSK_APP_BUS_COMMON_SERVICE_SUBTYPE | BSKBUIConstant.CTE_BSK_APP_BUSINESS_SERVICE_TYPE;
	public static String CTE_BUSINESS_SERVICE_COMMON_HEX_TYPE 	= Long.toHexString(CTE_BUSINESS_SERVICE_COMMON_TYPE);
	
	// Constants
	public static long CTE_BUSINESS_SERVICE_COMMON_RANGE_TRACE 	= CTE_BUSINESS_SERVICE_COMMON_TYPE | MFTIConstant.CTE_MFT_RANGE_TRACE;
}
