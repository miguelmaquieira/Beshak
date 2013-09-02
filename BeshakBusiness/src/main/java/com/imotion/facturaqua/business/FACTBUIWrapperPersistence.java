package com.imotion.facturaqua.business;

import com.imotion.facturaqua.backend.persistence.FACTBKIPersistenceFactory;
import com.selene.arch.exe.bus.AEMFTIBusinessWrapperPersistence;

public interface FACTBUIWrapperPersistence extends AEMFTIBusinessWrapperPersistence {
	
	public FACTBKIPersistenceFactory getAppFactoryPersistence();

}
