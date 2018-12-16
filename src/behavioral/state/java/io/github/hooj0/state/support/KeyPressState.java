package io.github.hooj0.state.support;

/**
 * key press state implement support.
 * 键按下实现
 * 
 * @author hoojo
 * @createDate 2018年12月16日 下午9:11:20
 * @file KeyPressState.java
 * @package io.github.hooj0.state.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class KeyPressState implements State {

	private Keyboard keyboard;
	
	public KeyPressState(Keyboard keyboard) {
		this.keyboard = keyboard;
	}
	
	@Override
	public void onEnterState() {
		System.out.println(keyboard + " 进入 down 状态。");
	}

	@Override
	public void onSpeedState() {
		System.out.println(keyboard + " 被快速的按下。");
	}
}
