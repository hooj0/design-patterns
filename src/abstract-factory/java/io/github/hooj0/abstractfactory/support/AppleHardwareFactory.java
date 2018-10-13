package io.github.hooj0.abstractfactory.support;

import io.github.hooj0.abstractfactory.support.product.AbstractKeyboardProduct;
import io.github.hooj0.abstractfactory.support.product.AbstractMouseProduct;
import io.github.hooj0.abstractfactory.support.product.impl.AppleKeyboard;
import io.github.hooj0.abstractfactory.support.product.impl.AppleMouse;

/**
 * apple hardware product factory support class
 * apple 产品工厂，生产产品鼠标和键盘
 * @author hoojo
 * @createDate 2018年10月13日 下午3:54:29
 * @file AppleHardwareFactory.java
 * @package io.github.hooj0.abstractfactory.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class AppleHardwareFactory extends AbstractHardwareFactory {

	@Override
	public String factoryName() {
		return "apple hardware product factory. ";
	}

	@Override
	public AbstractMouseProduct createMouse() {
		return new AppleMouse();
	}

	@Override
	public AbstractKeyboardProduct createKeyboard() {
		return new AppleKeyboard();
	}
}
