package io.github.hooj0.command.typewriter.support;

/**
 * red font command implements class
 * 
 * @author hoojo
 * @createDate 2018年11月19日 下午10:46:37
 * @file RedFont.java
 * @package io.github.hooj0.command.typewriter.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class RedFontCommand extends Command {

	private AbstractFont font;
	private Color originalColor;
	
	public RedFontCommand(AbstractFont font) {
		this.font = font;
		this.originalColor = this.font.getColor();
	}
	
	@Override
	public void execute() {
		this.font.setColor(Color.RED);
	}

	@Override
	public void undo() {
		this.font.setColor(originalColor);
	}

	@Override
	public void redo() {
		this.execute();
	}

	@Override
	public String toString() {
		return "设置红色字体";
	}
}
