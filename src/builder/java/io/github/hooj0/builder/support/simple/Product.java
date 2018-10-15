package io.github.hooj0.builder.support.simple;

/**
 * simple example, product entity class
 * 
 * @author hoojo
 * @createDate 2018年10月14日 下午10:42:32
 * @file Product.java
 * @package io.github.hooj0.builder.support.simple
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public final class Product {

	private final String name;
	private final float price;
	private final int size;
	private final String orderNo;

	private Product(Builder builder) {

		this.name = builder.name;
		this.price = builder.price;
		this.size = builder.size;
		this.orderNo = builder.orderNo;
	}

	public String getName() {
		return name;
	}

	public float getPrice() {
		return price;
	}

	public int getSize() {
		return size;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public static final class Builder {
		private final String name;
		private float price;
		private int size;
		private String orderNo;

		public Builder(String name) {
			if (name == null) {
				throw new IllegalArgumentException("name can not be null");
			}
			this.name = name;
		}
		
		public Builder price(float price) {
			this.price = price;
			
			return this;
		}
		
		public Builder size(int size) {
			this.size = size;
			
			return this;
		}
		
		public Builder orderNo(String orderNo) {
			this.orderNo = orderNo;
			
			return this;
		}
		
		public Product build() {
			
			if (this.size <= 0) {
				throw new IllegalArgumentException("size can not be zore.");
			}
			
			return new Product(this);
		}
	}
}
