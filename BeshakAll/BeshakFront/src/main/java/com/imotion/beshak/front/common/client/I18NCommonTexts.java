package com.imotion.beshak.front.common.client;

import com.selene.arch.exe.gwt.client.common.AEGWTI18NCommonTexts;

public interface I18NCommonTexts extends AEGWTI18NCommonTexts {

	/**********************************************
	 *				Common
	 *********************************************/
	@DefaultStringValue("Beta_0101")
	String common_version();

	/**********************************************
	 *			      Header
	 *********************************************/

	@DefaultStringValue("Blog")
	String header_menu_blog_text();

	@DefaultStringValue("Feedback")
	String header_menu_feedback_text();

	@DefaultStringValue("Live chat")
	String header_menu_live_chat_service_text();

	@DefaultStringValue("Beshak Live")
	String header_live_chat_service_form_title_text();
}
