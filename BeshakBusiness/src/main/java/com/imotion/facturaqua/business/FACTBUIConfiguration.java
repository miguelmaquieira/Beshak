package com.imotion.facturaqua.business;

import com.imotion.facturaqua.FACTIConstants;
import com.selene.arch.base.exe.core.common.AEMFTICommonConstants;
import com.selene.arch.base.exe.core.envi.config.AEMFTIConfigurationConstant;

public interface FACTBUIConfiguration {
	 
	 //CFG.HOST
	 public static String CTE_FACT_CONFIG_PREFIX = AEMFTIConfigurationConstant.CTE_MFT_AE_CORE_ENTO_CONFIGURACION_PREFIJO_VARIABLES_CONFIGURACION
			  							+ AEMFTICommonConstants.CTE_MFT_AE_CORE_COMM_ELEMENT_SEPARATOR 
			  							+ FACTIConstants.CTE_FACT_APPLI_NAME;
}
