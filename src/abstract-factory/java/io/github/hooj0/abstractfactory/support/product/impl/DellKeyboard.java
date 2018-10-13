package io.github.hooj0.abstractfactory.support.product.impl;

import io.github.hooj0.abstractfactory.support.product.AbstractKeyboardProduct;

/**
 * dell keyboard product implements class
 * @author hoojo
 * @createDate 2018年10月13日 下午3:37:24
 * @file DELLKeyboard.java
 * @package io.github.hooj0.abstractfactory.support.product
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class DellKeyboard extends AbstractKeyboardProduct {

	@Override
	public int getKeyCount() {
		return 106;
	}

	@Override
	public String getKeyType() {
		return "mechanical";
	}
}
