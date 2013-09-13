package com.imotion.beshak.backend.persistence.login;

import com.imotion.beshak.backend.BSKBKIConstants;
import com.imotion.beshak.backend.persistence.BSKBKIPersistenceConstants;
import com.selene.arch.base.MFTIConstant;

public interface BSKBKILoginPersistenceConstants {

	// 0x0000000002000000L | 0x0021130000000000L = 0x0021130001000000L
	public final static long 	CTE_BSK_APP_PERSISTENCE_LOGIN_SERVICE_TYPE 			= BSKBKIPersistenceConstants.CTE_BSK_APP_PERSISTENCE_LOGIN_SERVICE_SUBTYPE | BSKBKIConstants.CTE_BSK_APP_BACKEND_SERVICE_TYPE;
	public final static String 	CTE_BSK_APP_PERSISTENCE_LOGIN_SERVICE_HEX_TYPE 		= Long.toHexString(CTE_BSK_APP_PERSISTENCE_LOGIN_SERVICE_TYPE);
	public final static String 	CTE_BSK_APP_PERSISTENCE_LOGIN_SERVICE_NAME 			= "BSKBKPersistenceLogin";

	// Constants
	public final static long 	CTE_BSK_PERSISTENCE_LOGIN_SERVICE_RANGE_TRACE 			= CTE_BSK_APP_PERSISTENCE_LOGIN_SERVICE_TYPE | MFTIConstant.CTE_MFT_RANGE_TRACE;

}
