package io.github.hooj0.chainofresponsibility.leave.support;

/**
 * realization of core circulation business of batch responsibility chain.
 * 批假职责链核心流转业务实现
 * @author hoojo
 * @createDate 2018年11月17日 下午8:42:56
 * @file ApproveLeaveHandler.java
 * @package io.github.hooj0.chainofresponsibility.leave.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public abstract class ApproveLeaveHandler {

	// 请求流程的上级领导
	protected ApproveLeaveHandler superior;
	protected EmployeePositionType type;
	
	public ApproveLeaveHandler(EmployeePositionType type) {
		this.type = type;
	}
	
	// 设定下一个链条
	public ApproveLeaveHandler nextSuperior(ApproveLeaveHandler superior) {
		this.superior = superior;
		return superior;
	}
	
	// 批假核心流程
	public void handleRequest(int leaveDayCount) {
		
		if (isHandle(leaveDayCount)) {
			this.markHandled(leaveDayCount);
		} else {
			if (this.superior != null) {
				this.markHandled(leaveDayCount);
				this.superior.handleRequest(leaveDayCount);
			} else {
				throw new IllegalArgumentException("leave day is too long!");
			}
		}
	}
	
	// 批准假期
	private void markHandled(int leaveDayCount) {
		System.out.println(String.format("%s - [%s] approve your leave '%s' day.", this.getName(), type.getPosition(), leaveDayCount));
	}
	
	// 是否需要更高级别领导批假
	private boolean isHandle(int leaveDayCount) {
		if (type == null) {
			throw new IllegalArgumentException("Employee Position Type is not null.");
		}
		
		if (type.getPower() >= leaveDayCount) {
			return true;
		}
		
		return false;
	}
	
	protected abstract String getName();
}
