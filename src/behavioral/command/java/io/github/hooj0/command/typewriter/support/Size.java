package io.github.hooj0.command.typewriter.support;

/**
 * font size enum class
 * 
 * @author hoojo
 * @createDate 2018年11月19日 下午10:19:13
 * @file Size.java
 * @package io.github.hooj0.command.typewriter.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public enum Size {

	SMALL("小号"), NORMAL("正常");
	
	private String description;
	
	Size(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}
