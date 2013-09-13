package com.imotion.beshak.backend.persistence;

import java.io.Serializable;

import com.selene.arch.exe.back.persistence.AEMFTPersistenceServiceBase;
import com.selene.arch.exe.core.envi.config.AEMFTIConfigurationService;

public abstract class SAPPBKPersistenceServiceBase<T, Q extends T, Id extends Serializable> extends AEMFTPersistenceServiceBase<T, Q, Id> implements SAPPBKIPersistenceService<T, Q, Id> {

	// serial number
	private static final long serialVersionUID = -7192104546522755970L;
	
	private static SAPPBKIPersistenceFactory 	factoryPool;
	
	public static SAPPBKIPersistenceFactory getFactoryPersistence() {
		if (factoryPool == null) {
			factoryPool = new SAPPBKPersistenceFactoryPool();
		}
		return factoryPool;
	}
	
	public static SAPPBKIPersistenceFactory getFactoryPersistence(AEMFTIConfigurationService config) {
		if (factoryPool == null) {
			factoryPool = new SAPPBKPersistenceFactoryPool(config);
		}
		return factoryPool;
	}
}
