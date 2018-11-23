package io.github.hooj0.interpreter;

import io.github.hooj0.interpreter.support.MathProcessor;

/**
 * expression application client
 * @author hoojo
 * @createDate 2018年11月22日 下午10:34:10
 * @file App.java
 * @package io.github.hooj0.interpreter
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class App {

	public static void main(String[] args) {
		MathProcessor.parser("4 3 2 - 1 + *");

		MathProcessor.parser("4 2 - 3 + 2 * 5 /");
	}
}
