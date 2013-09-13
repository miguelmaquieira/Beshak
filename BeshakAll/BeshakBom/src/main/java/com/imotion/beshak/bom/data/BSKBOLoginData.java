package com.imotion.beshak.bom.data;

import javax.persistence.MappedSuperclass;

import com.imotion.beshak.bom.BSKBOILoginDataConstants;
import com.selene.arch.base.bom.data.AEMFTUserData;

@MappedSuperclass
public abstract class BSKBOLoginData extends AEMFTUserData implements BSKBOILoginDataConstants {

	// serial version
	private static final long serialVersionUID = -3242621213144969390L;

	public BSKBOLoginData() {}
	
	public BSKBOLoginData(String email, String hash, boolean pendingAccept, int rolType) {
		this.email 			= email;
		this.hash 			= hash;
		this.pendingAccept 	= pendingAccept;
		this.lastLogin 		= null;
		this.lastSessionId 	= "";
		this.rolType		= rolType;
	}
}
