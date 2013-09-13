package com.imotion.beshak.front.business.touch.client.view.info;

import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.imotion.beshak.front.business.touch.client.view.BusinessTouchPanelLoggedView;
import com.imotion.beshak.front.business.touch.client.view.widget.header.BusinessHeaderTouchDeclarativeView;
import com.selene.arch.base.exe.core.appli.metadata.element.AEMFTMetadataElementComposite;
import com.selene.arch.exe.gwt.client.presenter.error.AEGWTErrorDisplay;
import com.selene.arch.exe.gwt.client.presenter.info.AEGWTInfoDisplay;
import com.selene.arch.exe.gwt.client.ui.widget.common.AEGWTCommonOptionsContainer;
import com.selene.arch.exe.gwt.client.ui.widget.info.AEGWTTouchInfoWidget;
import com.selene.arch.exe.gwt.client.ui.widget.label.AEGWTLabel;

public class BusinessTouchInfoScreenView extends BusinessTouchPanelLoggedView implements AEGWTInfoDisplay, AEGWTErrorDisplay{

	public static final String NAME = "BusinessTouchInfoScreenView";
	
	private AEGWTCommonOptionsContainer 			options;
	private AEGWTLabel								infoPanel;
	private AEGWTTouchInfoWidget					infoWidget;
	
	public BusinessTouchInfoScreenView() {
		VerticalPanel vcContainer = new VerticalPanel();
		initContentPanel(vcContainer);
		vcContainer.setStyleName("fact-touch-headerSubHeaderScreenContainer");
				
		options = createOptionsContainer();
		((BusinessHeaderTouchDeclarativeView) getHeader()).addSubHeader(options);
		options.setWidth("100%");
		
		//InfoLabel
		infoPanel = new AEGWTLabel();
		options.setBottom(infoPanel);
		infoPanel.setTextAlign(HasHorizontalAlignment.ALIGN_CENTER);
		infoPanel.addStyleName("fact-touch-infoLabel");
		
		infoWidget = new AEGWTTouchInfoWidget();
		vcContainer.add(infoWidget);
		infoWidget.setWidth("100%");
	}
	
	public void setInfoPanelMessage(String infoMessage) {
		infoPanel.setText(infoMessage);
	}
	
	public void setInfoMessage(String infoMessage) {
		infoWidget.setInfoMessage(infoMessage);
	}
	
	public void setActionButtonText(String text) {
		infoWidget.setActionButtonText(text);
	}
	
	protected final AEGWTCommonOptionsContainer getOptionsContainer() {
		if (options == null) {
			options = createOptionsContainer();
		}
		return options;
	}

	protected AEGWTCommonOptionsContainer createOptionsContainer() {
		return new AEGWTCommonOptionsContainer();
	}
	
	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public void setData(AEMFTMetadataElementComposite data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public HasClickHandlers getHomeButton() {
		return getHeaderDisplay().getAnchorLogo();
	}
}
