package io.github.hooj0.singleton.support.static_inner_class;

/**
 * 静态内部类
 * 特征：
 * 		1、延迟加载，静态内部类延迟了单例实例的初始化
 * 		2、多线程安全
 * 		3、实现简单
 * 优点：延迟加载、多线程安全、实现简单
 * 缺点：
 * 原理：这种方式利用了 ClassLoader 机制来保证初始化只有一个线程，当SingletonHolder类没有被调用，实例对象将不初始化实例。
 * 		因为 SingletonHolder 没有主动调用，只有显示调用 getInstance 方法时，才会显式装载 SingletonHolder 类，从而实例化 instance。
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
