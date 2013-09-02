package com.imotion.facturaqua.backend;

import com.imotion.facturaqua.FACTIConstants;
import com.selene.arch.base.exe.AEMFTIBaseConstantes;

public interface FACTBKIConstants {
	
	// 0x0020000000000000L | 0x0001130000000000L = 0x0021130000000000L 
	public final static long CTE_FACT_APP_BACKEND_SERVICE_TYPE = FACTIConstants.CTE_FACT_APP_TYPE | AEMFTIBaseConstantes.CTE_MFT_ARCH_EXE_BACK_IDENTIFICATION;
	
}
