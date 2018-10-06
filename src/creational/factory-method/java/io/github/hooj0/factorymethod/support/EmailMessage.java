package io.github.hooj0.factorymethod.support;

/**
 * 实现 Message 抽象类，提供Email消息实现
 * @author hoojo
 * @createDate 2018年9月27日 下午10:09:56
 * @file EmailMessage.java
 * @package io.github.hooj0.simplefactory.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class EmailMessage extends AbstractMessage {

	@Override
	public String message() {
		return "this is a email message.";
	}
}
