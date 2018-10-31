package io.github.hooj0.facade.support;

/**
 * facade pattern — send message facade class
 * 发送消息门面，提供发送消息的多种接口
 * 
 * @author hoojo
 * @createDate 2018年10月31日 下午10:52:06
 * @file MessageSendFacade.java
 * @package io.github.hooj0.facade.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class MessageSendFacade {

	private SendMessage sendMail = new SendEmailMessage();
	private SendMessage sendQQ = new SendQQMessage();
	private SendMessage sendWechat = new SendWeChatMessage();
	
	public void sendHeader() {
		sendMail.sendHeader();
		sendQQ.sendHeader();
		sendWechat.sendHeader();
	}
	
	public void sendBody() {
		sendMail.sendBody();
		sendQQ.sendBody();
		sendWechat.sendBody();
	}
	
	public void sendFooter() {
		sendMail.sendFooter();
		sendQQ.sendFooter();
		sendWechat.sendFooter();
	}
	
	public void sendText() {
		System.out.println(sendMail.messageType() + " send message: " + sendMail.messageText());
	}
}
