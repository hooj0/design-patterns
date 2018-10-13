package io.github.hooj0.abstractfactory.support.product.impl;

import io.github.hooj0.abstractfactory.support.product.AbstractKeyboardProduct;

/**
 * apple keyboard product implements class
 * @author hoojo
 * @createDate 2018年10月13日 下午3:42:58
 * @file AppleKeyboard.java
 * @package io.github.hooj0.abstractfactory.support.product.impl
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class AppleKeyboard extends AbstractKeyboardProduct {

	@Override
	public int getKeyCount() {
		return 68;
	}

	@Override
	public String getKeyType() {
		return "plastic";
	}
}
