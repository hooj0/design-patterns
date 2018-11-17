package io.github.hooj0.chainofresponsibility.leave.support;

/**
 * employee position type, defined employee that power
 * @author hoojo
 * @createDate 2018年11月17日 下午8:27:31
 * @file EmployeePositionType.java
 * @package io.github.hooj0.chainofresponsibility.leave.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public enum EmployeePositionType {

	SUPERVISOR(2, "主管"), DIRECTOR(5, "总监"), CEO(10, "CEO");
	
	private int power;
	private String position;
	
	EmployeePositionType(int power, String position) {
		this.position = position;
		this.power = power;
	}
	
	public int getPower() {
		return power;
	}

	public String getPosition() {
		return position;
	}
}
