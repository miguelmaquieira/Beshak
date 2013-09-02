package com.imotion.facturaqua.front.business.client.presenter.logout;

import com.imotion.facturaqua.front.business.client.presenter.BusinessPresenterBaseConstants;
import com.selene.arch.exe.gwt.client.presenter.login.AEGWTLogoutDisplay;
import com.selene.arch.exe.gwt.client.presenter.login.AEGWTLogoutPresenter;

public class BusinessLogoutPresenter extends AEGWTLogoutPresenter {

	public BusinessLogoutPresenter(AEGWTLogoutDisplay view) {
		super(view);
	}
	
	@Override
	public String getApplicationId() {
		return BusinessPresenterBaseConstants.APPLICATION_ID;
	}

}
