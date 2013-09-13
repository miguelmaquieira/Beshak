package com.imotion.beshak.backend.persistence;

import com.selene.arch.exe.back.persistence.AEMFTPersistenceFactoryPool;
import com.selene.arch.exe.core.envi.config.AEMFTIConfigurationService;

public class SAPPBKPersistenceFactoryPool extends AEMFTPersistenceFactoryPool implements SAPPBKIPersistenceFactory {

	private AEMFTIConfigurationService config;

	public SAPPBKPersistenceFactoryPool() {

	}

	public SAPPBKPersistenceFactoryPool(AEMFTIConfigurationService config) {
		this.config = config;
	}

	public void setConfiguraction(AEMFTIConfigurationService config) {
		this.config = config;
	}


	/*@Override
	public BusinessUserRelationPersistence newBusinessUserRelationPersistence() {
		String impl = SAPPBKIPersistenceConstant.CTE_SRV_BUSINESS_SERVICES_BUSINESS_USER_RELATION_PERSISTENCE_DEFAULT_IMPL;
		if (config != null) {
			impl = config.getProperty(
					SAPPBKIPersistenceConstant.CFG_SRV_BUSINESS_SERVICES_BUSINESS_USER_RELATION_PERSISTENCE_IMPL,
					SAPPBKIPersistenceConstant.CTE_SRV_BUSINESS_SERVICES_BUSINESS_USER_RELATION_PERSISTENCE_DEFAULT_IMPL);
		}
		return (BusinessUserRelationPersistence) newPersistenceModule(impl);
	}*/

	/***********************************************************************
	 * 					      PRIVATE FUNCTION                             *
	 ***********************************************************************/

}
