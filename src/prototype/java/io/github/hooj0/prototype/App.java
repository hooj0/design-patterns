package io.github.hooj0.prototype;

import io.github.hooj0.prototype.support.PrototypeProduct;

/**
 * prototype pattern app client application
 * @author hoojo
 * @createDate 2018年10月16日 下午10:51:29
 * @file App.java
 * @package io.github.hooj0.prototype
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class App {

	public static void main(String[] args) throws CloneNotSupportedException {

		PrototypeProduct product = new PrototypeProduct("jack");
		product.setId(122344L);
		
		System.out.println(product);
		
		// 克隆对象
		System.out.println(product.clone());
	}
}
