package io.github.hooj0.mediator.chatroom.support;

/**
 * chat room mediator 
 * 聊天室中介者接口
 * @author hoojo
 * @createDate 2018年11月26日 下午10:35:38
 * @file ChatRoomMediator.java
 * @package io.github.hooj0.mediator.chatroom.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public interface ChatRoomMediator {

	public void showMessage(User user, String message);
}
