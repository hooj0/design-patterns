package io.github.hooj0.visitor;

import io.github.hooj0.visitor.support.Computer;
import io.github.hooj0.visitor.support.ComputerVisitor;
import io.github.hooj0.visitor.support.ElectronicDevice;
import io.github.hooj0.visitor.support.Phone;
import io.github.hooj0.visitor.support.PhoneVisitor;

/**
 * visitor pattern application client
 * @author hoojo
 * @createDate 2019年1月3日 下午10:52:16
 * @file App.java
 * @package io.github.hooj0.visitor
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class App {

	public static void main(String[] args) {
		ElectronicDevice device = new Computer();
		device.accept(new ComputerVisitor());
		
		System.out.println("------------");
		device = new Phone();
		device.accept(new PhoneVisitor());
	}
}
