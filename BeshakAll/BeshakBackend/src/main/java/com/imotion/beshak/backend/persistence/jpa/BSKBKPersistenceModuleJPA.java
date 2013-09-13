package com.imotion.beshak.backend.persistence.jpa;

import java.io.Serializable;

import com.selene.arch.exe.back.persistence.module.jpa.AEMFTIPersistenceJPAModule;
import com.selene.arch.exe.back.persistence.module.jpa.AEMFTPersistenceJPAModuleImpl;

public class BSKBKPersistenceModuleJPA<Q, Id extends Serializable> extends AEMFTPersistenceJPAModuleImpl<Q, Id> implements AEMFTIPersistenceJPAModule<Q, Id> {

	// serial number
	private static final long serialVersionUID = 3847661757389796793L;

	public static final String PERSISTENCE_UNIT_NAME = "Beshak";

	@Override
	public String getPersistenceUnitName() {
		return PERSISTENCE_UNIT_NAME;
	}

	/**************************************************************
     *               PROTECTED EXTENDED FUNCTIONS                 *
     **************************************************************/


	/**************************************************************
     *                	   PRIVATE FUNCTIONS                      *
     **************************************************************/
}
