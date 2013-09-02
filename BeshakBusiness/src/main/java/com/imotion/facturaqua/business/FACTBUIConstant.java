package com.imotion.facturaqua.business;

import com.imotion.facturaqua.FACTIConstants;
import com.selene.arch.base.exe.AEMFTIBaseConstantes;

public interface FACTBUIConstant {
	
	// 0x0020000000000000L | 0x0001120000000000L = 0x0021120000000000L 
	public final static long CTE_FACT_APP_BUSINESS_SERVICE_TYPE = FACTIConstants.CTE_FACT_APP_TYPE | AEMFTIBaseConstantes.CTE_MFT_ARCH_EXE_BUS_IDENTIFICATION;
	
}
