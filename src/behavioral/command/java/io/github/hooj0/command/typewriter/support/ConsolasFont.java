package io.github.hooj0.command.typewriter.support;

/**
 * receiver: consolas font style settings class
 * 
 * @author hoojo
 * @createDate 2018年11月19日 下午11:07:46
 * @file ConsolasFont.java
 * @package io.github.hooj0.command.typewriter.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class ConsolasFont extends AbstractFont {

	public ConsolasFont() {
		setColor(Color.NORMAL);
	    setSize(Size.NORMAL);
	}
	
	@Override
	public String toString() {
		return "Consolas font";
	}
}
