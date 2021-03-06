package io.github.hooj0.bridge.support.abstraction;

import io.github.hooj0.bridge.support.implementor.AbstractTV;

/**
 * super remote control class defined
 * 超级万能遥控器抽象接口实现
 * 
 * @author hoojo
 * @createDate 2018年10月25日 下午9:52:31
 * @file SuperRemoteControl.java
 * @package io.github.hooj0.bridge.support.abstraction
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class SuperRemoteControl extends AbstractRemoteControl {

	public SuperRemoteControl(AbstractTV tv) {
		super(tv);
	}

	@Override
	public void boot() {
		System.out.println("super remote control boot tv.");

		tv.open();
	}

	@Override
	public void shutdown() {
		System.out.println("super remote control shutdown tv.");
		
		tv.close();
	}

	@Override
	public void changedChannel() {
		System.out.println("super remote control change channel.");
		
		tv.adjustShow();
	}

	@Override
	public void changedVolume() {
		System.out.println("super remote control change volume.");

		tv.adjustVolume();
	}
}
