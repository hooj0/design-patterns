package io.github.hooj0.singleton.support.static_inner_class;

/**
 * 静态内部类
 * 特征：
 * 		1、
 * 		2、
 * 优点：
 * 缺点：
 * 原理：
 * 
 * @author hoojo
 * @createDate 2018年9月25日 下午11:03:18
 * @file StaticInnerClassSingleton.java
 * @package io.github.hooj0.singleton.support.static_inner_class
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class StaticInnerClassSingleton {

	private StaticInnerClassSingleton() {
	}
	
	private static class SingletonHolder {
		public static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
	}
	
	public static StaticInnerClassSingleton getInstance() {
		return SingletonHolder.INSTANCE;
	}
	
	public void trigger() {
		System.out.println("You trigger a message.");
	}
}
