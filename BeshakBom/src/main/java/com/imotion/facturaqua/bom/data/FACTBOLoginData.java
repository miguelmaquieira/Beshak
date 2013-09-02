package com.imotion.facturaqua.bom.data;

import com.imotion.facturaqua.bom.FACTBOILoginDataConstants;
import com.selene.arch.base.bom.data.AEMFTLoginData;

public abstract class FACTBOLoginData extends AEMFTLoginData implements FACTBOILoginDataConstants {

	// serial version
	private static final long serialVersionUID = -3242621213144969390L;
	
	public FACTBOLoginData() {}
	
	public FACTBOLoginData(String email, String hash, boolean pendingAccept, int rolType) {
		this.email 			= email;
		this.hash 			= hash;
		this.pendingAccept 	= pendingAccept;
		this.lastLogin 		= null;
		this.lastSessionId 	= "";
		this.rolType		= rolType;
	}
}
