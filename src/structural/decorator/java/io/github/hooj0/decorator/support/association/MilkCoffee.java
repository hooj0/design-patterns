package io.github.hooj0.decorator.support.association;

/**
 * milk coffee interface support
 * 牛奶咖啡业务对象实现类
 * 
 * @author hoojo
 * @createDate 2018年10月28日 下午11:14:24
 * @file MilkCoffee.java
 * @package io.github.hooj0.decorator.support.association
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class MilkCoffee implements Coffee {

	private Coffee decorated;

	public MilkCoffee(Coffee coffee) {
		this.decorated = coffee;
	}
	
	@Override
	public int getCost() {
		return decorated.getCost() + 2;
	}

	@Override
	public String getDescription() {
		return decorated.getDescription() + ", add milk";
	}
}
