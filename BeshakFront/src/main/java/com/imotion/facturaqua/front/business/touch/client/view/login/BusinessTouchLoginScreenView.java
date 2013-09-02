package com.imotion.facturaqua.front.business.touch.client.view.login;

import com.imotion.facturaqua.front.business.client.presenter.login.BusinessLoginDisplay;
import com.selene.arch.base.exe.core.appli.metadata.element.AEMFTMetadataElementComposite;
import com.selene.arch.exe.gwt.client.business.ui.view.login.AEGWTBusinessTouchLoginScreenView;

public class BusinessTouchLoginScreenView extends AEGWTBusinessTouchLoginScreenView implements BusinessLoginDisplay {

	private static final String NAME = "BusinessLoginTouchScreenView";

	@Override
	public void setData(AEMFTMetadataElementComposite data) {
		// TODO Auto-generated method stub
	}

	@Override
	public String getName() {
		return NAME;
	}
}
