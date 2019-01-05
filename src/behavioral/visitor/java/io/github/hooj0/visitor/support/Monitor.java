package io.github.hooj0.visitor.support;

/**
 * monitor visitor element
 * 监视器  Element 抽象实现
 * 
 * `ConcreteElement`：具体的元素类
 * @author hoojo
 * @createDate 2019年1月2日 下午10:55:49
 * @file Monitor.java
 * @package io.github.hooj0.visitor.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class Monitor implements ElectronicDevice {

	@Override
	public void accept(ElectronicDeviceVisitor deviceVisitor) {
		deviceVisitor.visitMonitor(this);
	}
}
