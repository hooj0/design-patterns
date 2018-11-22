package io.github.hooj0.interpreter.support;

/**
 * expression parser processor
 * 表达式解析器
 * 
 * @author hoojo
 * @createDate 2018年11月22日 下午10:42:46
 * @file MathProcessor.java
 * @package io.github.hooj0.interpreter.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public final class MathProcessor {

	public static int parser(String expression) {
		
		return 0;
	}
	
	public static Expression getExpression(String operator, Expression left, Expression right) {
		switch (operator) {
			case "+":
				return new AddExpression(left, right);
			case "-":
				return new SubtractExpression(left, right);
			case "*":
				return new MultiplyExpression(left, right);
			case "/":
				return new DivideExpression(left, right);
			default:
				throw new UnsupportedOperationException("unsupport operator " + operator);
		}
	}
	
	public static boolean isOperator(String s) {
		return "+".equals(s) || "-".equals(s) || "*".equals(s) || "/".equals(s);
	}
}
