package io.github.hooj0.command.typewriter.support;

/**
 * command abstract class, defined support method
 * 
 * @author hoojo
 * @createDate 2018年11月19日 下午10:26:25
 * @file Command.java
 * @package io.github.hooj0.command.typewriter.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public abstract class Command {

	public abstract void execute();
	
	public abstract void undo();
	
	public abstract void redo();
	
	public abstract String toString();
}
