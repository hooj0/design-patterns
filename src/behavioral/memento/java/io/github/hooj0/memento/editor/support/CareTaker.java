package io.github.hooj0.memento.editor.support;

import java.util.Stack;

/**
 * CareTaker save memento state 
 * `Caretaker`：负责保存好备忘录**，负责从  `Memento` 中恢复对象的状态
 * 
 * @author hoojo
 * @createDate 2018年12月5日 下午1:14:46
 * @file CareTaker.java
 * @package io.github.hooj0.memento.editor.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class CareTaker {

	// stack mode
	private Stack<Memento> states = new Stack<>();
	
	public void add(Memento memento) {
		states.push(memento);
	}
	
	public Memento pop() {
		return states.pop();
	}
}
