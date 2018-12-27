package io.github.hooj0.templatemethod.support;

/**
 * template method pattern —— coffee drink support
 * 咖啡的制作类
 * 
 * @author hoojo
 * @createDate 2018年12月27日 上午10:32:44
 * @file CoffeeDrink.java
 * @package io.github.hooj0.templatemethod.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class CoffeeDrink extends AbstractDrink {

	@Override
	protected void addRawMaterials() {
		System.out.println("加入磨好的咖啡豆");
	}

	@Override
	protected void addCondiments() {
		System.out.println("加入牛奶和白糖");
	}

	@Override
	public String toString() {
		return "咖啡";
	}
}
