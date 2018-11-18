package io.github.hooj0.command.remotecontrol.support;

/**
 * Light-off command implementation class
 * 关灯命令具体实现类
 * 
 * @author hoojo
 * @createDate 2018年11月18日 下午8:15:18
 * @file OffLightCommand.java
 * @package io.github.hooj0.command.remotecontrol.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class OffLightCommand implements SwitchPowerCommand {

	private LightReceiver receiver;
	
	public OffLightCommand(LightReceiver receiver) {
		this.receiver = receiver;
	}
	
	@Override
	public void execute() {
		this.receiver.off();
	}
}
