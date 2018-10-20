package io.github.hooj0.adapter.support.message;

/**
 * email message adapter, implements wechat message inteface, help the sender to provide the skills to send wechat.
 * 由于发送者只会使用微信发送消息，发送者从来没有用过发送邮件这么糟糕的聊天发送，
 * 现在需要利用发送微信的技能，让发送者利用发送微信的姿势去完成发送邮件进行聊天。
 * 
 * @author hoojo
 * @createDate 2018年10月28日 上午11:03:53
 * @file EmailMessageAdapter.java
 * @package io.github.hooj0.adapter.support.message
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class EmailMessageAdapter implements WeChatMessage {

	private EmailMessage emailMessage;

	public EmailMessageAdapter() {
		this.emailMessage = new EmailMessageSupport();
	}

	@Override
	public void sendMessage() {
		emailMessage.sendEmail();
	}
}
