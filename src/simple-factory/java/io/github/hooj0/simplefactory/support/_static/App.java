package io.github.hooj0.simplefactory.support._static;

import io.github.hooj0.simplefactory.support.AbstractMessage;

/**
 * 静态工厂方法调用示例
 * @author hoojo
 * @createDate 2018年9月27日 下午10:50:29
 * @file App.java
 * @package io.github.hooj0.simplefactory.support._static
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class App {

	public static void main(String[] args) {
		
		AbstractMessage wechatMessage = StaticMethodMessageFactory.wechatFactory();
		System.out.println(wechatMessage.sendMessage());
		
		AbstractMessage emailMessage = StaticMethodMessageFactory.mailFacotry();
		System.out.println(emailMessage.sendMessage());
	}
}
