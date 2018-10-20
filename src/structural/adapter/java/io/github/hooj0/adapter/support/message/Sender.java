package io.github.hooj0.adapter.support.message;

/**
 * sender support wechat message interface
 * 
 * 发送者需要实现发送微信的技能，他等待获取一个微信发送技能，然后实现发送微信消息
 * @author hoojo
 * @createDate 2018年10月28日 上午10:59:23
 * @file Sender.java
 * @package io.github.hooj0.adapter.support.message
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class Sender implements WeChatMessage {

	private WeChatMessage message;
	
	public Sender(WeChatMessage message) {
		this.message = message;
	}
	
	@Override
	public void sendMessage() {
		message.sendMessage();
	}
}
