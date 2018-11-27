package io.github.hooj0.mediator.chatroom.support;

/**
 * user send chat message class
 * 用户发送聊天消息
 * 
 * @author hoojo
 * @createDate 2018年11月26日 下午10:37:57
 * @file User.java
 * @package io.github.hooj0.mediator.chatroom.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class User {

	private String name;
	private ChatRoomMediator mediator;
	
	public User(String name, ChatRoomMediator mediator) {
		this.name = name;
		this.mediator = mediator;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void send(String message) {
		this.mediator.showMessage(this, message);
	}
}
