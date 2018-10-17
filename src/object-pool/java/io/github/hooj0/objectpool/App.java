package io.github.hooj0.objectpool;

import io.github.hooj0.objectpool.support.AbstractObjectPool;
import io.github.hooj0.objectpool.support.Product;
import io.github.hooj0.objectpool.support.ProductPool;

/**
 * object pool application client class
 * 
 * @author hoojo
 * @createDate 2018年10月17日 下午8:53:07
 * @file App.java
 * @package io.github.hooj0.objectpool
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class App {

	public static void main(String[] args) {
		AbstractObjectPool<Product> pool = new ProductPool();
		
		// 从对象池获取 product 对象
		Product product = pool.checkOut();
		System.out.println(product);
		
		// 再次获取对象
		System.out.println(pool.checkOut());
		
		// 向对象池添加对象，进行回收
		pool.checkIn(product);
		
		// 再次获取对象
		System.out.println(pool.checkOut());
		
		/*
		 通过结果发现首次创建的是新对象，最后一次创建的是第一次使用过回收的对象
		 
		 	Product io.github.hooj0.objectpool.support.Product@52e922 id=1
			Product io.github.hooj0.objectpool.support.Product@a14482 id=2
			Product io.github.hooj0.objectpool.support.Product@52e922 id=1
		 */
	}
}
