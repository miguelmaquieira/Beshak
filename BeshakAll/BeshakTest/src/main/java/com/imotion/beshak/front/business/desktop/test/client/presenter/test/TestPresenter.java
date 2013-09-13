package com.imotion.beshak.front.business.desktop.test.client.presenter.test;

import java.util.Date;

import com.google.gwt.i18n.client.LocaleInfo;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.imotion.beshak.front.business.desktop.test.client.common.TestCommonConstants;
import com.selene.arch.base.exe.core.appli.metadata.element.AEMFTMetadataElementComposite;
import com.selene.arch.exe.gwt.client.presenter.base.AEGWTBasePresenter;
import com.selene.arch.exe.gwt.client.service.comm.AEGWTCommClientAsynchCallbackRequest;
import com.selene.arch.exe.gwt.client.ui.widget.chat.AEGWTChatMessage;
import com.selene.arch.exe.gwt.mvp.AEGWTIPresenter;
import com.selene.arch.exe.gwt.mvp.event.logic.AEGWTHasLogicalEventHandlers;
import com.selene.arch.exe.gwt.mvp.event.logic.AEGWTLogicalEvent;
import com.selene.arch.exe.gwt.mvp.event.logic.AEGWTLogicalEventTypes.LOGICAL_TYPE;

public class TestPresenter extends AEGWTBasePresenter<TestDisplay> implements AEGWTHasLogicalEventHandlers, AEGWTIPresenter {

	public TestPresenter(TestDisplay view) {
		super(view);
	}

	@Override
	public String getApplicationId() {
		return "FACT";
	}

	@Override
	public String getModuleId() {
		return getView().getModuleId();
	}

	@Override
	protected void bind() {
		getLogicalEventHandlerManager().addEventHandler(AEGWTHasLogicalEventHandlers.TYPE,this);


		getClientServerConnection().getPropertyList("business_services", LocaleInfo.getCurrentLocale().getLocaleName() , new AsyncCallback<AEMFTMetadataElementComposite>() {


			@Override
			public void onSuccess(AEMFTMetadataElementComposite result) {
				getView().setData(result);
			}

			@Override
			public void onFailure(Throwable caught) {
				getView().recoveryDataError();
			}
		});

		recoveryConversation();
	}

	@Override
	public String getName() {
		return TestPresenterConstants.NAME;
	}

	private void runServiceId(String serviceId, AEMFTMetadataElementComposite dataIN) {
		getClientServerConnection().executeComm(dataIN,
										serviceId,

										new AEGWTCommClientAsynchCallbackRequest<AEMFTMetadataElementComposite>(this) {

											@Override
											public void onResult(AEMFTMetadataElementComposite dataResult) {
												getView().serviceResultOK();
											}

											@Override
											public void onError(Throwable th) {
												getView().serviceResultKO();
											}
										});
	}


	private void recoveryConversation(){

		getContextDataController().setElement("CHAT" + TestCommonConstants.ELEMENT_SEPARATOR + "0" + TestCommonConstants.ELEMENT_SEPARATOR + AEGWTChatMessage.MESSAGE_TEXT, "Hola");
		getContextDataController().setElement("CHAT" + TestCommonConstants.ELEMENT_SEPARATOR + "0" + TestCommonConstants.ELEMENT_SEPARATOR + AEGWTChatMessage.MESSAGE_HOUR, (new Date()).getTime());
		getContextDataController().setElement("CHAT" + TestCommonConstants.ELEMENT_SEPARATOR + "0" + TestCommonConstants.ELEMENT_SEPARATOR + AEGWTChatMessage.MESSAGE_ISSEND, true);

		getContextDataController().setElement("CHAT" + TestCommonConstants.ELEMENT_SEPARATOR + "1" + TestCommonConstants.ELEMENT_SEPARATOR + AEGWTChatMessage.MESSAGE_TEXT, "Hola, que tal?");
		getContextDataController().setElement("CHAT" + TestCommonConstants.ELEMENT_SEPARATOR + "1" + TestCommonConstants.ELEMENT_SEPARATOR + AEGWTChatMessage.MESSAGE_HOUR, (new Date()).getTime());
		getContextDataController().setElement("CHAT" + TestCommonConstants.ELEMENT_SEPARATOR + "1" + TestCommonConstants.ELEMENT_SEPARATOR + AEGWTChatMessage.MESSAGE_ISSEND, false);

		getContextDataController().setElement("CHAT" + TestCommonConstants.ELEMENT_SEPARATOR + "2" + TestCommonConstants.ELEMENT_SEPARATOR + AEGWTChatMessage.MESSAGE_TEXT, "Bien y tu?");
		getContextDataController().setElement("CHAT" + TestCommonConstants.ELEMENT_SEPARATOR + "2" + TestCommonConstants.ELEMENT_SEPARATOR + AEGWTChatMessage.MESSAGE_HOUR, (new Date()).getTime());
		getContextDataController().setElement("CHAT" + TestCommonConstants.ELEMENT_SEPARATOR + "2" + TestCommonConstants.ELEMENT_SEPARATOR + AEGWTChatMessage.MESSAGE_ISSEND, true);


		getContextDataController().setElement("CHAT" + TestCommonConstants.ELEMENT_SEPARATOR + "3" + TestCommonConstants.ELEMENT_SEPARATOR + AEGWTChatMessage.MESSAGE_TEXT, "Pues muy bien tb, gracias por preguntar. Una cosa...");
		getContextDataController().setElement("CHAT" + TestCommonConstants.ELEMENT_SEPARATOR + "3" + TestCommonConstants.ELEMENT_SEPARATOR + AEGWTChatMessage.MESSAGE_HOUR, (new Date()).getTime());
		getContextDataController().setElement("CHAT" + TestCommonConstants.ELEMENT_SEPARATOR + "3" + TestCommonConstants.ELEMENT_SEPARATOR + AEGWTChatMessage.MESSAGE_ISSEND, false);

		getContextDataController().setElement("CHAT" + TestCommonConstants.ELEMENT_SEPARATOR + "4" + TestCommonConstants.ELEMENT_SEPARATOR + AEGWTChatMessage.MESSAGE_TEXT, "Esto es un Mensaje recibido. Mensaje recibido. Mensaje recibido. Mensaje recibido. Mensaje recibido.");
		getContextDataController().setElement("CHAT" + TestCommonConstants.ELEMENT_SEPARATOR + "4" + TestCommonConstants.ELEMENT_SEPARATOR + AEGWTChatMessage.MESSAGE_HOUR, (new Date()).getTime());
		getContextDataController().setElement("CHAT" + TestCommonConstants.ELEMENT_SEPARATOR + "4" + TestCommonConstants.ELEMENT_SEPARATOR + AEGWTChatMessage.MESSAGE_ISSEND, false);


		getContextDataController().setElement("CHAT" + TestCommonConstants.ELEMENT_SEPARATOR + "5" + TestCommonConstants.ELEMENT_SEPARATOR + AEGWTChatMessage.MESSAGE_TEXT, "Este mensaje ha sido enviado por mi. Este mensaje ha sido enviado. Este mensaje ha sido enviado ");
		getContextDataController().setElement("CHAT" + TestCommonConstants.ELEMENT_SEPARATOR + "5" + TestCommonConstants.ELEMENT_SEPARATOR + AEGWTChatMessage.MESSAGE_HOUR, (new Date()).getTime());
		getContextDataController().setElement("CHAT" + TestCommonConstants.ELEMENT_SEPARATOR + "5" + TestCommonConstants.ELEMENT_SEPARATOR + AEGWTChatMessage.MESSAGE_ISSEND, true);


		getContextDataController().setElement("CHAT" + TestCommonConstants.ELEMENT_SEPARATOR + "6" + TestCommonConstants.ELEMENT_SEPARATOR + AEGWTChatMessage.MESSAGE_TEXT, "Mensaje corto recibido");
		getContextDataController().setElement("CHAT" + TestCommonConstants.ELEMENT_SEPARATOR + "6" + TestCommonConstants.ELEMENT_SEPARATOR + AEGWTChatMessage.MESSAGE_HOUR, (new Date()).getTime());
		getContextDataController().setElement("CHAT" + TestCommonConstants.ELEMENT_SEPARATOR + "6" + TestCommonConstants.ELEMENT_SEPARATOR + AEGWTChatMessage.MESSAGE_ISSEND, false);

		getContextDataController().setElement("CHAT" + TestCommonConstants.ELEMENT_SEPARATOR + "7" + TestCommonConstants.ELEMENT_SEPARATOR + AEGWTChatMessage.MESSAGE_TEXT, "Enviado");
		getContextDataController().setElement("CHAT" + TestCommonConstants.ELEMENT_SEPARATOR + "7" + TestCommonConstants.ELEMENT_SEPARATOR + AEGWTChatMessage.MESSAGE_HOUR, (new Date()).getTime());
		getContextDataController().setElement("CHAT" + TestCommonConstants.ELEMENT_SEPARATOR + "7" + TestCommonConstants.ELEMENT_SEPARATOR + AEGWTChatMessage.MESSAGE_ISSEND, true);

		getContextDataController().setElement("CHAT" + TestCommonConstants.ELEMENT_SEPARATOR + "8" + TestCommonConstants.ELEMENT_SEPARATOR + AEGWTChatMessage.MESSAGE_TEXT, "Otro mensaje enviado");
		getContextDataController().setElement("CHAT" + TestCommonConstants.ELEMENT_SEPARATOR + "8" + TestCommonConstants.ELEMENT_SEPARATOR + AEGWTChatMessage.MESSAGE_HOUR, (new Date()).getTime());
		getContextDataController().setElement("CHAT" + TestCommonConstants.ELEMENT_SEPARATOR + "8" + TestCommonConstants.ELEMENT_SEPARATOR + AEGWTChatMessage.MESSAGE_ISSEND, true);

		getContextDataController().setElement("CHAT" + TestCommonConstants.ELEMENT_SEPARATOR + "8" + TestCommonConstants.ELEMENT_SEPARATOR + AEGWTChatMessage.MESSAGE_TEXT, "Hola soy Felipe como estás?");
		getContextDataController().setElement("CHAT" + TestCommonConstants.ELEMENT_SEPARATOR + "8" + TestCommonConstants.ELEMENT_SEPARATOR + AEGWTChatMessage.MESSAGE_HOUR, (new Date()).getTime());
		getContextDataController().setElement("CHAT" + TestCommonConstants.ELEMENT_SEPARATOR + "8" + TestCommonConstants.ELEMENT_SEPARATOR + AEGWTChatMessage.MESSAGE_ISSEND, false);




		AEMFTMetadataElementComposite data = getContextDataController().getContext();
		getView().setData(data);


	}



	@Override
	public void dispatchEvent(AEGWTLogicalEvent evt) {
		String serviceName 	= evt.getElementAsString(TestDisplay.KEY_SERVICE_NAME);
		String serviceId 	= evt.getElementAsString(TestDisplay.KEY_SERVICE_ID);
		String methodName	= evt.getElementAsString(TestDisplay.KEY_METHOD_NAME);

		if (LOGICAL_TYPE.GET_EVENT.equals(evt.getEventType())) {
			AEMFTMetadataElementComposite dataIn = evt.getElementAsComposite(TestDisplay.KEY_SERVICE_CONTEXT_IN);
			runServiceId(serviceId, dataIn);
		}
	}

	@Override
	public boolean isDispatchEventType(LOGICAL_TYPE type) {
		return type == LOGICAL_TYPE.NAVIGATE_EVENT 	||
				type == LOGICAL_TYPE.EDIT_EVENT		||
				type == LOGICAL_TYPE.GET_EVENT;
	}

	private String getServiceId(String serviceName, String methodName) {
		String serviceId = null;
		if (serviceName != null && methodName != null) {
			if (serviceName.equals("Pdf") && (methodName.equals("createPdf") || methodName.equals("sendPdf"))) {
				serviceId = serviceName + "." + methodName;
			}
		}
		return serviceId;
	}
}
