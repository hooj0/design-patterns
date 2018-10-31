package io.github.hooj0.facade;

import io.github.hooj0.facade.support.MessageSendFacade;

/**
 * facade pattern — application client class
 * 
 * @author hoojo
 * @createDate 2018年10月30日 下午4:14:29
 * @file App.java
 * @package io.github.hooj0.facade
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class App {

	public static void main(String[] args) {

		MessageSendFacade sendFacade = new MessageSendFacade();
		
		sendFacade.sendHeader();
		sendFacade.sendBody();
		sendFacade.sendText();
		sendFacade.sendFooter();
	}
}
