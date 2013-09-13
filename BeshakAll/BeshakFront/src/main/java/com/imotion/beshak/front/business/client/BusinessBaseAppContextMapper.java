package com.imotion.beshak.front.business.client;

import java.util.HashMap;

import com.selene.arch.base.exe.core.appli.metadata.element.AEMFTMetadataElement;
import com.selene.arch.exe.gwt.client.presenter.base.AEGWTBaseAppController;
import com.selene.arch.exe.gwt.client.presenter.base.AEGWTBasePresenter;

public abstract class BusinessBaseAppContextMapper {

	private AEGWTBaseAppController appController; 
	private HashMap<String, HashMap<String, String>> mappingHash;

	public BusinessBaseAppContextMapper(AEGWTBaseAppController appController) {
		this.appController = appController;
		initMappingkeys();
	}

	public <T extends AEGWTBasePresenter<?>> void inMapping(T presenter) {
		String[] inMapping = presenter.getInMapping();
		if (inMapping != null) {
			for (String destinationKey: inMapping) {
				String sourceAppControllerKey = getMappingKey(presenter.getName(), destinationKey);
				if (sourceAppControllerKey == null) {
					sourceAppControllerKey = destinationKey;
				}
				
				AEMFTMetadataElement appControllerContext =  appController.getContextDataController().getElement(sourceAppControllerKey);
				if(appControllerContext != null) {
					appControllerContext = appControllerContext.cloneObject();
				}
				presenter.getContextDataController().setElement(destinationKey, appControllerContext);
			}
		}
	}
	
	protected HashMap<String, HashMap<String, String>> getMappingHash() {
		if (mappingHash == null) {
			mappingHash = new HashMap<String, HashMap<String,String>>();
		}
		return mappingHash;
	}

	protected abstract void initMappingkeys();

	private String getMappingKey(String presenterName, String destinationKey) {
		HashMap<String, String> presenterMap = getMappingHash().get(presenterName);
		String mappingKey = null;
		if (presenterMap != null) {
			mappingKey = presenterMap.get(destinationKey);
		}
		return mappingKey;
	}
}
