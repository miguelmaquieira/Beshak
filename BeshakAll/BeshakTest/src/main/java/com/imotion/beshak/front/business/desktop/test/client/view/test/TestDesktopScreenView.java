package com.imotion.beshak.front.business.desktop.test.client.view.test;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.imotion.beshak.front.business.desktop.test.client.presenter.test.TestDisplay;
import com.selene.arch.base.exe.core.appli.metadata.element.AEMFTMetadataElementComposite;
import com.selene.arch.exe.gwt.client.ui.widget.combo.AEGWTComboBoxDefaultItemContainer;
import com.selene.arch.exe.gwt.client.ui.widget.combo.AEGWTComboBoxItemContainerDisplay;
import com.selene.arch.exe.gwt.client.ui.widget.combo.AEGWTCustomComboBox;
import com.selene.arch.exe.gwt.client.view.AEGWTCompositeDesktopPanelLoggedView;
import com.selene.arch.exe.gwt.mvp.event.logic.AEGWTLogicalEvent;
import com.selene.arch.exe.gwt.mvp.event.logic.AEGWTLogicalEventTypes.LOGICAL_TYPE;

public class TestDesktopScreenView extends AEGWTCompositeDesktopPanelLoggedView implements TestDisplay {

	private AEGWTCustomComboBox<AEGWTComboBoxItemContainerDisplay> moduleListBox;

	public static String NAME = "TestDesktopScreenView";

	public TestDesktopScreenView() {
		VerticalPanel vcContentPanel = new VerticalPanel();
		vcContentPanel.setSpacing(5);
		initContentPanel(vcContentPanel);

		HorizontalPanel hpServiceIdPanel = new HorizontalPanel();
		hpServiceIdPanel.setSize("300px", "30px");
		vcContentPanel.add(hpServiceIdPanel);

		moduleListBox = new AEGWTCustomComboBox<AEGWTComboBoxItemContainerDisplay>(new AEGWTComboBoxDefaultItemContainer(),
				"Choose one");
		hpServiceIdPanel.add(moduleListBox);
		hpServiceIdPanel.setCellWidth(moduleListBox, "40%");
		hpServiceIdPanel.setCellHorizontalAlignment(moduleListBox, HasHorizontalAlignment.ALIGN_LEFT);
		moduleListBox.addItem("BU", "Business");
		moduleListBox.addItem("PR", "Provider");

		final TextBox txtServiceId = new TextBox();
		txtServiceId.setSize("240px", "20px");
		hpServiceIdPanel.add(txtServiceId);

		Button btServiceId = new Button();
		btServiceId.setText("Execute");
		btServiceId.setSize("60px", "30px");
		hpServiceIdPanel.add(btServiceId);

		btServiceId.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				AEGWTLogicalEvent evt = new AEGWTLogicalEvent(getWindowName(), getName());
				evt.setEventType(LOGICAL_TYPE.GET_EVENT);
				String serviceId = txtServiceId.getText();
				evt.addElementAsString(KEY_SERVICE_ID, serviceId);
				getLogicalEventHandlerManager().fireEvent(evt);
			}
		});
	}

	@Override
	public void setData (AEMFTMetadataElementComposite data) {

	}

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public void recoveryDataError() {
		// TODO Auto-generated method stub

	}

	@Override
	public void serviceResultKO() {
		Window.alert("Execution service error");

	}

	@Override
	public void serviceResultOK() {
		Window.alert("Execution service OK");

	}

	@Override
	public int getHelpStepSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getHelpStreenTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isRememberEnabled() {
		return true;
	}

	@Override
	public void postDisplay() {
		super.postDisplay();
	}

	@Override
	public String getModuleId() {
		return moduleListBox.getSelectedKey();
	}
}
