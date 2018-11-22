package io.github.hooj0.interpreter.support;

/**
 * multiply expression support
 * 乘法表达式实现
 * 
 * @author hoojo
 * @createDate 2018年11月22日 下午10:32:22
 * @file MultiplyExpression.java
 * @package io.github.hooj0.interpreter.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class MultiplyExpression extends Expression {

	private Expression leftExpression;
	private Expression rightExpression;

	public MultiplyExpression(Expression leftExpression, Expression rightExpression) {
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
	}
	
	@Override
	public int interpret() {
		return leftExpression.interpret() * rightExpression.interpret();
	}

	@Override
	public String toString() {
		return "*";
	}
}
