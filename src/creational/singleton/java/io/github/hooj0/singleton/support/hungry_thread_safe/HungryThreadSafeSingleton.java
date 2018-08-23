package io.github.hooj0.singleton.support.hungry_thread_safe;

/**
 *  饿汉模式，线程安全：饿汉先解决饥饿问题，会优先初始化实例。
 *  特点：
 * 		1、立即加载，没有延迟
 * 		2、多线程下安全
 * 	优点：简单易用，没有使用锁，效率高
 * 	缺点：在类加载时就初始化实例对象，浪费内存资源开销（特别在不知道是否会使用对象的情况下）
 * 
 * 原理：
 * 它基于 classloader 机制避免了多线程的同步问题，
 * 不过，instance 在类装载时就实例化，虽然导致类装载的原因有很多种，
 * 在单例模式中大多数都是调用 getInstance 方法， 
 * 但是也不能确定有其他的方式（或者其他的静态方法）导致类装载，
 * 这时候初始化 instance 显然没有达到 lazy loading 的效果。
 * 
 * @author hoojo
 * @createDate 2018年8月23日 下午11:00:05
 * @file HungryThreadSafeSingleton.java
 * @package io.github.hooj0.singleton.support.hungry_thread_safe
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class HungryThreadSafeSingleton {

	// 构建示例对象
	private final static HungryThreadSafeSingleton instance = new HungryThreadSafeSingleton();
	
	// 私有方法，放置外部实例化该对象
	private HungryThreadSafeSingleton() {
	}
	
	// 提供获取实例的方法
	public static HungryThreadSafeSingleton getInstance() {
		return instance;
	}
	
	public void trigger() {
		System.out.println("You trigger a message.");
	}
}
