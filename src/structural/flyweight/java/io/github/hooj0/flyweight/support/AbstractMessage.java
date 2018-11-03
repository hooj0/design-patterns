package io.github.hooj0.flyweight.support;

/**
 * abstract message interface support，defined abstract method.
 * 消息发送接口抽象实现，完成接口方法的组合，定义子类需要实现的方法
 * 
 * @author hoojo
 * @createDate 2018年11月7日 下午10:37:21
 * @file AbstractMessage.java
 * @package io.github.hooj0.flyweight.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public abstract class AbstractMessage implements Message {

	private String type;
	
	public AbstractMessage(String type) {
		this.type = type;
	}
	
	// 内部状态变化
	private String messageHeader() {
		return this.type + " message header "; 
	}
	
	// 外部状态变化
	public void sendMessage(String text) {
		
		System.out.println(messageHeader() + ", content: " + text + ", " + messageFooter() + "#" + System.identityHashCode(this));
	}
	
	abstract String messageFooter();
}
