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
	
	
}
