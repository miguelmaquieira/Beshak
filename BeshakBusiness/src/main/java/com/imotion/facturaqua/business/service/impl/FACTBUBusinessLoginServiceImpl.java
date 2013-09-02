package com.imotion.facturaqua.business.service.impl;

import com.imotion.facturaqua.business.service.FACTBUBusinessWrapperPersistence;
import com.imotion.facturaqua.business.service.FACTBUIBusinessCommonServiceTrace;
import com.imotion.facturaqua.business.service.FACTBUIBusinessLoginService;
import com.imotion.facturaqua.business.service.FACTBUIBusinessLoginServiceConstant;
import com.selene.arch.base.bom.data.AEMFTLoginData;
import com.selene.arch.base.exe.core.appli.businesswrapper.AEMFTIBusinessModelConstant;
import com.selene.arch.base.exe.core.appli.metadata.element.AEMFTMetadataElementComposite;
import com.selene.arch.exe.bus.login.AEMFTBusinessLoginServiceImpl;
import com.selene.arch.exe.core.envi.login.AEMFTILoginService;

@SuppressWarnings("serial")
public class FACTBUBusinessLoginServiceImpl extends AEMFTBusinessLoginServiceImpl<FACTBUBusinessWrapperPersistence> implements FACTBUIBusinessLoginService, FACTBUIBusinessLoginServiceConstant {

	@Override
	public void isValidSession() {
		super.isValidSession();
		// Check if any error
		String error = null; // TODO getError();
		if (error == null) {
			loadUserData(getContext().getContextDataIN(), getContext().getContextOUT());
		}
	}

	@Override
	public void processLogin() {
		super.processLogin();
		// Check if any error
		String error = null; // TODO getError();
		if (error == null) {
			loadUserData(getContext().getContextDataIN(), getContext().getContextOUT());
		}
	}

	@Override
	public void processNewUser() {
		super.processNewUser();
		/*boolean businessDuplication = getElementDataController().getElementAsBoolean(DUPLICATED_BUSINESS_NAME_ERROR, getContext().getContextOUT());
		if (businessDuplication) {
			getContext().getContextOUT().addElement(AEMFTLoginDataConstant.LOGIN_RESULT, LoginResult.BUSINESS_NAME_TAKEN.toString());
		}*/
	}

	@Override
	public void processActivateUser() {
		super.processActivateUser();
		// Check if any error
		String error = getError();
		if (error == null) {
			loadUserData(getContext().getContextDataIN(), getContext().getContextOUT());
		}
	}

	@Override
	public String getName() {
		return FACTBUIBusinessLoginServiceConstant.CTE_BUSINESS_LOGIN_SERVICE_NAME;
	}
	
	@Override
	protected void setLoginContextOut(AEMFTLoginData loginData) {
		super.setLoginContextOut(loginData);
	}
	
	@Override
	protected AEMFTLoginData newUserPostProcess(AEMFTLoginData loginData) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String getDataBaseVersion() {
		String version = null;
		if (version == null) {
			// ini-trace
			// TODO no se ha podido recuperar la version de la BD, commonPersistence = ?, CommonProperties = ?, Clave de b�squeda = AEMFTICommonPropertiesDataConstant.KEY_VERSION
			// end-trace
		}
		return version;
	}

	@Override
	protected FACTBUBusinessWrapperPersistence createPersistenceWrapper() {
		return new FACTBUBusinessWrapperPersistence();
	}

	/********************************************************************
	 * 				       PRIVATE FUNCTIONS				    	    *
	 ********************************************************************/
	
	private void loadUserData(AEMFTMetadataElementComposite contextDataIN, AEMFTMetadataElementComposite contextOUT) {
		
	}

	private void loadBusinessUserData(AEMFTMetadataElementComposite clientData, AEMFTMetadataElementComposite serverData) {
		
	}


	private void createBusinessData(AEMFTMetadataElementComposite contextIn, AEMFTILoginService loginService) {
		
	}

	private void createBusinessUser(AEMFTMetadataElementComposite contextIn, AEMFTILoginService loginService) {

	}

	private String getError() {
		return getElementDataController().getElementAsString(AEMFTIBusinessModelConstant.CTE_MFT_AE_SERVER_SERVICE_COMM_CONTEXT_ERROR_LITERAL ,getContext().getContextOUT());
	}



	/********************************************************************
	 * 								TRACES								*
	 ********************************************************************/
	@Override
	public void traceNullElement(String serviceName, String methodName) {
		traceNullElement(serviceName, methodName, "unknown");
	}

	public void traceNullElement(String serviceName, String methodName , String elementType ) {
		Object[] params = new Object[3];
		params[0] = serviceName;
		params[1] = methodName;
		params[2] = elementType;
		getTrace().trace(FACTBUIBusinessCommonServiceTrace.CTE_BUSINESS_SERVICE_NULL_ELEMENT_TRACE, params);
	}
	
	private void traceNullParameter(String parameterValue, String methodName, String paramName) {
		if (parameterValue == null || parameterValue.isEmpty()) {
			traceNullParameter(methodName, paramName);
		}
	}
}
