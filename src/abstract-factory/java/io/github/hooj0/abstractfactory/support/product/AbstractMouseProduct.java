package io.github.hooj0.abstractfactory.support.product;

/**
 * abstract mouse product class
 * 抽象鼠标产品，继承硬件产品对象（AbstractHardwareProduct），提供定制鼠标产品的具体方法
 * @author hoojo
 * @createDate 2018年10月13日 下午3:24:25
 * @file AbstractMouseProduct.java
 * @package io.github.hooj0.abstractfactory.support.product
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public abstract class AbstractMouseProduct extends AbstractHardwareProduct {

	@Override
	public String productName() {
		return "I am is mouse product, dpi is " + this.getDpi() + ". ";
	}

	public abstract int getDpi();
}
