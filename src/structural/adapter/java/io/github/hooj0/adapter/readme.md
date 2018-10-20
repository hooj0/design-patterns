# 案例分析
通过两个简单案例，帮助理解和分析适配器模式。

## 案例：发送微信
一个只会使用微信发送消息聊天的人，一天他的手机坏了，现在有一台电脑，他需要发送消息只能使用邮件，但他不知道怎么发送邮件。

### 定义 发送邮件的接口
先定义发送邮件接口，实现发送邮件的正确姿势。

```java
public interface EmailMessage {

	void sendEmail();
}
```

### 实现 发送邮件的接口
由于手机坏了，只能使用电脑发送邮件，那么实现发送邮件的功能。

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
发送者已经拥有发送微信技能，那么需要实现发送微信的接口，现在他需要一个微信就能发送微信消息了。
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
由于发送者只会发送微信的技能，现在微信的手机坏了，只有电脑的发送邮件的方法。要让发送者用发送微信的技能姿势去发送邮件，那需要一个适配器让发送邮件的姿势适配成发送微信的姿势。

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

## 案例：老司机开车
老司机只会开小汽车，但不会开巴士，一天小汽车坏了，老司机不能走着回家，于是他准备开巴士回家。现在他需要