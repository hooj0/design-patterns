package io.github.hooj0.visitor.support;

/**
 * computer visitor Electronic Device implements
 * computer 电子设备 具体的访问类
 * `ConcreteVisitor`：具体的访问者
 * @author hoojo
 * @createDate 2019年1月3日 下午10:00:08
 * @file ComputerVisitor.java
 * @package io.github.hooj0.visitor.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class ComputerVisitor implements ElectronicDeviceVisitor {

	@Override
	public void visitComputer(Computer computer) {
		System.out.println("Computer: " + computer);
	}

	@Override
	public void visitPhone(Phone phone) {
	}

	@Override
	public void visitKeyboard(Keyboard keyboard) {
		System.out.println("keyboard: " + keyboard);
	}

	@Override
	public void visitMonitor(Monitor monitor) {
		System.out.println("Monitor: " + monitor);
	}

	@Override
	public void visitMouse(Mouse mouse) {
		System.out.println("Mouse: " + mouse);
	}
}
