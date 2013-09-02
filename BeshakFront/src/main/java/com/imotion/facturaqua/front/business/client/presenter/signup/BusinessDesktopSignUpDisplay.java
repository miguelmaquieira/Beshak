package com.imotion.facturaqua.front.business.client.presenter.signup;

import com.imotion.facturaqua.front.business.client.presenter.BusinessDesktopScreenViewDisplay;

public interface BusinessDesktopSignUpDisplay extends BusinessDesktopScreenViewDisplay, BusinessSignUpDisplay {

	public void setCurrentStep(int currentStep);
	
	public void errorCreatingUser();
}
