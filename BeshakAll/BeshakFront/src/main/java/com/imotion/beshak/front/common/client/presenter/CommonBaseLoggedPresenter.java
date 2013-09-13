package com.imotion.beshak.front.common.client.presenter;

import com.selene.arch.exe.gwt.client.presenter.base.AEGWTBaseLoggedPresenter;

public abstract class CommonBaseLoggedPresenter<T extends CommonScreenViewLoggedDisplay> extends AEGWTBaseLoggedPresenter<T> {

	public CommonBaseLoggedPresenter(T view) {
		super(view);
	}

	@Override
	public String getApplicationId() {
		return CommonPresenterBaseConstants.APPLICATION_ID;
	}
}
