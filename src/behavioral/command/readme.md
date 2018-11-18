# 命令 `Command`

| :sparkles:模式类型:sparkles::sparkles:|:sparkles::sparkles:难度:sparkles:  :sparkles: | :sparkles::sparkles:实用性:sparkles::sparkles: | :sparkles::sparkles:重要程度:sparkles::sparkles: |  :sparkles::sparkles:经典性:sparkles::sparkles: | :sparkles::sparkles:历史性:sparkles: |
| :----------------------------------------: | :-----------------------------------------------: | :-------------------------------------------------: | :----------------------------------------------------: | :--------------------------------------------------: | :--------------------------------------: |
|                  对象行为型                          |                ★★★ :arrow_down:                 |                  ★★★ :arrow_up:                   |                    ★★★★ :arrow_up:                    |              :green_heart:  :arrow_up:               |        :green_heart:  :arrow_up:         |

## 概念
命令模式(`Command Pattern`)：将一个**请求封装为一个对象**，从而使我们可用**不同的请求**对**客户进行参数化**；对**请求排队**或者**记录请求日志**，以及支持**可撤销**的操作。命令模式是一种**对象行为型模式**，其别名为动作(`Action`)模式或事务(`Transaction`)模式。

## 用途
当**客户端**向某些对象发送请求，但是并**不知道**请求的**接收者**是谁，也**不知道被请求的操作是哪个对象**，只需在程序运行时**指定具体的请求接收者**即可，此时，可以使用命令模式来进行设计，使得请求发送者与请求接收者**消除彼此之间的耦合**，让对象之间的**调用关系更加灵活**。

命令模式可以对**发送者和接收者完全解耦**，发送者与接收者之间**没有直接引用关系**，发送请求的对象只需要知道**如何发送请求**，而不必知道**请求的具体实现细节**。

## 模式架构


### 参与角色对象
+ **`Command` 抽象命令类**：
+ **`ConcreteCommand` 具体命类**：
+ **`Invoker` 调用者**：
+ **`Receiver` 接收者**：

### UML关系图


## 优点与缺点
+ **优点**
	- **低耦合**：降低系统的耦合度。
	- **灵活、扩展方便**：新的命令可以很容易地加入到系统中。
	- **简单**：可以比较容易地设计一个命令队列和宏命令（组合命令）。
	- 可以方便地实现对请求的`Undo`和`Redo`。

+ **缺点**
	- 使用命令模式可能会导致某些系统有过多的具体命令类。因为针对每一个命令都需要设计一个具体命令类，因此某些系统可能需要大量具体命令类，这将影响命令模式的使用。
	
## 代码实现

### 示例参考
+ [命令模式](./java/io/github/hooj0/command/)

## 应用场景


保持请求的历史
实现回调功能
实现撤消功能


## 应用实例参考

### `JavaSDK` 
- [`java.lang.Runnable`](http://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)
- [`Netflix Hystrix`](https://github.com/Netflix/Hystrix/wiki)
- [`javax.swing.Action`](http://docs.oracle.com/javase/8/docs/api/javax/swing/Action.html)

### `GoSDK`

### `PythonSDK`

### `JavaScript Libs`



## 总结



## 参考资料





