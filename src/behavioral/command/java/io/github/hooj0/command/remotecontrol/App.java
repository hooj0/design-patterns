package io.github.hooj0.command.remotecontrol;

import io.github.hooj0.command.remotecontrol.support.LightReceiver;
import io.github.hooj0.command.remotecontrol.support.OffLightCommand;
import io.github.hooj0.command.remotecontrol.support.OnLightCommand;
import io.github.hooj0.command.remotecontrol.support.RemoteControlInvoker;
import io.github.hooj0.command.remotecontrol.support.RemoteControlInvoker.LightLocation;

/**
 * remote control switch power application client
 * 
 * @author hoojo
 * @createDate 2018年11月18日 下午8:03:45
 * @file App.java
 * @package io.github.hooj0.command.remotecontrol
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class App {

	public static void main(String[] args) {

		// 灯：创建一个接收者
		LightReceiver lightReceiver = new LightReceiver();
		
		// 开灯命令
		OnLightCommand onLightCommand = new OnLightCommand(lightReceiver);
		// 关灯命令
		OffLightCommand offLightCommand = new OffLightCommand(lightReceiver);
		
		// 调用者：遥控器
		RemoteControlInvoker invoker = new RemoteControlInvoker();
		
		invoker.clickOffButton(offLightCommand, LightLocation.DINING_HALL);
		invoker.clickOffButton(offLightCommand, LightLocation.HALL);
		
		invoker.clickOnButton(onLightCommand, LightLocation.GUEST_ROOM);
		invoker.clickOnButton(onLightCommand, LightLocation.HALL);
	}
}
