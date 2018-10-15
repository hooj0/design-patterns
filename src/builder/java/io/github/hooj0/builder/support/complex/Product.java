package io.github.hooj0.builder.support.complex;

/**
 * complex example, product entity class
 * 
 * 降低 Product对Builder的耦合，Product脱离Builder也不影响代码运行编译
 * @author hoojo
 * @createDate 2018年10月22日 下午8:59:20
 * @file Product.java
 * @package io.github.hooj0.builder.support.complex
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public final class Product {

	private String name;
	private float price;
	private int size;
	private String orderNo;

	private Product() {
	}
	
	private Product(String name) {
		this.name = name;
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
	
	public static final class ProductBuilder {
		private final Product product;

		private ProductBuilder() {
			this.product = new Product();
		}
		
		private ProductBuilder(String name) {
			this.product = new Product(name);
		}
		
		public static ProductBuilder newBuilder() {
			return new ProductBuilder();
		}
		
		public static ProductBuilder newBuilder(String name) {
			if (name == null) {
				throw new IllegalArgumentException("name can not be null");
			}
			
			return new ProductBuilder(name); 
		}
		
		public ProductBuilder price(float price) {
			this.product.price = price;
			
			return this;
		}
		
		public ProductBuilder size(int size) {
			this.product.size = size;
			
			return this;
		}
		
		public ProductBuilder orderNo(String orderNo) {
			this.product.orderNo = orderNo;
			
			return this;
		}
		
		public Product build() {
			
			if (this.product.size <= 0) {
				throw new IllegalArgumentException("size can not be zore.");
			}
			
			return this.product;
		}
	}
}
