package io.github.hooj0.decorator.support.association;

/**
 * simple coffee interface support
 * 简单咖啡业务对象实现类
 * 
 * @author hoojo
 * @createDate 2018年10月28日 下午11:10:56
 * @file SimpleCoffee.java
 * @package io.github.hooj0.decorator.support.association
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class SimpleCoffee implements Coffee {

	@Override
	public int getCost() {
		return 8;
	}

	@Override
	public String getDescription() {
		return "ordinary coffee";
	}
}
