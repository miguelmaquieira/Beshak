package com.imotion.beshak.backend.persistence.login.jpa;

import com.imotion.beshak.backend.persistence.jpa.BSKBKPersistenceModuleJPA;
import com.imotion.beshak.backend.persistence.login.BSKBKILoginPersistenceService;
import com.imotion.beshak.bom.data.BSKBOLoginData;
import com.imotion.beshak.bom.data.jpa.BSKBOLoginDataJPA;
import com.selene.arch.base.bom.data.AEMFTLoginData;
import com.selene.arch.exe.core.AEMFTICoreProxyService;
import com.selene.arch.exe.core.envi.login.persistence.implbase.AEMTLoginPersistenceBase;

public class BSKBKLoginManagerPersistenceJPA extends AEMTLoginPersistenceBase<BSKBOLoginData, BSKBOLoginDataJPA> implements BSKBKILoginPersistenceService {

	public BSKBKLoginManagerPersistenceJPA(AEMFTICoreProxyService proxyCore) {
		super(proxyCore);
	}

	// serial version
	private static final long serialVersionUID = -3532864834208552275L;

	private BSKBKPersistenceModuleJPA<BSKBOLoginDataJPA, Long> persistenceModule;

	protected BSKBOLoginDataJPA getUser(AEMFTLoginData userInfo) {
		BSKBOLoginDataJPA user = getPersistenceModule().query(BSKBOLoginDataJPA.USER_ID, userInfo.getUserId()).get(0);
		return user;
	}

	@Override
	public BSKBKPersistenceModuleJPA<BSKBOLoginDataJPA, Long> getPersistenceModule() {
		if (persistenceModule == null) {
			persistenceModule = new BSKBKPersistenceModuleJPA<BSKBOLoginDataJPA, Long>();
			persistenceModule.initialize(new Object[] { getPersistenceCoreService(), getPersistenceClass() });
		}
		return persistenceModule;
	}

	@Override
	public Class<BSKBOLoginDataJPA> getPersistenceClass() {
		return BSKBOLoginDataJPA.class;
	}

	/**************************************************************
	 *               PROTECTED EXTENDED FUNCTIONS                 *
	 **************************************************************/
	//AEMTLoginPersistenceBase
	@Override
	protected Long generateId() { 
		return null;
	}

	/**************************************************************
	 *                	   PRIVATE FUNCTIONS                      *
	 **************************************************************/

}
