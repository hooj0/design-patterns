package io.github.hooj0.command.remotecontrol.support;

/**
 * command receiver, complete specific business logic
 * 命令接收者，完成具体业务逻辑
 * 
 * @author hoojo
 * @createDate 2018年11月18日 下午8:08:13
 * @file LightReceiver.java
 * @package io.github.hooj0.command.remotecontrol.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class LightReceiver {

	public void off() {
		System.out.println("Turn off the light...");
	}

	public void on() {
		System.out.println("Turn on the light...");
	}
}
