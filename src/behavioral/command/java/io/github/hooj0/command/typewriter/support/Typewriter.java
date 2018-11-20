package io.github.hooj0.command.typewriter.support;

import java.util.Deque;
import java.util.LinkedList;

/**
 * invoker: typewriter class complete typing
 * 
 * @author hoojo
 * @createDate 2018年11月19日 下午11:12:26
 * @file Typewriter.java
 * @package io.github.hooj0.command.typewriter.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public final class Typewriter {

	private Deque<Command> undoStack = new LinkedList<>();
	private Deque<Command> redoStack = new LinkedList<>();
	
	public void cast(Command command, AbstractFont font) {
		System.out.println(String.format("%s casts %s at %s", this, command, font));
		
		command.execute(font);
		// 加入到恢复队列
		undoStack.offerLast(command);
	}
	
	// 恢复最后一个步骤
	public void undoLast() {
		if (!undoStack.isEmpty()) {
			// 弹出最后一个元素
			Command previous = undoStack.pollLast();
			// 加入到重做队列
			redoStack.offerLast(previous);
			System.out.println(String.format("%s undoes %s", this, previous));
			// 恢复操作
			previous.undo();
		}
	}
	
	// 重做最后一步
	public void redoLast() {
		if (!redoStack.isEmpty()) {
			// 弹出最后一个命令
			Command previous = redoStack.pollLast();
			// 加入到恢复队列
			undoStack.offerLast(previous);
			System.out.println(String.format("%s redoes %s", this, previous));
			// 重做操作
			previous.redo();
		}
	}
	
	@Override
	public String toString() {
		return "typewriter";
	}
}
