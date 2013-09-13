package com.imotion.beshak.front.business.client;

import com.google.gwt.core.shared.GWT;
import com.selene.arch.exe.gwt.client.common.AEGWTMessageWrapper;
import com.selene.arch.exe.gwt.client.utils.AEGWTStringUtils;

public class BusinessMessageWrapper extends AEGWTMessageWrapper {
	
	private I18NBusinessCommonMessages messages = GWT.create(I18NBusinessCommonMessages.class);

	@Override
	public String getMessageText(String messageId) {
		String message = messages.getString(messageId);
		if (AEGWTStringUtils.isEmptyString(message)) {
			message = getDefaultMessageText();
		}
		return message;
	}
	
	public String getDefaultMessageText() {
		return messages.SAILOR_COMMON_MESSAGE_NOT_FOUND_MESSAGE();
	}
}
