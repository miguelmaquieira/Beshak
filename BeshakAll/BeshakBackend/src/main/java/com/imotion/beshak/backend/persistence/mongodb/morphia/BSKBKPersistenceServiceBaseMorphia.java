package com.imotion.beshak.backend.persistence.mongodb.morphia;

import java.io.Serializable;

import com.selene.arch.exe.back.persistence.AEMFTPersistenceServiceBase;
import com.selene.arch.exe.back.persistence.module.AEMFTIPersistenceModule;

public abstract class BSKBKPersistenceServiceBaseMorphia<T, Q extends T, Id extends Serializable> extends AEMFTPersistenceServiceBase<T, Q, Id> {

	private static final long serialVersionUID = -3861653720997741685L;

	private AEMFTIPersistenceModule<Q, Id> persistenceModule;
	
	@Override
	public AEMFTIPersistenceModule<Q, Id> getPersistenceModule() {
		if (persistenceModule == null) {
			persistenceModule = new BSKBKPersistenceModuleMorphia<Q, Id>();
			persistenceModule.initialize(new Object[] { getPersistenceCoreService(), getPersistenceClass()});
		}
		return persistenceModule;
	}

}
