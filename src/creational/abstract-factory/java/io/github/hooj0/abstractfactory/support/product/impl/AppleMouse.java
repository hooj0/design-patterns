package io.github.hooj0.abstractfactory.support.product.impl;

import io.github.hooj0.abstractfactory.support.product.AbstractMouseProduct;

/**
 * apple mouse product implements class
 * @author hoojo
 * @createDate 2018年10月13日 下午3:41:07
 * @file AppleMouse.java
 * @package io.github.hooj0.abstractfactory.support.product.impl
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class AppleMouse extends AbstractMouseProduct {

	@Override
	public int getDpi() {
		return 800;
	}
}
