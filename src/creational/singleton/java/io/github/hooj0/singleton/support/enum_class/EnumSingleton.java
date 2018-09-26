package io.github.hooj0.singleton.support.enum_class;

/**
 * 枚举单例模式
 * 特征：
 * 		1、立即加载初始化
 * 		2、多线程安全
 * 		3、实现简单
 * 优点：立即加载，立即初始化，所以在多线程下是安全的，实现简洁；自动支持序列化机制，防止反序列化时多次实例化；；
 * 缺点：在一定程度上不向下兼容，跟JDK版本有关，在jdk1.5之前的版本无法使用枚举；不能通过反射构造私有方法；
 * 原理：实现方式利用枚举的加载方式初始化单例。
 * 
 * @author hoojo
 * @createDate 2018年9月26日 下午9:39:29
 * @file EnumSingleton.java
 * @package io.github.hooj0.singleton.support.enum_class
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public enum EnumSingleton {

	INSTANCE;
	
	public void trigger() {
		System.out.println("You trigger a message.");
	}
}
