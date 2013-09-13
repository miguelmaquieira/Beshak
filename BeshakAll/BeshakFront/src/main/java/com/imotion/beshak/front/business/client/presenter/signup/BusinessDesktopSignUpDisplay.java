package com.imotion.beshak.front.business.client.presenter.signup;

import com.imotion.beshak.front.business.client.presenter.BusinessDesktopScreenViewDisplay;

public interface BusinessDesktopSignUpDisplay extends BusinessDesktopScreenViewDisplay, BusinessSignUpDisplay {

	public void setCurrentStep(int currentStep);
	
	public void errorCreatingUser();
}
