package io.github.hooj0.observer.support;

/**
 * observer subject target class
 * 观察者目标对象
 * @author hoojo
 * @createDate 2018年12月10日 下午9:12:51
 * @file Subject.java
 * @package io.github.hooj0.observer.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public interface Subject {

	public void registerObserver(WeatherObserver observer);

    public void removeObserver(WeatherObserver observer);

    public void notifyObserver();
}
