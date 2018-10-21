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
老司机只会开小汽车，但不会开巴士，一天小汽车坏了，老司机不能走着回家，于是他准备开巴士回家。现在他需要利用开汽车的技能去开巴士，这可不是件容易的事情。

### 定义 开汽车的接口
老司机只会开小汽车，这时候需要汽车的接口，和一些开汽车的技能。
```java
public interface Car {
	
	void drive();
}
```

### 定义 司机
一个老司机，他掌握开汽车的技能，那需要实现 Car 接口，实现开汽车的技能
```java
public class Driver implements Car {

	private Car car;
	
	public Driver(Car car) {
		this.car = car;
	}
	
	@Override
	public void drive() {
		this.car.drive();
	}
}
```

### 定义 巴士接口
因为老司机的小汽车坏了，只有巴士能开，那么巴士应该具有开跑的功能
```java
public class Bus {

	public void go() {
		System.out.println("bus go go go……");
	}
}
```

### 定义 适配器
因为老司机的小汽车坏了，只有巴士能开，现在让老司机用开小汽车的姿势去开巴士
```java
public class BusAdapter implements Car {

	private Bus bus;
	
	public BusAdapter() {
		this.bus = new Bus();
	}
	
	@Override
	public void drive() {
		this.bus.go();
	}
}
```

### 老司机发车
```java
public class App {

	public static void main(String[] args) {

		// 老司机终于可以开着巴士回家了
		Driver driver = new Driver(new BusAdapter());
		driver.drive();
	}
}
```