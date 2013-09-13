package com.imotion.beshak.front.common.client.event;

import com.imotion.beshak.front.common.client.event.BusinessLogicalEventTypes.BUSINESS_LOGICAL_TYPE;
import com.selene.arch.base.exe.core.appli.metadata.element.AEMFTMetadataElementComposite;
import com.selene.arch.exe.gwt.mvp.event.AEGWTEvent;

@SuppressWarnings("serial")
public class BusinessLogicalEvent extends AEGWTEvent<BusinessHasLogicalEventHandlers> {
	
	private BusinessLogicalEventTypes.BUSINESS_LOGICAL_TYPE eventType;
	
	public BusinessLogicalEvent(String sourceWindow, String sourceWidget) {
		this(sourceWindow, sourceWidget, null);
	}

	public BusinessLogicalEvent(String sourceWindow, String sourceWidget, AEMFTMetadataElementComposite dataEvent) {
		super(sourceWindow, sourceWidget, dataEvent);
		this.eventType = BUSINESS_LOGICAL_TYPE.ALL_EVENTS;
	}
	
	public BusinessLogicalEvent(String sourceWindow, String sourceWidget, AEMFTMetadataElementComposite dataEvent, BUSINESS_LOGICAL_TYPE type) {
		super(sourceWindow, sourceWidget, dataEvent);
		this.eventType = type;
	}
	
	public BUSINESS_LOGICAL_TYPE getEventType() {
		return eventType;
	}
	
	public void setEventType(BUSINESS_LOGICAL_TYPE eventType) {
		this.eventType = eventType;
	}

	@Override
	public Type<BusinessHasLogicalEventHandlers> getAssociatedType() {
		return BusinessHasLogicalEventHandlers.TYPE;
	}

	@Override
	protected void dispatch(BusinessHasLogicalEventHandlers handler) {
		if (handler.isDispatchEventType(eventType)) {
			handler.dispatchEvent(this);
		}
	}	
}
