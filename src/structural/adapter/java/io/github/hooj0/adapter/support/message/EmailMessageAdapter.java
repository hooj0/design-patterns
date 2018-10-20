package io.github.hooj0.adapter.support.message;

/**
 * email message adapter, implements wechat message inteface, help the sender to provide the skills to send wechat.
 * 由于发送者只会使用邮件，现在需要利用发送邮件的功能伪装成发送微信的功能，去完成发送微信
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
