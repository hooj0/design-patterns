package io.github.hooj0.singleton.support.lazy_thread_safe;

/**
 * 懒汉模式，线程安全
 * 特点：
 * 		1、延迟加载，在需要用的时候进行实例化（首次）
 * 		2、线程安全，使用 synchronized 关键字，保证唯一实例
 * 
 * 优点：第一次调用才初始化，避免内存浪费
 * 缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
 * 
 * 原理：这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
 * getInstance() 的性能对应用程序不是很关键（该方法使用不太频繁）。
 * 
 * @changelog singleton lazy load & thread safe mode
 * @category singleton
 * @author hoojo
 * @createDate 2018年7月25日 下午9:32:14
 * @file LazyThreadSafeSingleton.java
 * @package io.github.hooj0.singleton.support.lazy_thread_safe
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class LazyThreadSafeSingleton {

	// 构建示例对象
	private static LazyThreadSafeSingleton instance;
	
	// 私有方法，禁止外部实例化该对象
	private LazyThreadSafeSingleton() {
	}
	
	// 提供获取实例的方法
	public static synchronized LazyThreadSafeSingleton getInstance() {
		if (instance == null) {
			instance = new LazyThreadSafeSingleton();
		}
		
		return instance;
	}
	
	public void trigger() {
		System.out.println("You trigger a message.");
	}
}
