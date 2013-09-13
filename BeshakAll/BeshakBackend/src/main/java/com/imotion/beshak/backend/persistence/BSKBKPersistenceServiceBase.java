package com.imotion.beshak.backend.persistence;

import java.io.Serializable;

import com.selene.arch.exe.back.persistence.AEMFTPersistenceServiceBase;
import com.selene.arch.exe.core.envi.config.AEMFTIConfigurationService;

public abstract class BSKBKPersistenceServiceBase<T, Q extends T, Id extends Serializable> extends AEMFTPersistenceServiceBase<T, Q, Id> implements BSKBKIPersistenceService<T, Q, Id> {

	// serial number
	private static final long serialVersionUID = -7192104546522755970L;
	
	private static BSKBKIPersistenceFactory 	factoryPool;
	
	public static BSKBKIPersistenceFactory getFactoryPersistence() {
		if (factoryPool == null) {
			factoryPool = new BSKBKPersistenceFactoryPool();
		}
		return factoryPool;
	}
	
	public static BSKBKIPersistenceFactory getFactoryPersistence(AEMFTIConfigurationService config) {
		if (factoryPool == null) {
			factoryPool = new BSKBKPersistenceFactoryPool(config);
		}
		return factoryPool;
	}
}
