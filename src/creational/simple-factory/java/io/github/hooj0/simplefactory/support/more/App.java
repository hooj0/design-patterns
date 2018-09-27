package io.github.hooj0.simplefactory.support.more;

import io.github.hooj0.simplefactory.support.AbstractMessage;

/**
 * 调用SingleMethodMessageFactory，完成消息实现
 * @author hoojo
 * @createDate 2018年9月27日 下午10:47:01
 * @file App.java
 * @package io.github.hooj0.simplefactory.support.more
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class App {

	public static void main(String[] args) {
		MoreMethodMessageFacotry factory = new MoreMethodMessageFacotry();
		
		AbstractMessage wechatMessage = factory.wechatFactory();
		System.out.println(wechatMessage.sendMessage());
		
		AbstractMessage emailMessage = factory.mailFacotry();
		System.out.println(emailMessage.sendMessage());
	}
}
