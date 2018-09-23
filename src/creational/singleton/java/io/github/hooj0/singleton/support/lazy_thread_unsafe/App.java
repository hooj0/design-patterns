package io.github.hooj0.singleton.support.lazy_thread_unsafe;

import static org.junit.Assert.assertEquals;

/**
 * 懒汉模式，线程不安全实例测试
 * @author hoojo
 * @createDate 2018年9月23日 上午10:14:19
 * @file App.java
 * @package io.github.hooj0.singleton.support.lazy_thread_unsafe
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class App {

	public static void main(String[] args) {

		LazyThreadUnsafeSingleton instanceFoo = LazyThreadUnsafeSingleton.getInstance();
		LazyThreadUnsafeSingleton instanceBar = LazyThreadUnsafeSingleton.getInstance();
		
		// 同一个实例
		assertEquals(instanceFoo, instanceBar);
		
		// 调用方法
		LazyThreadUnsafeSingleton.getInstance().trigger();	// You trigger a message.
	}
}
