package io.github.hooj0.visitor.support;

/**
 * phone visitor Electronic Device implements
 * phone 电子设备 具体的访问类
 * 
 * `ConcreteVisitor`：具体的访问者
 * @author hoojo
 * @createDate 2019年1月3日 下午10:00:42
 * @file PhoneVisitor.java
 * @package io.github.hooj0.visitor.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class PhoneVisitor implements ElectronicDeviceVisitor {

	@Override
	public void visitComputer(Computer computer) {
		
	}

	@Override
	public void visitPhone(Phone phone) {
		System.out.println("phone: " + phone);
	}

	@Override
	public void visitKeyboard(Keyboard keyboard) {
		System.out.println("keyboard: " + keyboard);
	}

	@Override
	public void visitMonitor(Monitor monitor) {
		System.out.println("monitor: " + monitor);
	}

	@Override
	public void visitMouse(Mouse mouse) {
	}
}
