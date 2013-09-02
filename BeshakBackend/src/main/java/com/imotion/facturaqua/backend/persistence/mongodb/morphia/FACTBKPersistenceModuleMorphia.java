package com.imotion.facturaqua.backend.persistence.mongodb.morphia;

import java.io.Serializable;

import com.google.code.morphia.Morphia;
import com.imotion.facturaqua.backend.persistence.mongodb.FACTBKIPersistenceMongoDBConstant;
import com.imotion.facturaqua.backend.persistence.mongodb.FACTBKIPersistenceMongoDBModule;
import com.imotion.facturaqua.bom.data.implbase.FACTBOLoginDataImplBase;
import com.selene.arch.exe.back.persistence.module.mongodb.AEMFTPersistenceMongoDBModuleMorphia;

public class FACTBKPersistenceModuleMorphia<Q, Id extends Serializable> extends AEMFTPersistenceMongoDBModuleMorphia<Q, Id> implements FACTBKIPersistenceMongoDBModule<Q, Id> {

	// serial number
	private static final long serialVersionUID = 298609669827153036L;
	
	
	/**************************************************************
     *               PROTECTED EXTENDED FUNCTIONS                 *
     **************************************************************/

	@Override
	protected void initialMapping(Morphia morphia) {
		morphia.map(FACTBOLoginDataImplBase.class);
	}

	@Override
	protected String getDatastoreName() {
		return FACTBKIPersistenceMongoDBConstant.CTE_MONGODB_DATABASE_NAME;
	}
	
	/**************************************************************
     *                	   PRIVATE FUNCTIONS                      *
     **************************************************************/
}
