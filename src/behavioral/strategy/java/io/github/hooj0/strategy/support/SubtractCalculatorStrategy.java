package io.github.hooj0.strategy.support;

/**
 * subtract calculator strategy implement
 * 减法计算实现
 * @author hoojo
 * @createDate 2018年12月15日 下午10:19:05
 * @file SubtractCalculatorStrategy.java
 * @package io.github.hooj0.strategy.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class SubtractCalculatorStrategy implements CalculatorStrategy {

	@Override
	public void doOperator(int foo, int bar) {
		System.out.println("foo - bar = " + (foo - bar));
	}
}
