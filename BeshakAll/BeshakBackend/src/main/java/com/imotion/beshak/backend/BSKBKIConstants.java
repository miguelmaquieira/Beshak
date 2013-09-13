package com.imotion.beshak.backend;

import com.imotion.beshak.BSKConstants;
import com.selene.arch.base.exe.AEMFTIBaseConstantes;

public interface BSKBKIConstants {
	
	// 0x0020000000000000L | 0x0001130000000000L = 0x0021130000000000L 
	public final static long CTE_BSK_APP_BACKEND_SERVICE_TYPE = BSKConstants.CTE_BSK_APP_TYPE | AEMFTIBaseConstantes.CTE_MFT_ARCH_EXE_BACK_IDENTIFICATION;
	
}
