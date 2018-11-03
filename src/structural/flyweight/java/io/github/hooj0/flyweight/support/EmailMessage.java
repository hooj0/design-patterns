package io.github.hooj0.flyweight.support;

/**
 * email message sender support
 * 
 * @author hoojo
 * @createDate 2018年11月7日 下午10:49:39
 * @file EmailMessage.java
 * @package io.github.hooj0.flyweight.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class EmailMessage extends AbstractMessage {

	public EmailMessage(String type) {
		super(type);
	}

	// 内部状态变化
	@Override
	String messageFooter() {
		return "email message footer! @" + System.identityHashCode(this);
	}
}
