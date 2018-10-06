package io.github.hooj0.factorymethod.support.factory;

import io.github.hooj0.factorymethod.support.AbstractMessage;

/**
 * abstract message factory
 * 提供子类实现消息工厂的方法，将创建消息对象的任务转移到工厂子类
 * @author hoojo
 * @createDate 2018年10月6日 下午6:35:42
 * @file AbstractMessageFactory.java
 * @package io.github.hooj0.factorymethod.support.factory
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public abstract class AbstractMessageFactory {

	public abstract AbstractMessage factoryMethod();
	
	public void trigger() {
		AbstractMessage product = this.factoryMethod();
		
		System.out.println(product.sendMessage());
	}
}
