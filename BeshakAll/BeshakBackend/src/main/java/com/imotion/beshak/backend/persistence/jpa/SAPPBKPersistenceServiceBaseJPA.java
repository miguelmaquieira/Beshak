package com.imotion.beshak.backend.persistence.jpa;

import java.io.Serializable;

import com.selene.arch.exe.back.persistence.AEMFTPersistenceServiceBase;
import com.selene.arch.exe.back.persistence.module.AEMFTIPersistenceModule;

public abstract class SAPPBKPersistenceServiceBaseJPA<T, Q extends T, Id extends Serializable> extends AEMFTPersistenceServiceBase<T, Q, Id> {

	private static final long serialVersionUID = -3861653720997741685L;

	private AEMFTIPersistenceModule<Q, Id> persistenceModule;
	
	@Override
	public AEMFTIPersistenceModule<Q, Id> getPersistenceModule() {
		if (persistenceModule == null) {
			persistenceModule = new SAPPBKPersistenceModuleJPA<Q, Id>();
			persistenceModule.initialize(new Object[] { getPersistenceCoreService(), getPersistenceClass()});
		}
		return persistenceModule;
	}

}
