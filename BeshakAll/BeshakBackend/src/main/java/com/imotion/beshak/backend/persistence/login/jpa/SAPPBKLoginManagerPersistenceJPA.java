package com.imotion.beshak.backend.persistence.login.jpa;

import com.imotion.beshak.backend.persistence.jpa.SAPPBKPersistenceModuleJPA;
import com.imotion.beshak.backend.persistence.login.SAPPBKILoginPersistenceService;
import com.imotion.beshak.bom.data.SAPPBOLoginData;
import com.imotion.beshak.bom.data.jpa.SAPPBOLoginDataJPA;
import com.selene.arch.base.bom.data.AEMFTLoginData;
import com.selene.arch.exe.core.AEMFTICoreProxyService;
import com.selene.arch.exe.core.envi.login.persistence.implbase.AEMTLoginPersistenceBase;

public class SAPPBKLoginManagerPersistenceJPA extends AEMTLoginPersistenceBase<SAPPBOLoginData, SAPPBOLoginDataJPA> implements SAPPBKILoginPersistenceService {

	public SAPPBKLoginManagerPersistenceJPA(AEMFTICoreProxyService proxyCore) {
		super(proxyCore);
	}

	// serial version
	private static final long serialVersionUID = -3532864834208552275L;

	private SAPPBKPersistenceModuleJPA<SAPPBOLoginDataJPA, Long> persistenceModule;

	protected SAPPBOLoginDataJPA getUser(AEMFTLoginData userInfo) {
		SAPPBOLoginDataJPA user = getPersistenceModule().query(SAPPBOLoginDataJPA.USER_ID, userInfo.getUserId()).get(0);
		return user;
	}

	@Override
	public SAPPBKPersistenceModuleJPA<SAPPBOLoginDataJPA, Long> getPersistenceModule() {
		if (persistenceModule == null) {
			persistenceModule = new SAPPBKPersistenceModuleJPA<SAPPBOLoginDataJPA, Long>();
			persistenceModule.initialize(new Object[] { getPersistenceCoreService(), getPersistenceClass() });
		}
		return persistenceModule;
	}

	@Override
	public Class<SAPPBOLoginDataJPA> getPersistenceClass() {
		return SAPPBOLoginDataJPA.class;
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
