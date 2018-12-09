package io.github.hooj0.observer;

import io.github.hooj0.observer.support.CentralChina;
import io.github.hooj0.observer.support.SouthChina;
import io.github.hooj0.observer.support.Weather;

/**
 * observer pattern application client
 * @author hoojo
 * @createDate 2018年12月8日 上午9:49:33
 * @file App.java
 * @package io.github.hooj0.observer
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class App {

	public static void main(String[] args) {

		Weather weather = new Weather();
		new CentralChina(weather); // constructor register
		weather.registerObserver(new SouthChina());
		
		weather.nextDay();
		weather.nextDay();
		weather.nextDay();
		weather.nextDay();
	}
}
