package com.imotion.beshak.business.service;

import com.imotion.beshak.business.service.SAPPBUBusinessWrapperPersistence;
import com.selene.arch.exe.bus.service.AEMFTIBusinessService;

public interface TestBusinessService extends AEMFTIBusinessService<SAPPBUBusinessWrapperPersistence> {

	public void testJSON();

}
