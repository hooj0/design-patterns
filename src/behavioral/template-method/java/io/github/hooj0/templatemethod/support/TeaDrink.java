package io.github.hooj0.templatemethod.support;

/**
 * template method pattern —— tea drink support
 * 茶的制作类
 * 
 * @author hoojo
 * @createDate 2018年12月27日 上午10:27:18
 * @file TeaDrink.java
 * @package io.github.hooj0.templatemethod.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class TeaDrink extends AbstractDrink {

	@Override
	protected void addRawMaterials() {
		System.out.println("加入菊花茶叶");
	}

	@Override
	protected void addCondiments() {
		System.out.println("加入冰糖");
	}

	@Override
	public String toString() {
		return "茶";
	}
}
