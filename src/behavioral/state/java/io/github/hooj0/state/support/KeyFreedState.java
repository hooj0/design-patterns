package io.github.hooj0.state.support;

/**
 * key freed state interface support
 * 键盘按键释放状态
 * @author hoojo
 * @createDate 2018年12月16日 下午9:18:45
 * @file KeyFreedState.java
 * @package io.github.hooj0.state.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class KeyFreedState implements State {

	private Keyboard keyboard;
	
	public KeyFreedState(Keyboard keyboard) {
		this.keyboard = keyboard;
	}
	
	@Override
	public void onEnterState() {
		System.out.println(keyboard + " 进入 up 状态。");
	}

	@Override
	public void onSpeedState() {
		System.out.println(keyboard + " 按键被释放。");
	}
}
