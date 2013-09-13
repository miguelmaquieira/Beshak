package com.imotion.beshak.bom.data.morphia;

import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import com.imotion.beshak.bom.data.BSKBOLoginData;

@Entity("loginUsers")
public class BSKBOLoginDataMorphia extends BSKBOLoginData {
	
	// serial number
	private static final long serialVersionUID = -8867467185628605489L;
	
	@Id
	protected ObjectId morphiaUserId;
	
	protected Long userId;
	
	public BSKBOLoginDataMorphia() {
		super();
	}
	
	public BSKBOLoginDataMorphia(String email, String hash, boolean pendingAccept, int rolType) {
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
