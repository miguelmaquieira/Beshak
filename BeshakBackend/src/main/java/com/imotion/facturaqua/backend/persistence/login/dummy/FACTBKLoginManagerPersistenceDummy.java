package com.imotion.facturaqua.backend.persistence.login.dummy;

import java.util.List;
import java.util.Locale;

import com.imotion.facturaqua.backend.persistence.login.FACTBKILoginPersistenceService;
import com.imotion.facturaqua.bom.data.FACTBOLoginData;
import com.selene.arch.exe.back.persistence.module.AEMFTIPersistenceModule;
import com.selene.arch.exe.core.envi.login.persistence.implbase.AEMTLoginPersistenceBase;

public class FACTBKLoginManagerPersistenceDummy extends AEMTLoginPersistenceBase<FACTBOLoginData, FACTBOLoginData> implements FACTBKILoginPersistenceService<FACTBOLoginData, FACTBOLoginData> {

	// serial version
	private static final long serialVersionUID = 6529901348295511001L;
	
	@Override
	public AEMFTIPersistenceModule<FACTBOLoginData, Long> getPersistenceModule() {
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
	public FACTBOLoginData createNewUser(String email, String passwordHash,
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
	public FACTBOLoginData activateUser(String activationKey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FACTBOLoginData requestCode(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FACTBOLoginData requestCode(FACTBOLoginData userInfo) {
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
	public FACTBOLoginData validateLogin(String email, String passwordHash,
			String lastSessionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FACTBOLoginData validateSocialLogin(String socialProviderId,
			String socialValidatedId, String lastSessionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FACTBOLoginData isValidSession(String sessionID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FACTBOLoginData> getPendingNewUserRequests() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FACTBOLoginData> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<FACTBOLoginData> getPersistenceClass() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
