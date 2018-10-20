package io.github.hooj0.adapter.support.drivingcar;

/**
 * bus adapter class support car, implements drive method.
 * 现在汽车坏了，只有bus能跑，老司机要想继续开车回家，必须让老司机用 “开小汽车”的技能去开“bus”
 * 
 * @author hoojo
 * @createDate 2018年10月20日 下午12:21:48
 * @file BusAdapter.java
 * @package io.github.hooj0.adapter.support.drivingcar
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class BusAdapter implements Car {

	private Bus bus;
	
	public BusAdapter() {
		this.bus = new Bus();
	}
	
	@Override
	public void drive() {
		this.bus.go();
	}
}
