package com.imotion.beshak.front.business.client.presenter.login;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONString;
import com.imotion.beshak.front.business.client.presenter.BusinessPresenterBaseConstants;
import com.selene.arch.exe.gwt.client.presenter.login.AEGWTLoginPresenter;

public class BusinessLoginPresenter extends AEGWTLoginPresenter implements BusinessLoginPresenterConstants {

	public BusinessLoginPresenter(BusinessLoginDisplay view) {
		super(view);
	}

	@Override
	public String getApplicationId() {
		return BusinessPresenterBaseConstants.APPLICATION_ID;
	}

//	@Override
//	protected void dispatchSingIn() {
//		RequestBuilder builder = new RequestBuilder(RequestBuilder.POST, URL.encode("/businessDesktop/genericServerTest"));
//
//		AEMFTMetadataElementComposite fruta = AEMFTMetadataElementConstructorBasedFactory.getMonoInstance().getComposite();
//		fruta.addElement("1", "Pera");
//		fruta.addElement("2", "Manzana");
//
//		AEMFTMetadataElementComposite carne = AEMFTMetadataElementConstructorBasedFactory.getMonoInstance().getComposite();
//		carne.addElement("1", "Cordero");
//		carne.addElement("2", "Ternera");
//
//		AEMFTMetadataElementComposite comida = AEMFTMetadataElementConstructorBasedFactory.getMonoInstance().getComposite();
//		comida.addElement("Fruta", fruta);
//		comida.addElement("Carne", carne);
//
//		Map<String, String> map = new HashMap<String, String>();
//		comida.toPlainMap(map, null);
//
//
//		JSONObject json = fromHashMapToJSONObject(map);
//
//
//		try {
//			  Request request = builder.sendRequest(json.toString(), new RequestCallback() {
//			    @Override
//				public void onError(Request request, Throwable exception) {
//			    	System.out.println("Bad Error");
//			    }
//
//			    @Override
//				public void onResponseReceived(Request request, Response response) {
//			      if (200 == response.getStatusCode()) {
//
//
//			      } else {
//			    	  System.out.println("Error");
//			      }
//			    }
//			  });
//			} catch (RequestException e) {
//			  // Couldn't connect to server
//			}
//
//	}

	private JSONObject fromHashMapToJSONObject(Map<String, String> map) {
		JSONObject json = new JSONObject();

		JSONObject jsonMap = new JSONObject();

		 Iterator<Entry<String, String>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<java.lang.String, java.lang.String> entry = iterator
					.next();

			JSONString value = new JSONString(entry.getValue());
			jsonMap.put(entry.getKey(), value);
		}
		json.put("ContextIn", jsonMap);

		return json;

	}

}
