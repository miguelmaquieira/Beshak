package com.imotion.facturaqua.backend.persistence.login;

import com.imotion.facturaqua.backend.FACTBKIConstants;
import com.imotion.facturaqua.backend.persistence.FACTBKIPersistenceConstants;
import com.selene.arch.base.MFTIConstant;

public interface FACTBKILoginPersistenceConstants {
	
	// 0x0000000002000000L | 0x0021130000000000L = 0x0021130001000000L
	public final static long 	CTE_FACT_APP_PERSISTENCE_LOGIN_SERVICE_TYPE 			= FACTBKIPersistenceConstants.CTE_FACT_APP_PERSISTENCE_LOGIN_SERVICE_SUBTYPE | FACTBKIConstants.CTE_FACT_APP_BACKEND_SERVICE_TYPE;
	public final static String 	CTE_FACT_APP_PERSISTENCE_LOGIN_SERVICE_HEX_TYPE 		= Long.toHexString(CTE_FACT_APP_PERSISTENCE_LOGIN_SERVICE_TYPE);
	public final static String 	CTE_FACT_APP_PERSISTENCE_LOGIN_SERVICE_NAME 			= "FACTBKPersistenceLogin";
	
	// Constants
	public final static long 	CTE_FACT_PERSISTENCE_LOGIN_SERVICE_RANGE_TRACE 			= CTE_FACT_APP_PERSISTENCE_LOGIN_SERVICE_TYPE | MFTIConstant.CTE_MFT_RANGE_TRACE;

}
