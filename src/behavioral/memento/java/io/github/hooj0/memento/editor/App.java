package io.github.hooj0.memento.editor;

import java.util.Stack;

import io.github.hooj0.memento.editor.support.CareTaker;
import io.github.hooj0.memento.editor.support.Editor;
import io.github.hooj0.memento.editor.support.Memento;
import io.github.hooj0.memento.editor.support.TextEditor;

/**
 * memento pattern editor application client
 * @author hoojo
 * @createDate 2018年12月6日 下午11:12:25
 * @file App.java
 * @package io.github.hooj0.memento.editor
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class App {

	public static void main(String[] args) {

		Editor editor = new TextEditor();
		// 设置内容
		editor.setContent("hi~ joe!");
		System.out.println(editor.getContent());
		
		// 保存内容
		Memento memento = editor.save();
		editor.setContent("oh hohoho~");	// 重新设置内容
		System.out.println(editor.getContent());
		
		// 恢复之前的内容
		editor.restore(memento);
		System.out.println(editor.getContent());
		
		// stack mode
		Stack<Memento> states = new Stack<>();
		states.push(memento);
		
		editor.setContent("message #1");
		states.push(editor.save());
		System.out.println(editor.getContent());
		
		editor.setContent("message #2");
		states.push(editor.save());
		System.out.println(editor.getContent());
		
		editor.setContent("message #3");
		states.push(editor.save());
		System.out.println(editor.getContent());
		
		while (states.size() > 0) {
			editor.restore(states.pop());
			System.out.println(editor.getContent());
		}
		
		// CareTaker mode
		// ---------------------------------------------------
		CareTaker taker = new CareTaker();
		
		editor = new TextEditor();
		editor.setContent("content #1");
		taker.add(editor.save());
		System.out.println(editor.getContent());
		
		editor.setContent("content #2");
		taker.add(editor.save());
		System.out.println(editor.getContent());
		
		editor.setContent("content #3");
		taker.add(editor.save());
		System.out.println(editor.getContent());
		
		editor.restore(taker.pop());
		System.out.println(editor.getContent());
		
		editor.restore(taker.pop());
		System.out.println(editor.getContent());
		
		editor.restore(taker.pop());
		System.out.println(editor.getContent());
	}
}
