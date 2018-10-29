package io.github.hooj0.decorator.support.association;

/**
 * honey coffee interface support
 * 蜂蜜咖啡业务对象实现类
 * 
 * @author hoojo
 * @createDate 2018年10月28日 下午11:22:27
 * @file HoneyCoffee.java
 * @package io.github.hooj0.decorator.support.association
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class HoneyCoffee implements Coffee {
	
	private Coffee decorated;

	public HoneyCoffee(Coffee coffee) {
		this.decorated = coffee;
	}
	
	@Override
	public int getCost() {
		return decorated.getCost() + 3;
	}

	@Override
	public String getDescription() {
		return decorated.getDescription() + ", add honey";
	}
}
