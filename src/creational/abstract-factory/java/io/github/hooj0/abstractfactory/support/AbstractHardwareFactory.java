package io.github.hooj0.abstractfactory.support;

import io.github.hooj0.abstractfactory.support.product.AbstractKeyboardProduct;
import io.github.hooj0.abstractfactory.support.product.AbstractMouseProduct;

/**
 * abstract hardware factory class defined.
 * 抽象工厂定义，定义工厂要生产具体的工厂产品
 * @author hoojo
 * @createDate 2018年10月13日 下午3:45:05
 * @file AbstractHardwareFactory.java
 * @package io.github.hooj0.abstractfactory.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public abstract class AbstractHardwareFactory {

	public abstract String factoryName();
	
	public abstract AbstractMouseProduct createMouse();
	
	public abstract AbstractKeyboardProduct createKeyboard();
	
	public void sayDescription() {
		
		System.out.print(this.factoryName());
		System.out.print(this.createMouse().productName());
		System.out.print(this.createKeyboard().productName());
		System.out.println();
	}
}
