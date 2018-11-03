package io.github.hooj0.flyweight;

import io.github.hooj0.flyweight.support.MessageFactory;

/**
 * application client class
 * 
 * @author hoojo
 * @createDate 2018年11月3日 下午11:00:39
 * @file App.java
 * @package io.github.hooj0.flyweight
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class App {

	public static void main(String[] args) {
		
		MessageFactory factory = new MessageFactory();
		
		factory.createMessage("email").sendMessage("hello, jack!");
		factory.createMessage("email").sendMessage("jack is sleep!");

		factory.createMessage("wechat").sendMessage("hello, joe!");
		factory.createMessage("wechat").sendMessage("go go go, joe!");
		
		/*
		 	email message header , content: hello, jack!, email message footer! @5433634#5433634
			email message header , content: jack is sleep!, email message footer! @5433634#5433634
			wechat message header , content: hello, joe!, send wechat message finish! @2430287#2430287
			wechat message header , content: go go go, joe!, send wechat message finish! @2430287#2430287
		 */
	}
}
