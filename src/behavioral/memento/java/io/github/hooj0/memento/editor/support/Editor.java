package io.github.hooj0.memento.editor.support;

/**
 * editor interface defined
 * 编辑器接口定义
 * 
 * @author hoojo
 * @createDate 2018年12月6日 下午11:22:16
 * @file Editor.java
 * @package io.github.hooj0.memento.editor.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public interface Editor {

	public String getContent();
	
	public Memento save();
	
	public void restore(Memento memento);
}
