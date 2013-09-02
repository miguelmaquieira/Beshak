package com.imotion.facturaqua.front.common.client.event;

import com.google.gwt.event.shared.GwtEvent.Type;
import com.selene.arch.exe.gwt.mvp.event.AEGWTHasEventHandler;

public interface BusinessHasLogicalEventHandlers extends AEGWTHasEventHandler {

	public static final Type<BusinessHasLogicalEventHandlers> TYPE = new Type<BusinessHasLogicalEventHandlers>();
	
	public void dispatchEvent(BusinessLogicalEvent evt);
	
	public boolean isDispatchEventType(BusinessLogicalEventTypes.BUSINESS_LOGICAL_TYPE type);
}
