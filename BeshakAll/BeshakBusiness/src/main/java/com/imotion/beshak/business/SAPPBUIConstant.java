package com.imotion.beshak.business;

import com.imotion.beshak.SAPPConstants;
import com.selene.arch.base.exe.AEMFTIBaseConstantes;

public interface SAPPBUIConstant {
	
	// 0x0020000000000000L | 0x0001120000000000L = 0x0021120000000000L 
	public final static long CTE_SAPP_APP_BUSINESS_SERVICE_TYPE = SAPPConstants.CTE_SAPP_APP_TYPE | AEMFTIBaseConstantes.CTE_MFT_ARCH_EXE_BUS_IDENTIFICATION;
	
}
