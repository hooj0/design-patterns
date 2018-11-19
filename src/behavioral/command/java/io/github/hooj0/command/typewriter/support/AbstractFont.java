package io.github.hooj0.command.typewriter.support;

/**
 * abstract font class defined
 * 
 * @author hoojo
 * @createDate 2018年11月19日 下午10:39:39
 * @file AbstractFont.java
 * @package io.github.hooj0.command.typewriter.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public abstract class AbstractFont {

	private Color color;
	private Size size;

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	@Override
	public abstract String toString();
	
	// 打印当前状态
	public void printStatus() {
		System.out.println(String.format("字体大小：%s, 字体颜色：%s", getSize(), getColor()));
	}
}
