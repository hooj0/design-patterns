package io.github.hooj0.bridge;

import io.github.hooj0.bridge.support.abstraction.AbstractRemoteControl;
import io.github.hooj0.bridge.support.abstraction.OriginalFactoryRemoteControl;
import io.github.hooj0.bridge.support.abstraction.SuperRemoteControl;
import io.github.hooj0.bridge.support.implementor.HisenseTV;
import io.github.hooj0.bridge.support.implementor.XiaoMiTV;

/**
 * bridge pattern application client class
 * 
 * @author hoojo
 * @createDate 2018年10月21日 下午6:12:33
 * @file App.java
 * @package io.github.hooj0.bridge
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class App {

	public static void main(String[] args) {

		AbstractRemoteControl remoteControl = new SuperRemoteControl(new HisenseTV());
		remoteControl.boot();
		remoteControl.changedChannel();
		remoteControl.changedVolume();
		remoteControl.shutdown();
		
		AbstractRemoteControl remoteControl2 = new OriginalFactoryRemoteControl(new XiaoMiTV());
		remoteControl2.boot();
		remoteControl2.changedChannel();
		remoteControl2.changedVolume();
		remoteControl2.shutdown();
	}
}
