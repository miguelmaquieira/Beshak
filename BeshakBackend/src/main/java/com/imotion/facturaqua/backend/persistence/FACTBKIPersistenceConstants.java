package com.imotion.facturaqua.backend.persistence;

import com.imotion.facturaqua.backend.FACTBKIConstants;
import com.selene.arch.base.MFTIConstant;



public interface FACTBKIPersistenceConstants {
	
	// Persistence subtypes
	public final static long 	CTE_FACT_APP_PERSISTENCE_BASE_SERVICE_SUBTYPE 		= 0x0000000001000000L;
	public final static long 	CTE_FACT_APP_PERSISTENCE_LOGIN_SERVICE_SUBTYPE 		= 0x0000000002000000L;
			
	// 0x0000000001000000L | 0x0021130000000000L = 0x0021130001000000L
	public final static long 	CTE_FACT_APP_PERSISTENCE_BASE_SERVICE_TYPE 			= CTE_FACT_APP_PERSISTENCE_BASE_SERVICE_SUBTYPE | FACTBKIConstants.CTE_FACT_APP_BACKEND_SERVICE_TYPE;
	public final static String 	CTE_FACT_APP_PERSISTENCE_BASE_SERVICE_HEX_TYPE 		= Long.toHexString(CTE_FACT_APP_PERSISTENCE_BASE_SERVICE_TYPE);
	public final static String 	CTE_FACT_APP_PERSISTENCE_BASE_SERVICE_NAME 			= "FACTBKPersistenceModuleBase";
	
	// Constants
	public final static long 	CTE_FACT_PERSISTENCE_BASE_SERVICE_RANGE_TRACE 	= CTE_FACT_APP_PERSISTENCE_BASE_SERVICE_TYPE | MFTIConstant.CTE_MFT_RANGE_TRACE;
}
