package com.imotion.beshak.backend.persistence.login.mongodb;

import com.imotion.beshak.backend.persistence.login.SAPPBKILoginPersistenceService;
import com.imotion.beshak.backend.persistence.mongodb.morphia.SAPPBKPersistenceModuleMorphia;
import com.imotion.beshak.bom.data.SAPPBOLoginData;
import com.imotion.beshak.bom.data.morphia.SAPPBOLoginDataMorphia;
import com.selene.arch.base.bom.data.AEMFTLoginData;
import com.selene.arch.exe.core.AEMFTICoreProxyService;
import com.selene.arch.exe.core.envi.login.persistence.implbase.AEMTLoginPersistenceBase;

public class SAPPBKLoginManagerPersistenceMorphia extends AEMTLoginPersistenceBase<SAPPBOLoginData, SAPPBOLoginDataMorphia> implements SAPPBKILoginPersistenceService {

	public SAPPBKLoginManagerPersistenceMorphia(AEMFTICoreProxyService proxyCore) {
		super(proxyCore);
	}

	// serial version
	private static final long serialVersionUID = -3532864834208552275L;
	
	private SAPPBKPersistenceModuleMorphia<SAPPBOLoginDataMorphia, Long> persistenceModule;
	
	protected Long generateId() { 
		return getPersistenceModule().generateId();
	}
	
	protected SAPPBOLoginDataMorphia getUser(AEMFTLoginData userInfo) {
		SAPPBOLoginDataMorphia user = getPersistenceModule().query(SAPPBOLoginDataMorphia.USER_ID, userInfo.getUserId()).get(0);
		return user;
	}

	@Override
	public SAPPBKPersistenceModuleMorphia<SAPPBOLoginDataMorphia, Long> getPersistenceModule() {
		if (persistenceModule == null) {
			persistenceModule = new SAPPBKPersistenceModuleMorphia<SAPPBOLoginDataMorphia, Long>();
			persistenceModule.initialize(new Object[] { getPersistenceCoreService(), SAPPBOLoginDataMorphia.class });
		}
		return persistenceModule;
	}

	@Override
	public Class<SAPPBOLoginDataMorphia> getPersistenceClass() {
		return SAPPBOLoginDataMorphia.class;
	}
	
	/**************************************************************
     *               PROTECTED EXTENDED FUNCTIONS                 *
     **************************************************************/
	
	
	/**************************************************************
     *                	   PRIVATE FUNCTIONS                      *
     **************************************************************/

}
