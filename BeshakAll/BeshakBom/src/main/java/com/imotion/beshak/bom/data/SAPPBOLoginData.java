package com.imotion.beshak.bom.data;

import javax.persistence.MappedSuperclass;

import com.imotion.beshak.bom.SAPPBOILoginDataConstants;
import com.selene.arch.base.bom.data.AEMFTUserData;

@MappedSuperclass
public abstract class SAPPBOLoginData extends AEMFTUserData implements SAPPBOILoginDataConstants {

	// serial version
	private static final long serialVersionUID = -3242621213144969390L;

	public SAPPBOLoginData() {}
	
	public SAPPBOLoginData(String email, String hash, boolean pendingAccept, int rolType) {
		this.email 			= email;
		this.hash 			= hash;
		this.pendingAccept 	= pendingAccept;
		this.lastLogin 		= null;
		this.lastSessionId 	= "";
		this.rolType		= rolType;
	}
}
