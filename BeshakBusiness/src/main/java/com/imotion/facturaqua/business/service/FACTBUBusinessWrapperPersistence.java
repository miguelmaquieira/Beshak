package com.imotion.facturaqua.business.service;

import com.imotion.facturaqua.backend.persistence.FACTBKIPersistenceFactory;
import com.imotion.facturaqua.backend.persistence.FACTBKPersistenceServiceBase;
import com.imotion.facturaqua.business.FACTBUIWrapperPersistence;
import com.selene.arch.exe.bus.service.AEMFTBusinessServiceWrapperPersistence;
import com.selene.arch.exe.core.appli.businesswrapper.AEMFTIBusinessWrapperService;

public class FACTBUBusinessWrapperPersistence extends AEMFTBusinessServiceWrapperPersistence implements FACTBUIWrapperPersistence {

	// serial number
	private static final long serialVersionUID = -9089658768913344414L;
	
	private FACTBKIPersistenceFactory factoryPool;

	@Override
	public FACTBKIPersistenceFactory getAppFactoryPersistence() {
		if (factoryPool == null) {
			factoryPool = FACTBKPersistenceServiceBase.getFactoryPersistence();
		}
		return factoryPool;
	}
	
	@Override
	public void setWrapperService(AEMFTIBusinessWrapperService wrapperService) {
		super.setWrapperService(wrapperService);
		this.factoryPool = FACTBKPersistenceServiceBase.getFactoryPersistence(wrapperService.getProxyCore().getConfigurationService());
		
	}
}
