package com.imotion.facturaqua.backend.persistence;

import com.selene.arch.exe.back.persistence.AEMFTPersistenceFactoryPool;
import com.selene.arch.exe.core.envi.config.AEMFTIConfigurationService;

public class FACTBKPersistenceFactoryPool extends AEMFTPersistenceFactoryPool implements FACTBKIPersistenceFactory {
	
	private AEMFTIConfigurationService config;
	
	public FACTBKPersistenceFactoryPool() {
		
	}
	
	public FACTBKPersistenceFactoryPool(AEMFTIConfigurationService config) {
		this.config = config;
	}
	
	public void setConfiguraction(AEMFTIConfigurationService config) {
		this.config = config;
	}
	

	/*@Override
	public BusinessUserRelationPersistence newBusinessUserRelationPersistence() {
		String impl = FACTBKIPersistenceConstant.CTE_SRV_BUSINESS_SERVICES_BUSINESS_USER_RELATION_PERSISTENCE_DEFAULT_IMPL;
		if (config != null) {
			impl = config.getProperty(
					FACTBKIPersistenceConstant.CFG_SRV_BUSINESS_SERVICES_BUSINESS_USER_RELATION_PERSISTENCE_IMPL, 
					FACTBKIPersistenceConstant.CTE_SRV_BUSINESS_SERVICES_BUSINESS_USER_RELATION_PERSISTENCE_DEFAULT_IMPL);
		}
		return (BusinessUserRelationPersistence) newPersistenceModule(impl);
	}*/
	
	/***********************************************************************
	 * 					      PRIVATE FUNCTION                             *
	 ***********************************************************************/
	
}
