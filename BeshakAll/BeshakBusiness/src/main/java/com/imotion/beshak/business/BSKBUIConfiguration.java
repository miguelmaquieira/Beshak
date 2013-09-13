package com.imotion.beshak.business;

import com.imotion.beshak.BSKConstants;
import com.selene.arch.base.exe.core.common.AEMFTICommonConstants;
import com.selene.arch.base.exe.core.envi.config.AEMFTIConfigurationConstant;

public interface BSKBUIConfiguration {
	 
	 //CFG.HOST
	 public static String CTE_BSK_CONFIG_PREFIX = AEMFTIConfigurationConstant.CTE_MFT_AE_CORE_ENTO_CONFIGURACION_PREFIJO_VARIABLES_CONFIGURACION
			  							+ AEMFTICommonConstants.CTE_MFT_AE_CORE_COMM_ELEMENT_SEPARATOR 
			  							+ BSKConstants.CTE_BSK_APPLI_NAME;
}
