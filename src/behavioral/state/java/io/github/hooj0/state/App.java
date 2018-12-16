package io.github.hooj0.state;

import io.github.hooj0.state.support.Keyboard;

/**
 * state pattern application client
 * @author hoojo
 * @createDate 2018年12月16日 下午8:58:08
 * @file App.java
 * @package io.github.hooj0.state
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class App {

	public static void main(String[] args) {
		Keyboard keyboard = new Keyboard();
		
		keyboard.rap();
		keyboard.recovery();
		
		keyboard.rap();
		keyboard.recovery();
	}
}
