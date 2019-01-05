package io.github.hooj0.visitor.support;

/**
 * mouse visitor element support
 * 鼠标 Element 抽象实现
 * 
 * `ConcreteElement`：具体的元素类
 * @author hoojo
 * @createDate 2019年1月2日 下午10:51:25
 * @file Mouse.java
 * @package io.github.hooj0.visitor.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class Mouse extends AbstractElectronicDevice {

	@Override
	public void accept(ElectronicDeviceVisitor deviceVisitor) {
		deviceVisitor.visitMouse(this);
	}
}
