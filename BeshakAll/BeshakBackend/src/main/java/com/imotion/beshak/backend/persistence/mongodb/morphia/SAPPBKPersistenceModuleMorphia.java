package com.imotion.beshak.backend.persistence.mongodb.morphia;

import java.io.Serializable;

import com.google.code.morphia.Morphia;
import com.imotion.beshak.backend.persistence.mongodb.SAPPBKIPersistenceMongoDBConstant;
import com.imotion.beshak.backend.persistence.mongodb.SAPPBKIPersistenceMongoDBModule;
import com.imotion.beshak.bom.data.morphia.SAPPBOLoginDataMorphia;
import com.selene.arch.exe.back.persistence.module.mongodb.AEMFTPersistenceMongoDBModuleMorphia;

public class SAPPBKPersistenceModuleMorphia<Q, Id extends Serializable> extends AEMFTPersistenceMongoDBModuleMorphia<Q, Id> implements SAPPBKIPersistenceMongoDBModule<Q, Id> {

	// serial number
	private static final long serialVersionUID = 298609669827153036L;
	
	
	/**************************************************************
     *               PROTECTED EXTENDED FUNCTIONS                 *
     **************************************************************/

	@Override
	protected void initialMapping(Morphia morphia) {
		morphia.map(SAPPBOLoginDataMorphia.class);
	}

	@Override
	protected String getDatastoreName() {
		return SAPPBKIPersistenceMongoDBConstant.CTE_MONGODB_DATABASE_NAME;
	}
	
	/**************************************************************
     *                	   PRIVATE FUNCTIONS                      *
     **************************************************************/
}
