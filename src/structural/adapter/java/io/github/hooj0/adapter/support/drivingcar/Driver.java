package io.github.hooj0.adapter.support.drivingcar;

/**
 * Driver class support car，implement drive method
 * 老司机实现汽车接口，他拥有驾驶汽车的技能，如果希望汽车能够跑起来，只要老司机有汽车就行
 * 
 * @author hoojo
 * @createDate 2018年10月20日 下午12:18:18
 * @file Driver.java
 * @package io.github.hooj0.adapter.support.drivingcar
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class Driver implements Car {

	private Car car;
	
	public Driver(Car car) {
		this.car = car;
	}
	
	@Override
	public void drive() {
		this.car.drive();
	}
}
