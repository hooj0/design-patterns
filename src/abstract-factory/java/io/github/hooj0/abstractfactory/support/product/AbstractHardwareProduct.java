package io.github.hooj0.abstractfactory.support.product;

/**
 * abstract hardware product class
 * 抽象的硬件产品，可以是抽象类或者接口，是所有产品的顶级抽象类或接口。
 * @author hoojo
 * @createDate 2018年10月13日 下午3:18:18
 * @file AbstractHardwareProduct.java
 * @package io.github.hooj0.abstractfactory.support.product
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public abstract class AbstractHardwareProduct {

	public abstract String productName();
	
	public String getType() {
		return "I am a hardware product, ";
	}
}
