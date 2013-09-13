package com.imotion.beshak.front.business.client.presenter;

import com.selene.arch.exe.gwt.client.presenter.base.AEGWTBasePresenter;
import com.selene.arch.exe.gwt.mvp.AEGWTCompositePanelViewDisplay;

public abstract class BusinessPresenterBase<T extends AEGWTCompositePanelViewDisplay> extends AEGWTBasePresenter<T> implements BusinessPresenterBaseConstants {
	
	public BusinessPresenterBase(T view) {
		super(view);
	}
	
	@Override 
	public String getApplicationId() {
		return BusinessPresenterBaseConstants.APPLICATION_ID;
	}
	
	/****************************************************************************
	 *                          PRIVATE FUNCTIONS
	 ****************************************************************************/
}
