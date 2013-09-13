package com.imotion.beshak.business;

import com.imotion.beshak.backend.persistence.BSKBKIPersistenceFactory;
import com.selene.arch.exe.bus.AEMFTIBusinessWrapperPersistence;

public interface BSKBUIWrapperPersistence extends AEMFTIBusinessWrapperPersistence {
	
	public BSKBKIPersistenceFactory getAppFactoryPersistence();

}
