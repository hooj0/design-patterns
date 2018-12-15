package io.github.hooj0.strategy.support;

/**
 * multiply calculator strategy implements
 * 乘法计算实现
 * @author hoojo
 * @createDate 2018年12月15日 下午10:18:38
 * @file MultiplyCalculatorStrategy.java
 * @package io.github.hooj0.strategy.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class MultiplyCalculatorStrategy implements CalculatorStrategy {

	@Override
	public void doOperator(int foo, int bar) {
		System.out.println("foo x bar = " + (foo * bar));
	}
}
