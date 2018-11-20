package io.github.hooj0.command.typewriter.support;

/**
 * small font command implements class
 * 
 * @author hoojo
 * @createDate 2018年11月19日 下午10:56:44
 * @file SmallFontCommand.java
 * @package io.github.hooj0.command.typewriter.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class SmallFontCommand extends Command {

	private AbstractFont font;
	private Size originalSize;
	
	public SmallFontCommand(AbstractFont font) {
		this.font = font;
		this.originalSize = this.font.getSize();
	}
	
	@Override
	public void execute() {
		this.font.setSize(Size.SMALL);
	}

	@Override
	public void undo() {
		this.font.setSize(originalSize);
	}

	@Override
	public void redo() {
		this.execute();
	}

	@Override
	public String toString() {
		return "设置小号字体";
	}
}
