package io.github.hooj0.flyweight.support;

/**
 * message interface defined class
 * 消息接口定义，其他消息对象实现该接口
 * 
 * @author hoojo
 * @createDate 2018年11月7日 下午10:33:14
 * @file Message.java
 * @package io.github.hooj0.flyweight.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public interface Message {
	
	void sendMessage(String text);
}
