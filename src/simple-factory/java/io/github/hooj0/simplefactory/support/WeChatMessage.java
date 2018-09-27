package io.github.hooj0.simplefactory.support;

/**
 * 实现 AbstractMessage抽象方法，提供WeChat消息实现
 * @author hoojo
 * @createDate 2018年9月27日 下午10:10:57
 * @file WeChatMessage.java
 * @package io.github.hooj0.simplefactory.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class WeChatMessage extends AbstractMessage {

	@Override
	public String message() {
		
		return "this is a wechat message.";
	}
}
