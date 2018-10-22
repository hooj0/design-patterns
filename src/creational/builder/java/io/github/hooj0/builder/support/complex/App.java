package io.github.hooj0.builder.support.complex;

import io.github.hooj0.builder.support.complex.Product.ProductBuilder;

/**
 * complex example app client application
 * @author hoojo
 * @createDate 2018年10月14日 下午10:53:41
 * @file App.java
 * @package io.github.hooj0.builder.support.simple
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class App {

	public static void main(String[] args) {
		Product product = ProductBuilder.newBuilder().size(1).build();
		System.out.println(product.getSize());
		
		product = ProductBuilder.newBuilder("keyboard").size(50).price(53.0f).orderNo("122234234").build();
		System.out.println(product.getName());
	}
}
