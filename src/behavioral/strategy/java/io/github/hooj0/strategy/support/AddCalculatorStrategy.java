package io.github.hooj0.strategy.support;

/**
 * add calculator strategy implements
 * 加法运算实现
 * @author hoojo
 * @createDate 2018年12月15日 下午10:17:13
 * @file AddCalculatorStrategy.java
 * @package io.github.hooj0.strategy.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class AddCalculatorStrategy implements CalculatorStrategy {

	@Override
	public void doOperator(int foo, int bar) {
		System.out.println("foo + bar = " + (foo + bar));
	}
}
