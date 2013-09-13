package com.imotion.beshak.backend;

import com.imotion.beshak.SAPPConstants;
import com.selene.arch.base.exe.AEMFTIBaseConstantes;

public interface SAPPBKIConstants {
	
	// 0x0020000000000000L | 0x0001130000000000L = 0x0021130000000000L 
	public final static long CTE_SAPP_APP_BACKEND_SERVICE_TYPE = SAPPConstants.CTE_SAPP_APP_TYPE | AEMFTIBaseConstantes.CTE_MFT_ARCH_EXE_BACK_IDENTIFICATION;
	
}
