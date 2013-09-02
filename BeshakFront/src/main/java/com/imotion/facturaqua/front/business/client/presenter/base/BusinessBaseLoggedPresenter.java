package com.imotion.facturaqua.front.business.client.presenter.base;

import java.util.ArrayList;
import java.util.List;

import com.imotion.facturaqua.front.business.client.presenter.BusinessPresenterBaseConstants;
import com.imotion.facturaqua.front.business.client.presenter.BusinessScreenViewLoggedDisplay;
import com.imotion.facturaqua.front.common.client.presenter.CommonBaseLoggedPresenter;
import com.selene.arch.base.exe.core.appli.metadata.element.AEMFTMetadataElementComposite;
import com.selene.arch.exe.gwt.client.service.comm.AEGWTCommClientAsynchCallbackRequest;
import com.selene.arch.exe.gwt.client.service.comm.AEGWTICommClientConstant;
import com.selene.arch.exe.gwt.mvp.event.navigator.AEGWTHasNavigationEventHandlers;
import com.selene.arch.exe.gwt.mvp.event.pagination.AEGWTHasPaginationEventHandlers;
import com.selene.arch.exe.gwt.mvp.event.pagination.AEGWTPaginationEvent;
import com.selene.arch.exe.gwt.mvp.event.pagination.AEGWTPaginationEventTypes.PAGINATION_TYPE;

public abstract class BusinessBaseLoggedPresenter<T extends BusinessScreenViewLoggedDisplay> extends CommonBaseLoggedPresenter<T>  implements BusinessIPresenter, AEGWTHasPaginationEventHandlers, BusinessPresenterBaseConstants {

	public BusinessBaseLoggedPresenter(T view) {
		super(view);
	}

	@Override
	protected void viewAdded() {
		super.viewAdded();
		getLogicalEventHandlerManager().addEventHandler(AEGWTHasPaginationEventHandlers.TYPE, this);
		getLogicalEventHandlerManager().addEventHandler(AEGWTHasNavigationEventHandlers.TYPE, this);
	}

	@Override
	public void dispatchEvent(AEGWTPaginationEvent evt) {
		if (PAGINATION_TYPE.GET_NEXT_REMOTE_PAGE == evt.getEventType()) {
			AEMFTMetadataElementComposite transactionInfo = (AEMFTMetadataElementComposite) evt.getElementAsDataValue();
			String compositeTransactionKey 		= getElementDataController().getElementAsString(AEGWTICommClientConstant.CTE_GWT_AE_SERVER_SERVICE_COMM_PAGINATION_TRANSACTION_COMPOSITE_SUFIX	, transactionInfo);
			final String singleTransactionKey 	= getElementDataController().getElementAsString(AEGWTICommClientConstant.CTE_GWT_AE_SERVER_SERVICE_COMM_PAGINATION_TRANSACTION_SINGLE_SUFIX		, transactionInfo);

			getClientServerConnection().executeCommGetNextPage(compositeTransactionKey, singleTransactionKey, new AEGWTCommClientAsynchCallbackRequest <AEMFTMetadataElementComposite> (this) {

				@Override
				public void onResult(AEMFTMetadataElementComposite result) {
					// TODO item more panel move to Selene4GWT
					AEGWTPaginationEvent evt = new AEGWTPaginationEvent(getName(), "CommonItemMorePanel", result);
					evt.setSourceWidgetId(singleTransactionKey);
					evt.setEventType(PAGINATION_TYPE.SHOW_NEXT_PAGE);
					getLogicalEventHandlerManager().fireEvent(evt);
				}

				@Override
				public void onError(Throwable caught) {

				}
			});
		}
	}

	@Override
	public boolean isDispatchEventType(PAGINATION_TYPE type) {
		return PAGINATION_TYPE.GET_NEXT_REMOTE_PAGE == type;
	}

	protected String[] addToInMapping(String[] presenterInMapping) {
		List<String> fullMapping = new ArrayList<String>();

		//PresenterInMapping
		for (int i = 0; i < presenterInMapping.length; i++) {
			fullMapping.add(presenterInMapping[i]);
		}

		//CommonInMapping
		for (int i = 0; i < BusinessPresenterBaseConstants.IN_MAPPING_COMMON.length; i++) {
			fullMapping.add(BusinessPresenterBaseConstants.IN_MAPPING_COMMON[i]);
		}

		return fullMapping.toArray(new String[0]);
	}

}
