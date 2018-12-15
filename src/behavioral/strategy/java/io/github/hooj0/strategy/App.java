package io.github.hooj0.strategy;

import io.github.hooj0.strategy.support.AddCalculatorStrategy;
import io.github.hooj0.strategy.support.CalculatorContext;
import io.github.hooj0.strategy.support.DivideCalculatorStrategy;
import io.github.hooj0.strategy.support.MultiplyCalculatorStrategy;
import io.github.hooj0.strategy.support.SubtractCalculatorStrategy;

/**
 * calculator strategy application client
 * @author hoojo
 * @createDate 2018年12月15日 下午10:19:26
 * @file App.java
 * @package io.github.hooj0.strategy
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class App {

	public static void main(String[] args) {

		CalculatorContext context = new CalculatorContext(new AddCalculatorStrategy());
		context.executionCalc(2, 5);

		context.switchStrategy(new DivideCalculatorStrategy());
		context.executionCalc(2, 5);
		
		context.switchStrategy(new MultiplyCalculatorStrategy());
		context.executionCalc(2, 5);
		
		context.switchStrategy(new SubtractCalculatorStrategy());
		context.executionCalc(2, 5);
	}
}
