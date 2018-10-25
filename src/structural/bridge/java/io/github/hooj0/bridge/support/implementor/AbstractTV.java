package io.github.hooj0.bridge.support.implementor;

/**
 * abstract TV implementor class
 * TV 表示电视，指代 Implementor
 * 
 * @author hoojo
 * @createDate 2018年10月25日 下午9:07:44
 * @file AbstractTV.java
 * @package io.github.hooj0.bridge.support.implementor
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public abstract class AbstractTV {

	public abstract void open();
	
	public abstract void close();

	public abstract void adjustShow();

	public abstract void adjustVolume();
}
