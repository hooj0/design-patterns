# 案例分析
通过两个简单案例，帮助理解和分析适配器模式。

## 案例：发送微信
一个只会使用邮件发送消息的人，需要发送微信。但他只会使用邮件，不会微信。

### 定义 发送邮件的接口
发送者只会发送邮件，先定义发送邮件

```java
public interface EmailMessage {

	void sendEmail();
}
```

### 实现 发送邮件的接口
发送者会发送邮件，那么实现发送邮件的功能
```java
public class EmailMessageSupport implements EmailMessage {

	@Override
	public void sendEmail() {
		System.out.println("发送邮件");
	}
}
```

### 定义 发送微信的接口
由于发送者需要发送微信的技能，那么定义发送微信的接口，定义好发送微信的姿势
```java
public interface WeChatMessage {
	
	void sendMessage();
}
```

### 定义 发送者发送微信的姿势
由于发送者需要发送微信，那么需要实现发送微信的接口，完成发送微信的姿势
```java
public class Sender implements WeChatMessage {

	private WeChatMessage message;
	
	public Sender(WeChatMessage message) {
		this.message = message;
	}
	
	@Override
	public void sendMessage() {
		message.sendMessage();
	}
}
```

### 适配器完成转换
由于发送者只会发送邮件的技能，要实现发送微信的大法，那需要一个适配器让发送邮件的姿势适配成发送微信的姿势。

```java
public class EmailMessageAdapter implements WeChatMessage {

	private EmailMessage emailMessage;

	public EmailMessageAdapter() {
		this.emailMessage = new EmailMessageSupport();
	}

	@Override
	public void sendMessage() {
		emailMessage.sendEmail();
	}
}
```

### 接口调用
```java
public class App {

	public static void main(String[] args) {

		// 终于，发送者利用发送邮件的方式，完成了发送微信消息
		Sender sender = new Sender(new EmailMessageAdapter());
		sender.sendMessage();
	}
}
```