package io.github.hooj0.command.typewriter;

import io.github.hooj0.command.typewriter.support.AbstractFont;
import io.github.hooj0.command.typewriter.support.Color;
import io.github.hooj0.command.typewriter.support.ConsolasFont;
import io.github.hooj0.command.typewriter.support.FontColorCommand;
import io.github.hooj0.command.typewriter.support.FontSizeCommand;
import io.github.hooj0.command.typewriter.support.Size;
import io.github.hooj0.command.typewriter.support.Typewriter;

/**
 * typewriter command application client
 * @author hoojo
 * @createDate 2018年11月20日 下午8:59:24
 * @file App.java
 * @package io.github.hooj0.command.typewriter
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class App {

	public static void main(String[] args) {

		AbstractFont font = new ConsolasFont();
		font.printStatus();
		
		font.setColor(Color.RED);
		font.setSize(Size.SMALL);
		font.printStatus();
		
		Typewriter typewriter = new Typewriter();
		typewriter.cast(new FontSizeCommand(), font);
		font.printStatus();
		
		typewriter.cast(new FontColorCommand(), font);
		font.printStatus();
		
		typewriter.undoLast();
		font.printStatus();

		typewriter.undoLast();
		font.printStatus();
		
		typewriter.redoLast();
		font.printStatus();
		
		typewriter.redoLast();
		font.printStatus();
	}
}
