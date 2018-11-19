package io.github.hooj0.command.typewriter.support;

/**
 * color type enum class 
 * 
 * @author hoojo
 * @createDate 2018年11月19日 下午10:22:53
 * @file Color.java
 * @package io.github.hooj0.command.typewriter.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public enum Color {

	RED("红色"), NORMAL("正常");
	
	private String description;
	
	Color(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}
