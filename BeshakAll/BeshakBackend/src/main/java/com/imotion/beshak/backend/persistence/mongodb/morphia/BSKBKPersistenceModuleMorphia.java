package com.imotion.beshak.backend.persistence.mongodb.morphia;

import java.io.Serializable;

import com.google.code.morphia.Morphia;
import com.imotion.beshak.backend.persistence.mongodb.BSKBKIPersistenceMongoDBConstant;
import com.imotion.beshak.backend.persistence.mongodb.BSKBKIPersistenceMongoDBModule;
import com.imotion.beshak.bom.data.morphia.BSKBOLoginDataMorphia;
import com.selene.arch.exe.back.persistence.module.mongodb.AEMFTPersistenceMongoDBModuleMorphia;

public class BSKBKPersistenceModuleMorphia<Q, Id extends Serializable> extends AEMFTPersistenceMongoDBModuleMorphia<Q, Id> implements BSKBKIPersistenceMongoDBModule<Q, Id> {

	// serial number
	private static final long serialVersionUID = 298609669827153036L;
	
	
	/**************************************************************
     *               PROTECTED EXTENDED FUNCTIONS                 *
     **************************************************************/

	@Override
	protected void initialMapping(Morphia morphia) {
		morphia.map(BSKBOLoginDataMorphia.class);
	}

	@Override
	protected String getDatastoreName() {
		return BSKBKIPersistenceMongoDBConstant.CTE_MONGODB_DATABASE_NAME;
	}
	
	/**************************************************************
     *                	   PRIVATE FUNCTIONS                      *
     **************************************************************/
}
