package com.imotion.beshak.business.service.impl;

import com.imotion.beshak.business.service.BSKBUBusinessWrapperPersistence;
import com.imotion.beshak.business.service.TestBusinessService;
import com.selene.arch.base.exe.core.appli.metadata.element.AEMFTMetadataElementComposite;
import com.selene.arch.exe.bus.service.impl.AEMFTBusinessServiceBaseImpl;

public class TestBusinessServiceImpl extends AEMFTBusinessServiceBaseImpl<BSKBUBusinessWrapperPersistence> implements TestBusinessService {

	@Override
	public void testJSON() {
		AEMFTMetadataElementComposite contextIn = getContext().getContextDataIN();
		System.out.println("TEST!!");

		getContext().setContextOUT((AEMFTMetadataElementComposite) contextIn.cloneObject());
	}

	@Override
	public String getName() {
		return "TestBusinessServiceImpl";
	}

	@Override
	protected BSKBUBusinessWrapperPersistence createPersistenceWrapper() {
		return new BSKBUBusinessWrapperPersistence();
	}

}
