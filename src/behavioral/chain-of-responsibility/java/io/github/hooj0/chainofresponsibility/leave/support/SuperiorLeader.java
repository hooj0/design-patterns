package io.github.hooj0.chainofresponsibility.leave.support;

/**
 * superior leader role，leave approve workflow handler
 * 上级领导角色
 * @author hoojo
 * @createDate 2018年11月17日 下午9:11:28
 * @file SuperiorLeader.java
 * @package io.github.hooj0.chainofresponsibility.leave.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class SuperiorLeader extends ApproveLeaveHandler {

	private String name;
	
	public SuperiorLeader(EmployeePositionType type, String name) {
		super(type);
		
		this.name = name;
	}

	@Override
	protected String getName() {
		return name;
	}

}
