package io.github.hooj0.chainofresponsibility.leave;

import io.github.hooj0.chainofresponsibility.leave.support.LeaveChain;

/**
 * staff leave chain application client 
 * @author hoojo
 * @createDate 2018年11月17日 下午8:23:09
 * @file App.java
 * @package io.github.hooj0.chainofresponsibility.leave
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class App {

	public static void main(String[] args) {
	
		LeaveChain chain = new LeaveChain();
		chain.makeLeaveRequest(1);
		chain.makeLeaveRequest(3);
		chain.makeLeaveRequest(6);

		chain.makeLeaveRequest(60); // exception
		
		/*
		 	jack chen - [主管] approve your leave '1' day.
		 	
			jack chen - [主管] approve your leave '3' day.
			json Lee - [总监] approve your leave '3' day.
			
			jack chen - [主管] approve your leave '6' day.
			json Lee - [总监] approve your leave '6' day.
			Joe hoo - [CEO] approve your leave '6' day.
		 */
	}
}
