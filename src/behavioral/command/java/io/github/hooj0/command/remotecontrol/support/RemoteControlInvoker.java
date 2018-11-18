package io.github.hooj0.command.remotecontrol.support;

/**
 * Invoker - Switching Power Remote
 * 调用者 - 开关电源遥控器
 * @author hoojo
 * @createDate 2018年11月18日 下午8:16:53
 * @file RemoteControlInvoker.java
 * @package io.github.hooj0.command.remotecontrol.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class RemoteControlInvoker {

	private SwitchPowerCommand[] onCommands;
	private SwitchPowerCommand[] offCommands;
	
	public RemoteControlInvoker() {
		this.onCommands = new SwitchPowerCommand[LightLocation.values().length];
		this.offCommands = new SwitchPowerCommand[LightLocation.values().length];
	}
	
	public void clickOnButton(OnLightCommand command, LightLocation location) {
		if (this.onCommands[location.index] == null) {
			this.onCommands[location.index] = command;
		}
		
		System.out.print(location + "-" + location.getDescription() + ", ");
		this.onCommands[location.index].execute();
	}
	
	public void clickOffButton(OffLightCommand command, LightLocation location) {
		if (this.offCommands[location.index] == null) {
			this.offCommands[location.index] = command;
		}
		
		System.out.print(location + "-" + location.getDescription() + ", ");
		this.offCommands[location.index].execute();
	}
	
	public static enum LightLocation {
		HALL(0, "大厅"), KITCHEN(1, "厨房"), DINING_HALL(2, "餐厅"), 
		MASTER_BEDROOM(3, "主卧"), GUEST_ROOM(4, "客房"), STUDY_ROOM(5, "书房"), 
		BATHROOM(6, "卫生间");
		
		private int index;
		private String description;
		
		LightLocation(int index, String description) {
			this.index = index;
			this.description = description;
		}
		
		public int getIndex() {
			return index;
		}

		public String getDescription() {
			return description;
		}
	}
}
