package io.github.hooj0.facade.support;

/**
 * send WeChat message support SendMessage class
 * 发送微信消息业务对象
 *  
 * @author hoojo
 * @createDate 2018年10月31日 下午10:46:30
 * @file SendWeChatMessage.java
 * @package io.github.hooj0.facade.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class SendWeChatMessage extends SendMessage {

	@Override
	public String messageType() {
		return "wechat";
	}

	@Override
	public String messageText() {
		return "hello, jack.";
	}
}
