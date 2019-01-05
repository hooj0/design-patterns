package io.github.hooj0.visitor.support;

/**
 * keyboard visitor element support
 * 键盘 Element 角色抽象实现
 * 
 * `ConcreteElement`：具体的元素类
 * @author hoojo
 * @createDate 2019年1月2日 下午10:49:31
 * @file Keyboard.java
 * @package io.github.hooj0.visitor.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class Keyboard implements ElectronicDevice {

	@Override
	public void accept(ElectronicDeviceVisitor deviceVisitor) {
		deviceVisitor.visitKeyboard(this);
	}
}
