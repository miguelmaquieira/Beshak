package com.imotion.beshak.backend.persistence.mongodb;

import java.io.Serializable;

import com.imotion.beshak.backend.persistence.BSKBKIPersistenceModule;
import com.selene.arch.exe.back.persistence.module.mongodb.AEMFTIPersistenceMongoDBModule;

public interface BSKBKIPersistenceMongoDBModule<T,Id extends Serializable> extends AEMFTIPersistenceMongoDBModule<T, Id>, BSKBKIPersistenceModule {

}
