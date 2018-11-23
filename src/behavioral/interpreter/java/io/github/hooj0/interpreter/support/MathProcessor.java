package io.github.hooj0.interpreter.support;

import java.util.Stack;

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
		Stack<Expression> stack = new Stack<>();
		
		String[] items = expression.split(" ");
		for (String item : items) {
			if (isOperator(item)) {
				Expression rightExpression = stack.pop();
				Expression leftExpression = stack.pop();
				System.out.println(String.format("left: %s, right: %s", leftExpression.interpret(), rightExpression.interpret()));
				
				Expression operator = getExpression(item, leftExpression, rightExpression);
				System.out.println("operator: " + operator);
				
				int result = operator.interpret();
				NumberExpression resultExpression = new NumberExpression(result);
				stack.push(resultExpression);
				
				System.out.println(String.format("push result to stack: %s", resultExpression.interpret()));
			} else {
				Expression num = new NumberExpression(item);
				stack.push(num);
				System.out.println("push to stack: " + num.interpret());
			}
		}
		
		int data = stack.pop().interpret();
		System.out.println(String.format("result: %s", data));
		
		return data;
	}
	
	private static Expression getExpression(String operator, Expression left, Expression right) {
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
	
	private static boolean isOperator(String s) {
		return "+".equals(s) || "-".equals(s) || "*".equals(s) || "/".equals(s);
	}
}
