package io.github.hooj0.strategy.support;

/**
 * calculator strategy context implement
 * 计算器策略上下文对象
 * @author hoojo
 * @createDate 2018年12月15日 下午10:34:40
 * @file CalculatorContext.java
 * @package io.github.hooj0.strategy.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class CalculatorContext {

	private CalculatorStrategy strategy;
	
	public CalculatorContext(CalculatorStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void switchStrategy(CalculatorStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void executionCalc(int a, int b) {
		this.strategy.doOperator(a, b);
	}
}
