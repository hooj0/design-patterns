package io.github.hooj0.singleton.support.lazy_thread_safe;

import static org.junit.Assert.assertEquals;

/**
 * 懒汉模式，线程安全单例测试
 * @author hoojo
 * @createDate 2018年8月23日 下午10:49:11
 * @file App.java
 * @package io.github.hooj0.singleton.support.lazy_thread_safe
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class App {

	public static void main(String[] args) {
		
		LazyThreadSafeSingleton instanceFoo = LazyThreadSafeSingleton.getInstance();
		LazyThreadSafeSingleton instanceBar = LazyThreadSafeSingleton.getInstance();
		
		// 同一个实例
		assertEquals(instanceFoo, instanceBar);
		
		// 调用方法
		LazyThreadSafeSingleton.getInstance().trigger();	// You trigger a message.
	}
}
