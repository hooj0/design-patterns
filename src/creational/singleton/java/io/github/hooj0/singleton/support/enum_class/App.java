package io.github.hooj0.singleton.support.enum_class;

import static org.junit.Assert.assertEquals;

/**
 * 枚举单例测试
 * 
 * @author hoojo
 * @createDate 2018年9月26日 下午9:46:41
 * @file App.java
 * @package io.github.hooj0.singleton.support.enum_class
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class App {

	public static void main(String[] args) {
		EnumSingleton instanceFoo = EnumSingleton.INSTANCE;
		EnumSingleton instanceBar = EnumSingleton.INSTANCE;
		
		// 同一个实例
		assertEquals(instanceFoo, instanceBar);
		
		// 调用方法
		EnumSingleton.INSTANCE.trigger();	// You trigger a message.
	}

}
