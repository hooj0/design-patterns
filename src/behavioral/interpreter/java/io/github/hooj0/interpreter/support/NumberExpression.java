package io.github.hooj0.interpreter.support;

/**
 * number expression support
 * 数字转换表达式实现
 * 
 * @author hoojo
 * @createDate 2018年11月22日 下午10:37:43
 * @file NumberExpression.java
 * @package io.github.hooj0.interpreter.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class NumberExpression extends Expression {

	private int number;
	
	public NumberExpression(int number) {
		this.number = number;
	}
	
	public NumberExpression(String number) {
		this.number = Integer.parseInt(number);
	}
	
	@Override
	public int interpret() {
		return this.number;
	}

	@Override
	public String toString() {
		return "number";
	}
}
