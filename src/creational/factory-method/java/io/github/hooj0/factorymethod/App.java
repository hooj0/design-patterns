package io.github.hooj0.factorymethod;

import io.github.hooj0.factorymethod.support.factory.AbstractMessageFactory;
import io.github.hooj0.factorymethod.support.factory.EmailMessageFactory;
import io.github.hooj0.factorymethod.support.factory.WeChatMessageFactory;

/**
 * factory method patterns app client
 * @author hoojo
 * @createDate 2018年10月6日 下午6:49:34
 * @file App.java
 * @package io.github.hooj0.factorymethod
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class App {

	public static void main(String[] args) {
		
		AbstractMessageFactory factory = new EmailMessageFactory();
		System.out.println(factory.factoryMethod());
		factory.trigger();
		
		factory = new WeChatMessageFactory();
		System.out.println(factory.factoryMethod());
		factory.trigger();
	}
}
