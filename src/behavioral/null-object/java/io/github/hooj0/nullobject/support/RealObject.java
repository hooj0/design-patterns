package io.github.hooj0.nullobject.support;

/**
 * null-object pattern — subject interface real object support
 * 空对象主题接口的真实实现类
 * 
 * @author hoojo
 * @createDate 2019年8月27日 上午11:00:27
 * @file RealObject.java
 * @package io.github.hooj0.nullobject.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class RealObject implements Subject {

	@Override
	public void start() {
		System.out.println("real object start subject.");
	}

	@Override
	public void stop() {
		System.out.println("real object stop subject.");
	}
}
