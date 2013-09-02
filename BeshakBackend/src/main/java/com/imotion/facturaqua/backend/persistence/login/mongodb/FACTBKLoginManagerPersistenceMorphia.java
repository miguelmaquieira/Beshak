package com.imotion.facturaqua.backend.persistence.login.mongodb;

import com.imotion.facturaqua.backend.persistence.login.FACTBKILoginPersistenceService;
import com.imotion.facturaqua.backend.persistence.mongodb.morphia.FACTBKPersistenceModuleMorphia;
import com.imotion.facturaqua.bom.data.FACTBOLoginData;
import com.imotion.facturaqua.bom.data.implbase.FACTBOLoginDataImplBase;
import com.selene.arch.exe.core.envi.login.persistence.implbase.AEMTLoginPersistenceBase;

public class FACTBKLoginManagerPersistenceMorphia extends AEMTLoginPersistenceBase<FACTBOLoginData, FACTBOLoginDataImplBase> implements FACTBKILoginPersistenceService<FACTBOLoginData, FACTBOLoginDataImplBase> {

	// serial version
	private static final long serialVersionUID = -3532864834208552275L;
	
	private FACTBKPersistenceModuleMorphia<FACTBOLoginDataImplBase, Long> persistenceModule;
	
	public FACTBKLoginManagerPersistenceMorphia() {
		super();
	}

	@Override
	public FACTBKPersistenceModuleMorphia<FACTBOLoginDataImplBase, Long> getPersistenceModule() {
		if (persistenceModule == null) {
			persistenceModule = new FACTBKPersistenceModuleMorphia<FACTBOLoginDataImplBase, Long>();
			persistenceModule.initialize(new Object[] { getPersistenceCoreService(), FACTBOLoginDataImplBase.class });
		}
		return persistenceModule;
	}

	@Override
	public Class<FACTBOLoginDataImplBase> getPersistenceClass() {
		return FACTBOLoginDataImplBase.class;
	}
	
	/**************************************************************
     *               PROTECTED EXTENDED FUNCTIONS                 *
     **************************************************************/
	
	
	/**************************************************************
     *                	   PRIVATE FUNCTIONS                      *
     **************************************************************/

}
