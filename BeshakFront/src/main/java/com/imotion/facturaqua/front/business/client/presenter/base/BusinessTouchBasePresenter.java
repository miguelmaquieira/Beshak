package com.imotion.facturaqua.front.business.client.presenter.base;

import com.imotion.facturaqua.front.business.client.presenter.BusinessTouchScreenViewLoggedDisplay;

public abstract class BusinessTouchBasePresenter<T extends BusinessTouchScreenViewLoggedDisplay> extends BusinessBaseLoggedPresenter<T> {

	public BusinessTouchBasePresenter(T view) {
		super(view);
	}

	@Override
	protected void bind() {
		
	}
		
	/****************************************************************************
	 *                          PRIVATE FUNCTIONS
	 ****************************************************************************/
}
