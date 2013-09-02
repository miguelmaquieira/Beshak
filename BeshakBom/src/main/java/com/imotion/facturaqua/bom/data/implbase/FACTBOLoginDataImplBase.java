package com.imotion.facturaqua.bom.data.implbase;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import com.imotion.facturaqua.bom.data.FACTBOLoginData;

@Entity("loginUsers")
public class FACTBOLoginDataImplBase extends FACTBOLoginData {
	
	// serial number
	private static final long serialVersionUID = -8867467185628605489L;
	
	@Id 
	protected Long 	userId;
	
	public FACTBOLoginDataImplBase() {
		super();
	}
	
	public FACTBOLoginDataImplBase(String email, String hash, boolean pendingAccept, int rolType) {
		super(email, hash, pendingAccept, rolType);
	}

	@Override
	public Long getUserId() {
		return userId;
	}

	@Override
	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
