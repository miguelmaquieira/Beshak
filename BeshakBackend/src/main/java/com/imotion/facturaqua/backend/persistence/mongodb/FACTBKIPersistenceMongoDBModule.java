package com.imotion.facturaqua.backend.persistence.mongodb;

import java.io.Serializable;

import com.selene.arch.exe.back.persistence.module.mongodb.AEMFTIPersistenceMongoDBModule;

public interface FACTBKIPersistenceMongoDBModule<T,Id extends Serializable> extends AEMFTIPersistenceMongoDBModule<T, Id> {

}
