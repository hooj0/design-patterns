package io.github.hooj0.observer.support;

/**
 * weather observer interface class
 * 天气情况观察者对象
 * 
 * @author hoojo
 * @createDate 2018年12月10日 下午9:07:48
 * @file WeatherObserver.java
 * @package io.github.hooj0.observer.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public interface WeatherObserver {

	void update(WeatherType currentWeather);
	
	@Override
	String toString();
}
