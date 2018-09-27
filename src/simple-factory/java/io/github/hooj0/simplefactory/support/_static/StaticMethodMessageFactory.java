package io.github.hooj0.simplefactory.support._static;

import io.github.hooj0.simplefactory.support.AbstractMessage;
import io.github.hooj0.simplefactory.support.EmailMessage;
import io.github.hooj0.simplefactory.support.WeChatMessage;

/**
 * 静态方法提供工厂实现：
 * 多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可。
 * 
 * @author hoojo
 * @createDate 2018年9月27日 下午10:49:12
 * @file StaticMethodMessageFactory.java
 * @package io.github.hooj0.simplefactory.support._static
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class StaticMethodMessageFactory {

	// Email Message Factory
	public static AbstractMessage mailFacotry() {
		return new EmailMessage();
	}
	
	// WeChat Message 工厂方法
	public static AbstractMessage wechatFactory() {
		return new WeChatMessage();
	}
}
