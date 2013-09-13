package com.imotion.beshak.backend.persistence.mongodb;

import java.io.Serializable;

import com.imotion.beshak.backend.persistence.SAPPBKIPersistenceModule;
import com.selene.arch.exe.back.persistence.module.mongodb.AEMFTIPersistenceMongoDBModule;

public interface SAPPBKIPersistenceMongoDBModule<T,Id extends Serializable> extends AEMFTIPersistenceMongoDBModule<T, Id>, SAPPBKIPersistenceModule {

}
