package com.imotion.beshak.front.business.client.presenter.signup;

import com.imotion.beshak.front.business.client.presenter.BusinessDesktopScreenViewDisplay;
import com.selene.arch.exe.gwt.client.presenter.signup.AEGWTSignUpDisplay;


public interface BusinessSignUpDisplay extends BusinessDesktopScreenViewDisplay, AEGWTSignUpDisplay {
	
	public String getUserFirstName();
	public String getUserLastName();
	public String getUserPhone();
}
