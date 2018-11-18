package io.github.hooj0.command.remotecontrol.support;

/**
 * Light-on command implementation class
 * 开灯命令实现类
 * 
 * @author hoojo
 * @createDate 2018年11月18日 下午8:12:41
 * @file OnLightCommand.java
 * @package io.github.hooj0.command.remotecontrol.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class OnLightCommand implements SwitchPowerCommand {

	private LightReceiver receiver;
	
	public OnLightCommand(LightReceiver receiver) {
		this.receiver = receiver;
	}
	
	@Override
	public void execute() {
		this.receiver.on();
	}
}
