package io.github.hooj0.objectpool.support;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * custom product object class 高成本才能创建的对象
 * 
 * @author hoojo
 * @createDate 2018年10月17日 下午9:15:52
 * @file Product.java
 * @package io.github.hooj0.objectpool.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class Product {

	// 多线程计数器对象，线程安全
	private static AtomicInteger counter = new AtomicInteger(0);

	private final int id;

	public Product() {
		// 线程安全的id
		id = counter.incrementAndGet();

		try {
			// 休眠一秒，造成资源性能消耗
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return String.format("Product %s id=%d", super.toString(), id);
	}
}
