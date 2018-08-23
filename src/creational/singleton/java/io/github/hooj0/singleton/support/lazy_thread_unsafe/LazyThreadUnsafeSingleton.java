package io.github.hooj0.singleton.support.lazy_thread_unsafe;

/**
 * 懒汉模式，线程不安全
 * 特点：
 * 		1、延迟加载，在需要用的时候进行实例化（首次）
 * 		2、线程不安全，没有使用 synchronized 关键字或线程锁等机制来保证线程并发，不保证唯一实例
 * 
 * 优点：第一次调用才初始化，避免内存浪费
 * 缺点：线程不安全，在多线程模式下并发会出现多次创建实例的情况
 * 
 * 原理：这种方式具备很好的 lazy loading，但不能在多线程模式下使用，在严格程度上不能算是单例模式，因为没有保证 实例的唯一性。
 * 如果不要求在多线程模式下工作，这种方式可以正常使用。
 * getInstance() 的性能对应用程序不是很关键（该方法使用不太频繁）。
 * 
 * @author hoojo
 * @createDate 2018年8月23日 下午10:57:44
 * @file LazyThreadUnsafeSingleton.java
 * @package io.github.hooj0.singleton.support.lazy_thread_unsafe
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class LazyThreadUnsafeSingleton {

	private static LazyThreadUnsafeSingleton instance;

	// 私有构造，禁止外部实例化
	private LazyThreadUnsafeSingleton() {
	}
	
	// 提供静态方法获取实例
	public static final LazyThreadUnsafeSingleton getInstance() {
		if (instance == null) {
			instance = new LazyThreadUnsafeSingleton();
		}
		
		return instance;
	}
	
	public void trigger() {
		System.out.println("You trigger a message.");
	}
}
