package io.github.hooj0.observer.support;

/**
 * weather type enum 天气情况枚举
 * 
 * @author hoojo
 * @createDate 2018年12月10日 下午9:02:41
 * @file WeatherType.java
 * @package io.github.hooj0.observer.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public enum WeatherType {
	SUNNY("晴天"), RAINY("雨天"), WINDY("有风"), COLD("寒冷");

	private String description;

	WeatherType(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		return this.name().toLowerCase();
	}
}
