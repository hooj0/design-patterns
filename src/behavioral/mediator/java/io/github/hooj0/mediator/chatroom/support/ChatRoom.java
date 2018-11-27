package io.github.hooj0.mediator.support;

import java.util.Date;

import org.apache.commons.lang3.time.DateFormatUtils;

/**
 * mediator implementor ChatRoomMediator
 * mediator 的具体实现类
 * 
 * @author hoojo
 * @createDate 2018年11月26日 下午10:51:04
 * @file ChatRoom.java
 * @package io.github.hooj0.mediator.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class ChatRoom implements ChatRoomMediator {

	private static final String pattern = "MM-dd HH:mm";
	
	@Override
	public void showMessage(User user, String message) {
		String now = DateFormatUtils.format(new Date(), pattern);
		
		System.out.println(String.format("%s [%s]: %s", now, user.getName(), message));
	}
}
