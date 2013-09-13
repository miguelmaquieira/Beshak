package com.imotion.beshak.backend.persistence;

import com.selene.arch.exe.back.persistence.AEMFTPersistenceFactoryPool;
import com.selene.arch.exe.core.envi.config.AEMFTIConfigurationService;

public class BSKBKPersistenceFactoryPool extends AEMFTPersistenceFactoryPool implements BSKBKIPersistenceFactory {

	private AEMFTIConfigurationService config;

	public BSKBKPersistenceFactoryPool() {

	}

	public BSKBKPersistenceFactoryPool(AEMFTIConfigurationService config) {
		this.config = config;
	}

	public void setConfiguraction(AEMFTIConfigurationService config) {
		this.config = config;
	}


	/*@Override
	public BusinessUserRelationPersistence newBusinessUserRelationPersistence() {
		String impl = BSKBKIPersistenceConstant.CTE_SRV_BUSINESS_SERVICES_BUSINESS_USER_RELATION_PERSISTENCE_DEFAULT_IMPL;
		if (config != null) {
			impl = config.getProperty(
					BSKBKIPersistenceConstant.CFG_SRV_BUSINESS_SERVICES_BUSINESS_USER_RELATION_PERSISTENCE_IMPL,
					BSKBKIPersistenceConstant.CTE_SRV_BUSINESS_SERVICES_BUSINESS_USER_RELATION_PERSISTENCE_DEFAULT_IMPL);
		}
		return (BusinessUserRelationPersistence) newPersistenceModule(impl);
	}*/

	/***********************************************************************
	 * 					      PRIVATE FUNCTION                             *
	 ***********************************************************************/

}
