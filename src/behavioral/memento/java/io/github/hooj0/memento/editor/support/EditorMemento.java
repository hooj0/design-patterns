package io.github.hooj0.memento.editor.support;

/**
 * memento interface class implements
 * 备忘录接口实现
 * 
 * @author hoojo
 * @createDate 2018年12月6日 下午11:21:01
 * @file EditorMemento.java
 * @package io.github.hooj0.memento.editor.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class EditorMemento implements Memento {

	private String content;
	
	public EditorMemento(String content) {
		this.content = content;
	}
	
	@Override
	public String getContent() {
		return this.content;
	}
}
