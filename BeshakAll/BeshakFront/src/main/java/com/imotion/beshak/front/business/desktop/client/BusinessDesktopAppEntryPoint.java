package com.imotion.beshak.front.business.desktop.client;

import com.google.gwt.user.client.ui.RootPanel;
import com.imotion.beshak.front.business.client.BusinessBaseAppEntryPoint;
import com.selene.arch.exe.gwt.client.presenter.base.AEGWTBaseAppController.WEB_VERSION;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class BusinessDesktopAppEntryPoint extends BusinessBaseAppEntryPoint {

	@Override
	protected void go() {
		RootPanel rootPanel = RootPanel.get();
		BusinessDesktopAppController controller = new BusinessDesktopAppController();
		controller.setPhoneGap(getPhoneGap());
		controller.initController(rootPanel, WEB_VERSION.DESKTOP);
		removeSplashIcon();
	}

}
