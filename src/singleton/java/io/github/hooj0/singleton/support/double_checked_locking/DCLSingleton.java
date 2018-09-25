package io.github.hooj0.singleton.support.double_checked_locking;

/**
 * 双重校验锁 DCL (double checked locking)
 * 特点：
 * 		1、线程安全，需要使用线程同步关键字进行修饰，保证多线程并发安全
 * 		2、由于使用双重验证，导致在多线程情形下，也许存在性能低下的问题
 * 		3、实现复杂
 * 		4、延迟初始化，在要使用的时候才会实例化
 * 优点：线程安全，双重锁校验
 * 缺点：性能低，实现复杂
 * 原理：在多线程情形下，利用双重锁进行锁定实例化代码，保证每次仅有一个线程进入，保证实例唯一
 * 		
 * @author hoojo
 * @createDate 2018年9月25日 下午9:41:43
 * @file DCLSingleton.java
 * @package io.github.hooj0.singleton.support.double_checked_locking
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class DCLSingleton {

	// 多线程共享实例
	private volatile static DCLSingleton instance;
	
	private DCLSingleton() {
	}
	
	public static DCLSingleton getInstance() {
		
		if (instance == null) {
			synchronized (DCLSingleton.class) {
				if (instance == null) {
					instance = new DCLSingleton();
				}
			}
		}
		
		return instance;
	}
	
	public void trigger() {
		System.out.println("You trigger a message.");
	}
}
