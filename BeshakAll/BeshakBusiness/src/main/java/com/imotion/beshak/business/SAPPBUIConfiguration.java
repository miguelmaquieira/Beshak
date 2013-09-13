package com.imotion.beshak.business;

import com.imotion.beshak.SAPPConstants;
import com.selene.arch.base.exe.core.common.AEMFTICommonConstants;
import com.selene.arch.base.exe.core.envi.config.AEMFTIConfigurationConstant;

public interface SAPPBUIConfiguration {
	 
	 //CFG.HOST
	 public static String CTE_SAPP_CONFIG_PREFIX = AEMFTIConfigurationConstant.CTE_MFT_AE_CORE_ENTO_CONFIGURACION_PREFIJO_VARIABLES_CONFIGURACION
			  							+ AEMFTICommonConstants.CTE_MFT_AE_CORE_COMM_ELEMENT_SEPARATOR 
			  							+ SAPPConstants.CTE_SAPP_APPLI_NAME;
}
