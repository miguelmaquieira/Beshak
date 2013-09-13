package com.imotion.beshak.business;

import com.imotion.beshak.backend.persistence.SAPPBKIPersistenceFactory;
import com.selene.arch.exe.bus.AEMFTIBusinessWrapperPersistence;

public interface SAPPBUIWrapperPersistence extends AEMFTIBusinessWrapperPersistence {
	
	public SAPPBKIPersistenceFactory getAppFactoryPersistence();

}
