package com.imotion.beshak.front.business.client.presenter.password;

import com.imotion.beshak.front.business.client.BusinessBaseAppControllerConstants;
import com.selene.arch.base.bom.AEMFTILoginDataConstants;

public interface BusinessResetPasswordPresenterConstants {

	public static final String NAME = "BusinessResetPasswordPresenterConstants";

	//INFO constants
	public static final String INFO_TITLE_TEXT 			= BusinessBaseAppControllerConstants.INFO_TITLE_TEXT;
	public static final String INFO_DESCRIPTION_TEXT 	= BusinessBaseAppControllerConstants.INFO_DESCRIPTION_TEXT;
	public static final String INFO_IMG_ICON_URL 		= BusinessBaseAppControllerConstants.INFO_IMAGE_ICON_URL;

	public static final String[] IN_MAPPING = { 
												AEMFTILoginDataConstants.RESET_ID
												};
}
