package io.github.hooj0.strategy.support;

/**
 * calculator strategy interface class defined
 * 计算器策略模式接口
 * 
 * @author hoojo
 * @createDate 2018年12月15日 下午10:10:37
 * @file CalculatorStrategy.java
 * @package io.github.hooj0.strategy.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public interface CalculatorStrategy {

	public void doOperator(int foo, int bar);
}
