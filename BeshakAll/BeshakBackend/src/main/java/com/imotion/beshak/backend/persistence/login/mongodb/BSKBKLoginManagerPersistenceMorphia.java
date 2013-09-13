package com.imotion.beshak.backend.persistence.login.mongodb;

import com.imotion.beshak.backend.persistence.login.BSKBKILoginPersistenceService;
import com.imotion.beshak.backend.persistence.mongodb.morphia.BSKBKPersistenceModuleMorphia;
import com.imotion.beshak.bom.data.BSKBOLoginData;
import com.imotion.beshak.bom.data.morphia.BSKBOLoginDataMorphia;
import com.selene.arch.base.bom.data.AEMFTLoginData;
import com.selene.arch.exe.core.AEMFTICoreProxyService;
import com.selene.arch.exe.core.envi.login.persistence.implbase.AEMTLoginPersistenceBase;

public class BSKBKLoginManagerPersistenceMorphia extends AEMTLoginPersistenceBase<BSKBOLoginData, BSKBOLoginDataMorphia> implements BSKBKILoginPersistenceService {

	public BSKBKLoginManagerPersistenceMorphia(AEMFTICoreProxyService proxyCore) {
		super(proxyCore);
	}

	// serial version
	private static final long serialVersionUID = -3532864834208552275L;
	
	private BSKBKPersistenceModuleMorphia<BSKBOLoginDataMorphia, Long> persistenceModule;
	
	protected Long generateId() { 
		return getPersistenceModule().generateId();
	}
	
	protected BSKBOLoginDataMorphia getUser(AEMFTLoginData userInfo) {
		BSKBOLoginDataMorphia user = getPersistenceModule().query(BSKBOLoginDataMorphia.USER_ID, userInfo.getUserId()).get(0);
		return user;
	}

	@Override
	public BSKBKPersistenceModuleMorphia<BSKBOLoginDataMorphia, Long> getPersistenceModule() {
		if (persistenceModule == null) {
			persistenceModule = new BSKBKPersistenceModuleMorphia<BSKBOLoginDataMorphia, Long>();
			persistenceModule.initialize(new Object[] { getPersistenceCoreService(), BSKBOLoginDataMorphia.class });
		}
		return persistenceModule;
	}

	@Override
	public Class<BSKBOLoginDataMorphia> getPersistenceClass() {
		return BSKBOLoginDataMorphia.class;
	}
	
	/**************************************************************
     *               PROTECTED EXTENDED FUNCTIONS                 *
     **************************************************************/
	
	
	/**************************************************************
     *                	   PRIVATE FUNCTIONS                      *
     **************************************************************/

}
