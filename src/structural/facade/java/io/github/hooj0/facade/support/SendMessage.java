package io.github.hooj0.facade.support;

/**
 * facade pattern — send message abstract class defined
 * 定义发送消息的业务抽象类
 * 
 * @author hoojo
 * @createDate 2018年10月31日 下午10:39:30
 * @file SendMessage.java
 * @package io.github.hooj0.facade.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public abstract class SendMessage {

	public void sendHeader() {
		System.out.println("start send '" + messageType() + "' message.");
	}
	
	public void sendBody() {
		System.out.println("send '" + messageType() + "' message body.");
	}
	
	public void sendFooter() {
		System.out.println("send '" + messageType() + "' message finish.");
	}
	
	public abstract String messageText();
	
	public abstract String messageType();
}
