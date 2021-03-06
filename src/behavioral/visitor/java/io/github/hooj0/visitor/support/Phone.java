package io.github.hooj0.visitor.support;

/**
 * phone component visitor element
 * 手机  Element 抽象实现
 * 
 * `ConcreteElement`：具体的元素类
 * @author hoojo
 * @createDate 2019年1月3日 下午9:58:02
 * @file Phone.java
 * @package io.github.hooj0.visitor.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class Phone implements ElectronicDevice {

	// `ObjectStructure`：定义当中所提到的对象结构
	private ElectronicDevice[] devices;
	
	public Phone() {
		devices = new ElectronicDevice[] { new Keyboard(), new Monitor() }; 
	}
	
	@Override
	public void accept(ElectronicDeviceVisitor deviceVisitor) {
		
		for (ElectronicDevice device : devices) {
			device.accept(deviceVisitor);
		}
		
		deviceVisitor.visitPhone(this);
	}
}
