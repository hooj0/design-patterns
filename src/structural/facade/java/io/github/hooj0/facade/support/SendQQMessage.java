package io.github.hooj0.facade.support;

/**
 * send qq message support SendMessage class
 * 发送qq消息业务对象
 * 
 * @author hoojo
 * @createDate 2018年10月31日 下午10:49:02
 * @file SendQQMessage.java
 * @package io.github.hooj0.facade.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class SendQQMessage extends SendMessage {

	@Override
	public String messageText() {
		return "di di di .....";
	}

	@Override
	public String messageType() {
		return "qq";
	}
}
