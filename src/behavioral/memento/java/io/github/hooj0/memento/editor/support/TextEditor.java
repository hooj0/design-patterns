package io.github.hooj0.memento.editor.support;

/**
 * text editor implements editor
 * Originator：原始对象，文本编辑器实现
 * 
 * @author hoojo
 * @createDate 2018年12月6日 下午11:23:00
 * @file TextEditor.java
 * @package io.github.hooj0.memento.editor.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class TextEditor implements Editor {

	private String content;
	
	@Override
	public String getContent() {
		return this.content;
	}
	
	@Override
	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public Memento save() {
		return new EditorMemento(content);
	}

	@Override
	public void restore(Memento memento) {
		this.content = memento.getContent();
	}
}
