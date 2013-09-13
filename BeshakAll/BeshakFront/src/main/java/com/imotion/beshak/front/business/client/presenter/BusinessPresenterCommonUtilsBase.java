package com.imotion.beshak.front.business.client.presenter;

import com.selene.arch.base.exe.core.appli.metadata.AEMFTIMetadataContextController;
import com.selene.arch.base.exe.core.appli.metadata.element.AEMFTIMetadataElementController;
import com.selene.arch.exe.gwt.client.presenter.base.AEGWTBasePresenter;
import com.selene.arch.exe.gwt.client.service.model.AEGWTIClientService;
import com.selene.arch.exe.gwt.client.ui.message.AEGWTMessageDisplay;
import com.selene.arch.exe.gwt.mvp.AEGWTCompositePanelViewDisplay;
import com.selene.arch.exe.gwt.mvp.event.AEGWTIEventHandlerManager;

public abstract class BusinessPresenterCommonUtilsBase {

	@SuppressWarnings("rawtypes")
	protected abstract AEGWTBasePresenter 				getPresenter();
	protected abstract AEGWTCompositePanelViewDisplay 	getView();
	
	protected AEMFTIMetadataContextController getContextDataController() {
		return getPresenter().getContextDataController();
	}

	protected AEGWTIEventHandlerManager getLogicalEventHandlerManager() {
		return getPresenter().getLogicalEventHandlerManager();
	}

	protected AEMFTIMetadataElementController getElementDataController() {
		return getPresenter().getElementDataController();
	}

	protected AEGWTIClientService getClientServerConnection() {
		return getPresenter().getClientServerConnection();
	}

	protected AEGWTMessageDisplay getMessageDisplay() {
		return getPresenter().getMessageDisplay();
	}
	
	protected void fireNavigationEvent(String sourceWidget) {
		getPresenter().fireNavigationEvent(sourceWidget);
	}
	
	protected String getName() {
		return getPresenter().getName();
	}
	
	protected String getWindowName() {
		return getView().getWindowName();
	}
	
}
