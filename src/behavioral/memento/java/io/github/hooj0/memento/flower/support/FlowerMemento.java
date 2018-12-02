package io.github.hooj0.memento.flower.support;

/**
 * memento pattern interface defined class
 * 备忘录模式接口定义
 * 
 * @author hoojo
 * @createDate 2018年12月2日 下午9:06:44
 * @file FlowerMemento.java
 * @package io.github.hooj0.memento.flower.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public interface FlowerMemento {

	// 花瓣大小
	public int getSize();
	
	// 花期
	public int getDuration();
	
	public FlowerState getState();
}
