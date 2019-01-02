package io.github.hooj0.visitor.support;

/**
 * visitor pattern electronic device 
 * Element 角色接口对象
 * 
 * @author hoojo
 * @createDate 2019年1月2日 下午10:35:22
 * @file ElectronicDevice.java
 * @package io.github.hooj0.visitor.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public interface ElectronicDevice {

	public void accept(ElectronicDeviceVisitor deviceVisitor);
}
