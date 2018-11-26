package io.github.hooj0.mediator;

import io.github.hooj0.mediator.support.ChatRoom;
import io.github.hooj0.mediator.support.ChatRoomMediator;
import io.github.hooj0.mediator.support.User;

/**
 * mediator application client
 * 
 * @author hoojo
 * @createDate 2018年11月26日 下午10:58:48
 * @file App.java
 * @package io.github.hooj0.mediator
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class App {

	public static void main(String[] args) {

		ChatRoomMediator mediator = new ChatRoom();
		
		User jack = new User("jack", mediator);
		User joe = new User("joe", mediator);
		User amy = new User("amy", mediator);
		
		jack.send("hallo, everybody.");
		joe.send("hallo, jack.");
		amy.send("hi~");
	}
}
