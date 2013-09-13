package com.imotion.beshak.backend.persistence.login;

import com.imotion.beshak.backend.SAPPBKIConstants;
import com.imotion.beshak.backend.persistence.SAPPBKIPersistenceConstants;
import com.selene.arch.base.MFTIConstant;

public interface SAPPBKILoginPersistenceConstants {

	// 0x0000000002000000L | 0x0021130000000000L = 0x0021130001000000L
	public final static long 	CTE_SAPP_APP_PERSISTENCE_LOGIN_SERVICE_TYPE 			= SAPPBKIPersistenceConstants.CTE_SAPP_APP_PERSISTENCE_LOGIN_SERVICE_SUBTYPE | SAPPBKIConstants.CTE_SAPP_APP_BACKEND_SERVICE_TYPE;
	public final static String 	CTE_SAPP_APP_PERSISTENCE_LOGIN_SERVICE_HEX_TYPE 		= Long.toHexString(CTE_SAPP_APP_PERSISTENCE_LOGIN_SERVICE_TYPE);
	public final static String 	CTE_SAPP_APP_PERSISTENCE_LOGIN_SERVICE_NAME 			= "SAPPBKPersistenceLogin";

	// Constants
	public final static long 	CTE_SAPP_PERSISTENCE_LOGIN_SERVICE_RANGE_TRACE 			= CTE_SAPP_APP_PERSISTENCE_LOGIN_SERVICE_TYPE | MFTIConstant.CTE_MFT_RANGE_TRACE;

}
