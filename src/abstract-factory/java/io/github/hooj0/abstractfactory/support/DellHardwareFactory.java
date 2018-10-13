package io.github.hooj0.abstractfactory.support;

import io.github.hooj0.abstractfactory.support.product.AbstractKeyboardProduct;
import io.github.hooj0.abstractfactory.support.product.AbstractMouseProduct;
import io.github.hooj0.abstractfactory.support.product.impl.DellKeyboard;
import io.github.hooj0.abstractfactory.support.product.impl.DellMouse;

/**
 * dell hardware product factory implements class
 * dell 产品工厂，生产产品鼠标和键盘
 * @author hoojo
 * @createDate 2018年10月13日 下午3:52:13
 * @file DellHardwareFactory.java
 * @package io.github.hooj0.abstractfactory.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class DellHardwareFactory extends AbstractHardwareFactory {

	@Override
	public String factoryName() {
		return "dell hardware product factory. ";
	}

	@Override
	public AbstractMouseProduct createMouse() {
		return new DellMouse();
	}

	@Override
	public AbstractKeyboardProduct createKeyboard() {
		return new DellKeyboard();
	}
}
