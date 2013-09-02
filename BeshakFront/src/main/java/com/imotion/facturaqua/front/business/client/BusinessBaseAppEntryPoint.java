package com.imotion.facturaqua.front.business.client;

import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.RootPanel;
import com.selene.arch.exe.gwt.mvp.SailorEntryPoint;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public abstract class BusinessBaseAppEntryPoint extends SailorEntryPoint {

	protected void removeSplashIcon() {
		Element body = RootPanel.getBodyElement();
		Element progressIcon = DOM.getElementById("progressIcon"); 
		DOM.removeChild(body, progressIcon);
	}

}
