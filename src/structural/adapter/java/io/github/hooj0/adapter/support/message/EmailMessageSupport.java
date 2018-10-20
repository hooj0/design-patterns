package io.github.hooj0.adapter.support.message;

/**
 * email message interface, defined send email method function.
 * 邮件发送接口定义
 * @author hoojo
 * @createDate 2018年10月28日 上午10:53:53
 * @file EmailMessageSupport.java
 * @package io.github.hooj0.adapter.support.message
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class EmailMessageSupport implements EmailMessage {

	@Override
	public void sendEmail() {
		System.out.println("发送邮件");
	}
}
