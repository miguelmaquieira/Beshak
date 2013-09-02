package com.imotion.facturaqua.front.business.client.presenter.signup;

import com.imotion.facturaqua.front.business.client.BusinessBaseAppControllerConstants;
import com.selene.arch.exe.gwt.client.presenter.signup.AEGWTSignUpPresenterConstants;

public interface BusinessSignUpPresenterConstants extends AEGWTSignUpPresenterConstants {

	public static final String NAME = "BusinessSigninPresenter";

	// Context keys
	public static final String SIGNUP_DATA 			= "SIGNUP_DATA";
	public static final String SIGNIN_DATA_PREFIX 	= SIGNUP_DATA;
	public final static String SIGNUP_CURRENT_STEP 	= "CURRENT_STEP";

	// Init context
	public static final String[] IN_MAPPING = { 
											SIGNUP_DATA
											};
	
	//INFO constants
	public static final String INFO_TITLE_TEXT 			= BusinessBaseAppControllerConstants.INFO_TITLE_TEXT;
	public static final String INFO_DESCRIPTION_TEXT 	= BusinessBaseAppControllerConstants.INFO_DESCRIPTION_TEXT;
	public static final String INFO_IMG_ICON_URL 		= BusinessBaseAppControllerConstants.INFO_IMAGE_ICON_URL;

}
