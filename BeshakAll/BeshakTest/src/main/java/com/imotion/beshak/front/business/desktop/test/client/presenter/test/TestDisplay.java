package com.imotion.beshak.front.business.desktop.test.client.presenter.test;

import com.selene.arch.exe.gwt.mvp.AEGWTCompositePanelViewDisplay;


public interface TestDisplay extends AEGWTCompositePanelViewDisplay {

	public static final String KEY_SERVICE_ID 			= "SERVICE_ID";
	public static final String KEY_SERVICE_CONTEXT_IN 	= "CONTEXT_IN";
	public static final String KEY_METHOD_NAME 			= "METHDO_NAME";
	public static final String KEY_SERVICE_NAME 		= "SERVICE_NAME";

	public void recoveryDataError();
	public void serviceResultKO();
	public void serviceResultOK();
	public String getModuleId();
}
