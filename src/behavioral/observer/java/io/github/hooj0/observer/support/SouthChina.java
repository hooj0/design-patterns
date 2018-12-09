package io.github.hooj0.observer.support;

/**
 * souch chain observer weather 
 * 华南天气观察者
 * 
 * @author hoojo
 * @createDate 2018年12月10日 下午10:21:14
 * @file SouthChina.java
 * @package io.github.hooj0.observer.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class SouthChina implements WeatherObserver {

	@Override
	public void update(WeatherType currentWeather) {
		switch (currentWeather) {
			case SUNNY:
				System.out.println(this + "天气 " + WeatherType.SUNNY.getDescription());
				break;
			case RAINY:
				System.out.println(this + "天气 " + WeatherType.RAINY.getDescription());
				break;
			case COLD:
				System.out.println(this + "天气 " + WeatherType.COLD.getDescription());
				break;
			case WINDY:
				System.out.println(this + "天气 " + WeatherType.WINDY.getDescription());
				break;
			default:
				break;
		}
	}
	
	@Override
	public String toString() {
		return "华南";
	}
}
