package io.github.hooj0.visitor.support;

/**
 * computer component visitor element
 * 电脑  Element 抽象实现
 * @author hoojo
 * @createDate 2019年1月3日 下午9:42:33
 * @file Computer.java
 * @package io.github.hooj0.visitor.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class Computer extends AbstractElectronicDevice {
	
	private ElectronicDevice[] devices;
	
	public Computer() {
		devices = new ElectronicDevice[] { new Keyboard(), new Mouse(), new Monitor() }; 
	}

	@Override
	public void accept(ElectronicDeviceVisitor deviceVisitor) {
		
		for (ElectronicDevice device : devices) {
			device.accept(deviceVisitor);
		}
		
		deviceVisitor.visitComputer(this);
	}
}