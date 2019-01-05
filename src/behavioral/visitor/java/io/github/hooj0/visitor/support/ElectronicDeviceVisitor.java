package io.github.hooj0.visitor.support;

/**
 * visitor component interface defined   
 * Visitor 接口或者抽象类
 * 
 * `Visitor`：访问者接口或者抽象类
 * @author hoojo
 * @createDate 2019年1月2日 下午10:37:47
 * @file ElectronicDeviceVisitor.java
 * @package io.github.hooj0.visitor.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public interface ElectronicDeviceVisitor {

	void visitComputer(Computer computer);
	
	void visitPhone(Phone phone);

	void visitKeyboard(Keyboard keyboard);
	
	void visitMonitor(Monitor monitor);
	
	void visitMouse(Mouse mouse);
}
