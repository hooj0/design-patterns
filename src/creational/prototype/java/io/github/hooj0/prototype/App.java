package io.github.hooj0.prototype;

import java.io.IOException;

import io.github.hooj0.prototype.support.DeepCloneProduct;
import io.github.hooj0.prototype.support.DeepCloneProduct.SerializableObject;
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

	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException {

		PrototypeProduct product = new PrototypeProduct("jack");
		product.setId(122344L);
		
		System.out.println(product);
		
		// 克隆对象
		System.out.println(product.clone());
		
		DeepCloneProduct cloneProduct = new DeepCloneProduct("deep");
		cloneProduct.setId(1111111111L);
		cloneProduct.setObj(new SerializableObject("Serializable Object"));
		
		System.out.println(cloneProduct);
		
		System.out.println("--------------------clone---------------------");
		cloneProduct = cloneProduct.clone();
		System.out.println(cloneProduct);
		System.out.println(cloneProduct.getObj());
		System.out.println(cloneProduct.getObj().getText());
		
		System.out.println("--------------------deepClone---------------------");
		// 发现深复制，DeepCloneProduct 对象中的 SerializableObject 的内存地址指向不同的目标位置
		cloneProduct = (DeepCloneProduct) cloneProduct.deepClone();
		System.out.println(cloneProduct);
		System.out.println(cloneProduct.getObj());
		System.out.println(cloneProduct.getObj().getText());
	}
}
