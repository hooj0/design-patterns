package io.github.hooj0.flyweight.support;

import java.util.HashMap;
import java.util.Map;

/**
 * The actual Flyweight object, the factory used to create the message.
 * 实际的Flyweight对象，用于创建消息的工厂
 * 
 * @author hoojo
 * @createDate 2018年11月7日 下午10:52:41
 * @file MessageFactory.java
 * @package io.github.hooj0.flyweight.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class MessageFactory {

	// 进行Flyweight缓存
	private final Map<String, Message> messages;

	public MessageFactory() {
		messages = new HashMap<>();
	}
	
	public Message createMessage(String type) {
		
		if (!messages.containsKey(type)) {
			
			if ("email".equals(type)) {
				messages.put(type, new EmailMessage(type));
			} else if ("wechat".equals(type)) {
				messages.put(type, new WeChatMessage(type));
			} else {
				throw new IllegalArgumentException("unknow type!");
			}
		}
		
		return messages.get(type);
	}
}
