package io.github.hooj0.simplefactory.support;

/**
 * 抽象类，提供所有类继承并实现方法
 * @author hoojo
 * @createDate 2018年9月27日 下午9:34:46
 * @file AbstractMessage.java
 * @package io.github.hooj0.simplefactory.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public abstract class AbstractMessage {

	// 由子类实现 message
	public abstract String message();
	
	// 发送 消息
	public String sendMessage() {
		
		return "sender message: " + this.message();
	}
}
