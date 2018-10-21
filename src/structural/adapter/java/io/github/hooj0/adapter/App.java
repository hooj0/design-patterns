package io.github.hooj0.adapter;

import io.github.hooj0.adapter.support.drivingcar.BusAdapter;
import io.github.hooj0.adapter.support.drivingcar.Car;
import io.github.hooj0.adapter.support.drivingcar.Driver;
import io.github.hooj0.adapter.support.message.EmailMessageAdapter;
import io.github.hooj0.adapter.support.message.Sender;

/**
 * adapter pattern application client class
 * 
 * @author hoojo
 * @createDate 2018年10月18日 上午11:17:17
 * @file App.java
 * @package io.github.hooj0.adapter
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class App {

	public static void main(String[] args) {

		// 终于，发送者利用发送邮件的方式，完成了发送微信消息
		Sender sender = new Sender(new EmailMessageAdapter());
		sender.sendMessage();
		
		// 老司机终于可以开着巴士回家了
		Car driver = new Driver(new BusAdapter());
		driver.drive();
	}
}
