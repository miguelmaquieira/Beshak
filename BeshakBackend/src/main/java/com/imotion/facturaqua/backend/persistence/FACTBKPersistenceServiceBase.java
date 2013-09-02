package com.imotion.facturaqua.backend.persistence;

import java.io.Serializable;

import com.selene.arch.exe.back.persistence.AEMFTPersistenceServiceBase;
import com.selene.arch.exe.core.envi.config.AEMFTIConfigurationService;

public abstract class FACTBKPersistenceServiceBase<T, Q extends T, Id extends Serializable> extends AEMFTPersistenceServiceBase<T, Q, Id> implements FACTBKIPersistenceService<T, Q, Id> {

	// serial number
	private static final long serialVersionUID = -7192104546522755970L;
	
	private static FACTBKIPersistenceFactory 	factoryPool;
	
	public static FACTBKIPersistenceFactory getFactoryPersistence() {
		if (factoryPool == null) {
			factoryPool = new FACTBKPersistenceFactoryPool();
		}
		return factoryPool;
	}
	
	public static FACTBKIPersistenceFactory getFactoryPersistence(AEMFTIConfigurationService config) {
		if (factoryPool == null) {
			factoryPool = new FACTBKPersistenceFactoryPool(config);
		}
		return factoryPool;
	}
}
