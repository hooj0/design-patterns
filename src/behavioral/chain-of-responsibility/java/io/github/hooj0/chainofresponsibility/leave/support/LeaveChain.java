package io.github.hooj0.chainofresponsibility.leave.support;

/**
 * Request process chain, process flow line
 * 请求流程链条，流程流转线路：jack chen -> json Lee -> Joe hoo
 * 
 * @author hoojo
 * @createDate 2018年11月17日 下午9:20:58
 * @file LeaveChain.java
 * @package io.github.hooj0.chainofresponsibility.leave.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class LeaveChain {

	private ApproveLeaveHandler chain;

	public LeaveChain() {
		buildChain();
	}

	private void buildChain() {
		// jack chen -> json Lee -> Joe hoo
		chain = new SuperiorLeader(EmployeePositionType.SUPERVISOR, "jack chen");
		ApproveLeaveHandler director = new SuperiorLeader(EmployeePositionType.DIRECTOR, "json Lee");
		ApproveLeaveHandler ceo = new SuperiorLeader(EmployeePositionType.CEO, "Joe hoo");
		
		chain.nextSuperior(director).nextSuperior(ceo);
	}

	public void makeLeaveRequest(int day) {
		chain.handleRequest(day);
	}
}
