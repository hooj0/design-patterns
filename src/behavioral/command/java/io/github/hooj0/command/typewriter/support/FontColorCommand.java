package io.github.hooj0.command.typewriter.support;

/**
 * red font command implements class
 * 
 * @author hoojo
 * @createDate 2018年11月19日 下午10:46:37
 * @file FontColorCommand.java
 * @package io.github.hooj0.command.typewriter.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class FontColorCommand extends Command {

	private AbstractFont font;
	
	@Override
	public void execute(AbstractFont font) {
		this.font = font;
		
		this.font.setColor(Color.RED);
	}

	@Override
	public void undo() {
		this.font.setColor(Color.NORMAL);
	}

	@Override
	public void redo() {
		this.execute(this.font);
	}

	@Override
	public String toString() {
		return "font-color";
	}
}
