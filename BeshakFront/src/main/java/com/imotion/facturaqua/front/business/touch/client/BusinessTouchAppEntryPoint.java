package com.imotion.facturaqua.front.business.touch.client;

import com.google.gwt.user.client.ui.RootPanel;
import com.imotion.facturaqua.front.business.client.BusinessBaseAppEntryPoint;
import com.selene.arch.exe.gwt.client.presenter.base.AEGWTBaseAppController.WEB_VERSION;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class BusinessTouchAppEntryPoint extends BusinessBaseAppEntryPoint {

	@Override
	protected void go() {
		RootPanel rootPanel = RootPanel.get();
		BusinessTouchAppController controller = new BusinessTouchAppController();
		controller.setPhoneGap(getPhoneGap());
		controller.initController(rootPanel, WEB_VERSION.TOUCH);
		removeSplashIcon();
	}

}
