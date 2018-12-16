package io.github.hooj0.state.support;

/**
 * keyboard press and freed state
 * 键盘按下和释放状态
 * 
 * @author hoojo
 * @createDate 2018年12月16日 下午9:13:35
 * @file Keyboard.java
 * @package io.github.hooj0.state.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class Keyboard {

	private State state;
	
	public Keyboard() {
		this.state = new KeyPressState(this);
	}
	
	private void changeStateTo(State newState) {
		this.state = newState;
		this.state.onEnterState();
	}
	
	public void rap() {
		if (this.state.getClass().equals(KeyPressState.class)) {
			this.changeStateTo(new KeyFreedState(this));
		} else {
			this.changeStateTo(new KeyPressState(this));
		}
	}
	
	public void recovery() {
		this.state.onSpeedState();
	}
}
