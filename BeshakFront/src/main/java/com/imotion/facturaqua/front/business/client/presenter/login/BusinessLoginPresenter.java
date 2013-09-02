package com.imotion.facturaqua.front.business.client.presenter.login;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.Response;
import com.google.gwt.http.client.URL;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONString;
import com.imotion.facturaqua.front.business.client.presenter.BusinessPresenterBaseConstants;
import com.selene.arch.base.exe.core.appli.metadata.element.AEMFTMetadataElementComposite;
import com.selene.arch.base.exe.core.appli.metadata.element.factory.AEMFTMetadataElementConstructorBasedFactory;
import com.selene.arch.exe.gwt.client.presenter.login.AEGWTLoginPresenter;

public class BusinessLoginPresenter extends AEGWTLoginPresenter implements BusinessLoginPresenterConstants {

	public BusinessLoginPresenter(BusinessLoginDisplay view) {
		super(view);
	}

	@Override
	public String getApplicationId() {
		return BusinessPresenterBaseConstants.APPLICATION_ID;
	}

	@Override
	protected void dispatchSingIn() {
		RequestBuilder builder = new RequestBuilder(RequestBuilder.POST, URL.encode("/businessDesktop/genericServerConnectionGWT"));

		AEMFTMetadataElementComposite fruta = AEMFTMetadataElementConstructorBasedFactory.getMonoInstance().getComposite();
		fruta.addElement("1", "Pera");
		fruta.addElement("2", "Manzana");

		AEMFTMetadataElementComposite carne = AEMFTMetadataElementConstructorBasedFactory.getMonoInstance().getComposite();
		carne.addElement("1", "Cordero");
		carne.addElement("2", "Ternera");

		AEMFTMetadataElementComposite comida = AEMFTMetadataElementConstructorBasedFactory.getMonoInstance().getComposite();
		comida.addElement("Fruta", fruta);
		comida.addElement("Carne", carne);

		Map<String, String> map = new HashMap<String, String>();
		comida.toPlainMap(map, null);


		JSONObject json = fromHashMapToJSONObject(map);


		try {
			  Request request = builder.sendRequest(json.toString(), new RequestCallback() {
			    @Override
				public void onError(Request request, Throwable exception) {
			       // Couldn't connect to server (could be timeout, SOP violation, etc.)
			    }

			    @Override
				public void onResponseReceived(Request request, Response response) {
			      if (200 == response.getStatusCode()) {
			          // Process the response in response.getText()
			      } else {
			        // Handle the error.  Can get the status text from response.getStatusText()
			      }
			    }
			  });
			} catch (RequestException e) {
			  // Couldn't connect to server
			}

	}

	private JSONObject fromHashMapToJSONObject(Map<String, String> map) {
		JSONObject json = new JSONObject();

		 Iterator<Entry<String, String>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<java.lang.String, java.lang.String> entry = iterator
					.next();

			JSONString value = new JSONString(entry.getValue());
			json.put(entry.getKey(), value);
		}

		return json;

	}

}
