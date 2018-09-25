package io.github.hooj0.singleton.support.double_checked_locking;

import static org.junit.Assert.assertEquals;

/**
 * DCL 双重锁多线程单例模式
 * @author hoojo
 * @createDate 2018年9月25日 下午10:53:04
 * @file App.java
 * @package io.github.hooj0.singleton.support.double_checked_locking
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class App {

	public static void main(String[] args) {
		DCLSingleton instanceFoo = DCLSingleton.getInstance();
		DCLSingleton instanceBar = DCLSingleton.getInstance();
		
		// 同一个实例
		assertEquals(instanceFoo, instanceBar);
		
		// 调用方法
		DCLSingleton.getInstance().trigger();	// You trigger a message.
	}
}
