package io.github.hooj0.factorymethod.support.factory;

import io.github.hooj0.factorymethod.support.EmailMessage;
import io.github.hooj0.factorymethod.support.AbstractMessage;

/**
 * emial message factory
 * 通过继承抽象消息工厂实现实例化消息对象的业务，在子类中完成产品的创建
 * @author hoojo
 * @createDate 2018年10月6日 下午6:45:14
 * @file EmailMessageFactory.java
 * @package io.github.hooj0.factorymethod.support.factory
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class EmailMessageFactory extends AbstractMessageFactory {

	@Override
	public AbstractMessage factoryMethod() {
		return new EmailMessage();
	}
}
