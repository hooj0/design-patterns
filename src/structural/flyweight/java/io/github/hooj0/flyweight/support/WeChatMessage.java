package io.github.hooj0.flyweight.support;

/**
 * WeChat message sender support
 * 
 * @author hoojo
 * @createDate 2018年11月7日 下午10:47:08
 * @file WeChatMessage.java
 * @package io.github.hooj0.flyweight.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class WeChatMessage extends AbstractMessage {

	public WeChatMessage(String type) {
		super(type);
	}

	@Override
	String messageFooter() {
		return "send wechat message finish! @" + System.identityHashCode(this);
	}
}
