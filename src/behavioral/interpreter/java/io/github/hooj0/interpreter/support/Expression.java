package io.github.hooj0.interpreter.support;

/**
 * expression abstract class, give subclass extend used.
 * Add, subtract, multiply, divide
 * 表达式抽象对象，提供其他子表达式使用继承。
 * @author hoojo
 * @createDate 2018年11月22日 下午10:22:11
 * @file Expression.java
 * @package io.github.hooj0.interpreter.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public abstract class Expression {

	public abstract void interpret();
	
	@Override
	public abstract String toString();
}
