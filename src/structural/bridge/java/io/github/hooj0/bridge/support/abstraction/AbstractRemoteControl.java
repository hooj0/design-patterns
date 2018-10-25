package io.github.hooj0.bridge.support.abstraction;

import io.github.hooj0.bridge.support.implementor.AbstractTV;

/**
 * abstract remote control class defined
 * 遥控器抽象接口定义
 * 
 * @author hoojo
 * @createDate 2018年10月25日 下午9:40:10
 * @file AbstractRemoteControl.java
 * @package io.github.hooj0.bridge.support.abstraction
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public abstract class AbstractRemoteControl {

	protected AbstractTV tv;

	public AbstractRemoteControl(AbstractTV tv) {
		this.tv = tv;
	}
	
	public abstract void boot();
	
	public abstract void shutdown();

	public abstract void changedChannel();

	public abstract void changedVolume();
}
