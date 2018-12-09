package io.github.hooj0.observer.support;

import java.util.ArrayList;
import java.util.List;

/**
 * observer subject target weather data
 * 观察者天气情况数据
 * 
 * @author hoojo
 * @createDate 2018年12月10日 下午9:17:30
 * @file Weather.java
 * @package io.github.hooj0.observer.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class Weather implements Subject {

	private WeatherType type;
	private List<WeatherObserver> observers;
	
	public Weather() {
		observers = new ArrayList<>();
		type = WeatherType.SUNNY;
	}
	
	public void nextDay() {
		WeatherType[] types = WeatherType.values();
		type = types[(type.ordinal() + 1) % types.length];
		
		notifyObserver();
	}
	
	@Override
	public void registerObserver(WeatherObserver observer) {
		this.observers.add(observer);
	}

	@Override
	public void removeObserver(WeatherObserver observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObserver() {
		for (WeatherObserver observer : observers) {
			observer.update(type);
		}
	}
}
