package io.github.hooj0.singleton.support.hungry_thread_safe;

import static org.junit.Assert.assertEquals;

/**
 * 饿汉模式，线程安全，测试程序
 * @author hoojo
 * @createDate 2018年8月23日 下午11:08:41
 * @file App.java
 * @package io.github.hooj0.singleton.support.hungry_thread_safe
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class App {

	public static void main(String[] args) {
		HungryThreadSafeSingleton instanceFoo = HungryThreadSafeSingleton.getInstance();
		HungryThreadSafeSingleton instanceBar = HungryThreadSafeSingleton.getInstance();
		
		// 同一个实例
		assertEquals(instanceFoo, instanceBar);
		
		// 调用方法
		HungryThreadSafeSingleton.getInstance().trigger();	// You trigger a message.
	}
}
