package com.imotion.facturaqua.front.business.desktop.client.view.info;

import com.google.gwt.user.client.ui.ComplexPanel;
import com.imotion.facturaqua.front.business.desktop.client.view.widget.common.BusinessNotLoggedScreenContainer;
import com.selene.arch.exe.gwt.client.ui.widget.AEGWTCompositePanel;
import com.selene.arch.exe.gwt.client.view.info.AEGWTDesktopInfoScreenView;

public class BusinessDesktopInfoScreenView extends AEGWTDesktopInfoScreenView {

	public BusinessDesktopInfoScreenView(boolean screenError) {
		super(screenError);
		setTitleStylename("fact-businessErrorPage-headerError");
		setDescriptionStylename("fact-businessErrorPage-descError");
	}

	@Override
	protected AEGWTCompositePanel createContaninerScreen(ComplexPanel content) {
		BusinessNotLoggedScreenContainer container = new BusinessNotLoggedScreenContainer();
		container.setContent(content);
		return container;
	}
}
