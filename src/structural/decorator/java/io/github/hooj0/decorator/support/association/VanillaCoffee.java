package io.github.hooj0.decorator.support.association;

/**
 * vanilla coffee interface support
 * 香草咖啡业务对象实现类
 * 
 * @author hoojo
 * @createDate 2018年10月28日 下午11:17:50
 * @file VanillaCoffee.java
 * @package io.github.hooj0.decorator.support.association
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class VanillaCoffee implements Coffee {

	private Coffee decorated;

	public VanillaCoffee(Coffee coffee) {
		this.decorated = coffee;
	}
	
	@Override
	public int getCost() {
		return decorated.getCost() + 5;
	}

	@Override
	public String getDescription() {
		return decorated.getDescription() + ", add vanilla";
	}

}
