package io.github.hooj0.abstractfactory.support.product;

/**
 * abstract keyboard product class
 * 抽象键盘产品类，继承硬件产品对象（AbstractHardwareProduct），提供定制键盘产品的具体方法
 * @author hoojo
 * @createDate 2018年10月13日 下午3:28:41
 * @file AbstractKeyboardProduct.java
 * @package io.github.hooj0.abstractfactory.support.product
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public abstract class AbstractKeyboardProduct extends AbstractHardwareProduct {

	@Override
	public String productName() {
		return "I am is keyboard product, key count is " + this.getKeyCount() + ", keyboard type is " + this.getKeyType() + ". ";
	}
	
	public abstract int getKeyCount();

	public abstract String getKeyType();
}
