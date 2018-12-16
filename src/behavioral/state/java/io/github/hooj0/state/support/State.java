package io.github.hooj0.state.support;

/**
 * state interface class defined.
 * 状态接口定义
 * 
 * @author hoojo
 * @createDate 2018年12月16日 下午8:59:19
 * @file State.java
 * @package io.github.hooj0.state.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public interface State {

	// 状态
	public void onEnterState();
	
	// 行为
	public void onSpeedState();
}
