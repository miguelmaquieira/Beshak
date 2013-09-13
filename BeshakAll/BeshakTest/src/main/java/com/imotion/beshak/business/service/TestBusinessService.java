package com.imotion.beshak.business.service;

import com.imotion.beshak.business.service.BSKBUBusinessWrapperPersistence;
import com.selene.arch.exe.bus.service.AEMFTIBusinessService;

public interface TestBusinessService extends AEMFTIBusinessService<BSKBUBusinessWrapperPersistence> {

	public void testJSON();

}
