package io.github.hooj0.nullobject.support;

/**
 * null-object pattern — subject interface null object support
 * 空对象主题接口的空实现
 * 
 * @author hoojo
 * @createDate 2019年8月27日 上午11:02:41
 * @file NullObject.java
 * @package io.github.hooj0.nullobject.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class NullObject implements Subject {

	@Override
	public void start() {
		// 不做 任何事
		System.out.println("null object start");
	}

	@Override
	public void stop() {
		// 不做 任何事
		System.out.println("null object stop");
	}
}
