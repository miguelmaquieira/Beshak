package com.imotion.beshak.backend.persistence.login.dummy;

import java.util.List;
import java.util.Locale;

import com.imotion.beshak.backend.persistence.login.BSKBKILoginPersistenceService;
import com.imotion.beshak.bom.data.BSKBOLoginData;
import com.selene.arch.base.bom.data.AEMFTLoginData;
import com.selene.arch.exe.back.persistence.module.AEMFTIPersistenceModule;
import com.selene.arch.exe.core.AEMFTICoreProxyService;
import com.selene.arch.exe.core.envi.login.persistence.implbase.AEMTLoginPersistenceBase;

public class BSKBKLoginManagerPersistenceDummy extends AEMTLoginPersistenceBase<BSKBOLoginData, BSKBOLoginData> implements BSKBKILoginPersistenceService {

	public BSKBKLoginManagerPersistenceDummy(AEMFTICoreProxyService proxyCore) {
		super(proxyCore);
	}

	// serial version
	private static final long serialVersionUID = 6529901348295511001L;
	
	@Override
	public AEMFTIPersistenceModule<BSKBOLoginData, Long> getPersistenceModule() {
		return null;
	}
	
	@Override
	public boolean userExists(String email) {
		return true;
	}
	
	@Override
	public boolean emailExists(String email) {
		return true;
	}

	@Override
	public AEMFTLoginData createNewUser(String email, String passwordHash,
			String registrationId, boolean pendingAccept, int rolType,
			Locale locale, String socialProviderId, String socialValidatedId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeUser(String email) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AEMFTLoginData activateUser(String activationKey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AEMFTLoginData requestCode(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AEMFTLoginData requestCode(AEMFTLoginData userInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean resetPassword(String id, String passwordHash) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean changePassword(String email, String newPasswordHash) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public AEMFTLoginData validateLogin(String email, String passwordHash,
			String lastSessionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AEMFTLoginData validateSocialLogin(String socialProviderId,
			String socialValidatedId, String lastSessionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AEMFTLoginData isValidSession(String sessionID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AEMFTLoginData> getPendingNewUserRequests() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AEMFTLoginData> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<BSKBOLoginData> getPersistenceClass() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
