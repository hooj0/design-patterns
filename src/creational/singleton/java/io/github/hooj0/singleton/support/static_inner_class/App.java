package io.github.hooj0.singleton.support.static_inner_class;

import static org.junit.Assert.assertEquals;

/**
 * 静态内部类单例模式测试
 * @author hoojo
 * @createDate 2018年9月25日 下午11:06:15
 * @file App.java
 * @package io.github.hooj0.singleton.support.static_inner_class
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class App {

	public static void main(String[] args) {
		StaticInnerClassSingleton instanceFoo = StaticInnerClassSingleton.getInstance();
		StaticInnerClassSingleton instanceBar = StaticInnerClassSingleton.getInstance();
		
		// 同一个实例
		assertEquals(instanceFoo, instanceBar);
		
		// 调用方法
		StaticInnerClassSingleton.getInstance().trigger();	// You trigger a message.
	}
}
