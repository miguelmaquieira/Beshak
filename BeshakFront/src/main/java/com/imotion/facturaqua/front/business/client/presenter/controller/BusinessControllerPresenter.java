package com.imotion.facturaqua.front.business.client.presenter.controller;

import com.imotion.facturaqua.front.business.client.presenter.BusinessPresenterBaseConstants;
import com.selene.arch.exe.gwt.client.presenter.controller.AEGWTControllerDisplay;
import com.selene.arch.exe.gwt.client.presenter.controller.AEGWTControllerPresenter;

public class BusinessControllerPresenter extends AEGWTControllerPresenter {

	public BusinessControllerPresenter(AEGWTControllerDisplay view) {
		super(view);
	}
	
	@Override
	public String getApplicationId() {
		return BusinessPresenterBaseConstants.APPLICATION_ID;
	}

}
