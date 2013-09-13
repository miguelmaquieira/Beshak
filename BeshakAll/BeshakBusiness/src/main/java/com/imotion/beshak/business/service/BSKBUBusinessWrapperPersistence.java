package com.imotion.beshak.business.service;

import com.imotion.beshak.backend.persistence.BSKBKIPersistenceFactory;
import com.imotion.beshak.backend.persistence.BSKBKPersistenceServiceBase;
import com.imotion.beshak.business.BSKBUIWrapperPersistence;
import com.selene.arch.exe.bus.service.AEMFTBusinessServiceWrapperPersistence;
import com.selene.arch.exe.core.appli.businesswrapper.AEMFTIBusinessWrapperService;

public class BSKBUBusinessWrapperPersistence extends AEMFTBusinessServiceWrapperPersistence implements BSKBUIWrapperPersistence {

	// serial number
	private static final long serialVersionUID = -9089658768913344414L;
	
	private BSKBKIPersistenceFactory factoryPool;

	@Override
	public BSKBKIPersistenceFactory getAppFactoryPersistence() {
		if (factoryPool == null) {
			factoryPool = BSKBKPersistenceServiceBase.getFactoryPersistence();
		}
		return factoryPool;
	}
	
	@Override
	public void setWrapperService(AEMFTIBusinessWrapperService wrapperService) {
		super.setWrapperService(wrapperService);
		this.factoryPool = BSKBKPersistenceServiceBase.getFactoryPersistence(wrapperService.getProxyCore().getConfigurationService());
		
	}
}
