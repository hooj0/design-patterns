package io.github.hooj0.abstractfactory;

import io.github.hooj0.abstractfactory.support.AbstractHardwareFactory;
import io.github.hooj0.abstractfactory.support.AppleHardwareFactory;
import io.github.hooj0.abstractfactory.support.DellHardwareFactory;

/**
 * abstract factory client application
 * @author hoojo
 * @createDate 2018年10月13日 下午3:56:10
 * @file App.java
 * @package io.github.hooj0.abstractfactory
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class App {

	public static void main(String[] args) {
		AbstractHardwareFactory factory = new AppleHardwareFactory();
		factory.sayDescription();
		
		System.out.println(factory.createKeyboard().productName());
		System.out.println(factory.createMouse().productName());
		
		factory = new DellHardwareFactory();
		factory.sayDescription();
		
		System.out.println(factory.createKeyboard().productName());
		System.out.println(factory.createMouse().productName());
	}
}
