package io.github.hooj0.simplefactory.support.single;

import io.github.hooj0.simplefactory.support.AbstractMessage;
import io.github.hooj0.simplefactory.support.EmailMessage;
import io.github.hooj0.simplefactory.support.WeChatMessage;

/**
 * 单个工厂方法提供工厂实现：
 * 就是建立一个工厂类，对实现了同一接口或类的一些类进行实例的创建
 * 
 * @author hoojo
 * @createDate 2018年9月27日 下午9:20:21
 * @file SingleMethodMessageFactory.java
 * @package io.github.hooj0.simplefactory.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class SingleMethodMessageFactory {

	public AbstractMessage factory(String type) {
		if ("wechat".equalsIgnoreCase(type)) {
			return new WeChatMessage();
		} else if ("email".equalsIgnoreCase(type)) {
			return new EmailMessage();
		} else {
			throw new AssertionError("unknow support message type: " + type);
		}
	}
}
