package com.imotion.beshak.front.business.desktop.test.client;

import com.imotion.beshak.front.business.desktop.client.BusinessDesktopAppController;
import com.imotion.beshak.front.business.desktop.test.client.presenter.test.TestPresenter;
import com.imotion.beshak.front.business.desktop.test.client.view.test.TestDesktopScreenView;
import com.selene.arch.exe.gwt.mvp.AEGWTIPresenter;

public class TestDesktopAppController extends BusinessDesktopAppController {

	@Override
	protected AEGWTIPresenter getPresenter(String[] tokenElements) {
		AEGWTIPresenter presenter = null;
		presenter = super.getPresenter(tokenElements);
		if (presenter == null) {

			String token1 = tokenElements[0];

			if ("test".equals(token1)) {
				presenter = new TestPresenter(new TestDesktopScreenView());
			}
		}

		return presenter;
	}
}
