package com.imotion.beshak.business.service;

import com.imotion.beshak.backend.persistence.SAPPBKIPersistenceFactory;
import com.imotion.beshak.backend.persistence.SAPPBKPersistenceServiceBase;
import com.imotion.beshak.business.SAPPBUIWrapperPersistence;
import com.selene.arch.exe.bus.service.AEMFTBusinessServiceWrapperPersistence;
import com.selene.arch.exe.core.appli.businesswrapper.AEMFTIBusinessWrapperService;

public class SAPPBUBusinessWrapperPersistence extends AEMFTBusinessServiceWrapperPersistence implements SAPPBUIWrapperPersistence {

	// serial number
	private static final long serialVersionUID = -9089658768913344414L;
	
	private SAPPBKIPersistenceFactory factoryPool;

	@Override
	public SAPPBKIPersistenceFactory getAppFactoryPersistence() {
		if (factoryPool == null) {
			factoryPool = SAPPBKPersistenceServiceBase.getFactoryPersistence();
		}
		return factoryPool;
	}
	
	@Override
	public void setWrapperService(AEMFTIBusinessWrapperService wrapperService) {
		super.setWrapperService(wrapperService);
		this.factoryPool = SAPPBKPersistenceServiceBase.getFactoryPersistence(wrapperService.getProxyCore().getConfigurationService());
		
	}
}
