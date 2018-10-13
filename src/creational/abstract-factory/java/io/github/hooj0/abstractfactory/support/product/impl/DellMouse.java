package io.github.hooj0.abstractfactory.support.product.impl;

import io.github.hooj0.abstractfactory.support.product.AbstractMouseProduct;

/**
 * dell mouse product implements class
 * @author hoojo
 * @createDate 2018年10月13日 下午3:35:30
 * @file DellMouse.java
 * @package io.github.hooj0.abstractfactory.support.product
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class DellMouse extends AbstractMouseProduct {

	@Override
	public int getDpi() {
		return 1800;
	}
}
