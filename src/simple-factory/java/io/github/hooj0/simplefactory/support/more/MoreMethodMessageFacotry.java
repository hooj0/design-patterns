package io.github.hooj0.simplefactory.support.more;

import io.github.hooj0.simplefactory.support.AbstractMessage;
import io.github.hooj0.simplefactory.support.EmailMessage;
import io.github.hooj0.simplefactory.support.WeChatMessage;

/**
 * 多个工厂方法提供消息工厂实现：
 * 是对普通工厂方法模式的改进，在普通工厂方法模式中，如果传递的字符串出错，则不能正确创建对象，
 * 而多个工厂方法模式是提供多个工厂方法，分别创建对象。
 * @author hoojo
 * @createDate 2018年9月27日 下午10:42:32
 * @file MoreMethodMessageFacotry.java
 * @package io.github.hooj0.simplefactory.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class MoreMethodMessageFacotry {

	// Email Message Factory
	public AbstractMessage mailFacotry() {
		return new EmailMessage();
	}
	
	// WeChat Message 工厂方法
	public AbstractMessage wechatFactory() {
		return new WeChatMessage();
	}
}
