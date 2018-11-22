package io.github.hooj0.interpreter.support;

/**
 * divide expression support
 * 除法表达式实现
 * @author hoojo
 * @createDate 2018年11月22日 下午10:33:23
 * @file DivideExpression.java
 * @package io.github.hooj0.interpreter.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class DivideExpression extends Expression {

	private Expression leftExpression;
	private Expression rightExpression;

	public DivideExpression(Expression leftExpression, Expression rightExpression) {
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
	}
	
	@Override
	public int interpret() {
		return leftExpression.interpret() / rightExpression.interpret();
	}

	@Override
	public String toString() {
		return "/";
	}
}
