package com.imotion.facturaqua.business.service;

import com.imotion.facturaqua.business.FACTBUIConstant;
import com.selene.arch.base.MFTIConstant;

public interface FACTBUIBusinessCommonServiceConstant {
	
	// BusinessServiceCommonConstant
	public static long CTE_BUSINESS_SERVICE_COMMON_TYPE 		= FACTBUIServiceConstant.CTE_FACT_APP_BUS_COMMON_SERVICE_SUBTYPE | FACTBUIConstant.CTE_FACT_APP_BUSINESS_SERVICE_TYPE;
	public static String CTE_BUSINESS_SERVICE_COMMON_HEX_TYPE 	= Long.toHexString(CTE_BUSINESS_SERVICE_COMMON_TYPE);
	
	// Constants
	public static long CTE_BUSINESS_SERVICE_COMMON_RANGE_TRACE 	= CTE_BUSINESS_SERVICE_COMMON_TYPE | MFTIConstant.CTE_MFT_RANGE_TRACE;
}

