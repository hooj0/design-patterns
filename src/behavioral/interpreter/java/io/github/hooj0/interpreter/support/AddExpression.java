package io.github.hooj0.interpreter.support;

/**
 * add expression support
 * 加法表达式实现
 * 
 * @author hoojo
 * @createDate 2018年11月22日 下午10:30:20
 * @file AddExpression.java
 * @package io.github.hooj0.interpreter.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class AddExpression extends Expression {

	private Expression leftExpression;
	private Expression rightExpression;
	
	public AddExpression(Expression leftExpression, Expression rightExpression) {
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
	}
	
	@Override
	public int interpret() {
		return leftExpression.interpret() + rightExpression.interpret();
	}

	@Override
	public String toString() {
		return "+";
	}
}
