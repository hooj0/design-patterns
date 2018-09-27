package io.github.hooj0.simplefactory.support.single;

import io.github.hooj0.simplefactory.support.AbstractMessage;

/**
 * 调用SingleMethodMessageFactory，完成消息实现
 * @author hoojo
 * @createDate 2018年9月27日 下午10:12:42
 * @file App.java
 * @package io.github.hooj0.simplefactory.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class App {

	public static void main(String[] args) {
		SingleMethodMessageFactory factory = new SingleMethodMessageFactory();
		
		AbstractMessage wechatMessage = factory.factory("wechat");
		System.out.println(wechatMessage.sendMessage());
		
		AbstractMessage emailMessage = factory.factory("email");
		System.out.println(emailMessage.sendMessage());
	}
}
