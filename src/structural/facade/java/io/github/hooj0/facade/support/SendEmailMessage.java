package io.github.hooj0.facade.support;

/**
 * 
 * @author hoojo
 * @createDate 2018年10月31日 下午10:50:25
 * @file SendEmailMessage.java
 * @package io.github.hooj0.facade.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class SendEmailMessage extends SendMessage {

	@Override
	public String messageText() {
		return "You have new mail, please check.";
	}

	@Override
	public String messageType() {
		return "email";
	}
}
