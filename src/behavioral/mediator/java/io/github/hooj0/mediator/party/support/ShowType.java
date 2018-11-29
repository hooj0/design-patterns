package io.github.hooj0.mediator.party.support;

/**
 * party show type enum class 派对的节目表演秀种类
 * 
 * @author hoojo
 * @createDate 2018年11月29日 下午10:58:51
 * @file ShowType.java
 * @package io.github.hooj0.mediator.party.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public enum ShowType {
	SHOOT("射击", "Shooting"), 
	GUESS("猜灯谜", "Guess"), 
	DESKTOP_GAME("桌游", "Desktop games"), 
	SING("唱歌", "singing");

	private String name;
	private String description;

	ShowType(String name, String description) {
	    this.name = name;
	    this.description = description;
	  }

	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		return name;
	}
}
