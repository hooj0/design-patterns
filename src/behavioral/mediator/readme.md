# 中介者 `Mediator`

| :sparkles:模式类型:sparkles::sparkles:|:sparkles::sparkles:难度:sparkles:  :sparkles: | :sparkles::sparkles:实用性:sparkles::sparkles: | :sparkles::sparkles:重要程度:sparkles::sparkles: |  :sparkles::sparkles:经典性:sparkles::sparkles: | :sparkles::sparkles:历史性:sparkles: |
| :----------------------------------------: | :-----------------------------------------------: | :-------------------------------------------------: | :----------------------------------------------------: | :--------------------------------------------------: | :--------------------------------------: |
|                  行为型模式                          |                ★★★★★ :arrow_down:                 |                  ★★★★★ :arrow_up:                   |                    ★★★★★ :arrow_up:                    |              :green_heart:  :arrow_up:               |        :green_heart:  :arrow_up:         |

## 概念
中介者模式(`Mediator Pattern`)是指**用一个中介对象来封装一系列的对象交互**，中介者使各对象**不需要显式地相互引用**，从而使其**耦合松散**，而且可以**独立**地改变它们之间的交互。中介者模式又称为**调停者模式**，它是一种对象**行为型模式**。

中介者模式名字跟出国留学中介和房产中介是类似的。拿房产中介来说，现在房子买家和房子卖家非常多，如果任由房子买家和房子卖家自由交易，则会导致不同的买家和卖家之间有很多交互，一个买家会和多个卖家进行交涉，同样的一个卖家也会和多个买家进行交涉。如果在买房的过程中出现纠纷问题，则很难进行解决。

## 用途
用一个中介对象来**封装一系列的对象交互**，中介者使各对象不需要显式地相互引用，从而使其耦合松散，而且可以**独立地改变它们之间的交互**。主要解决**对象与对象**之间存在**大量的关联**关系，这样势必会导致系统的**结构变得很复杂**，同时若一个对象发生改变，我们也需要**跟踪与之相关联的对象**，同时做出相应的处理。

当**多个类相互耦合**，形成了**网状结构**。此时可以采用中介者模式解决网状结构**分离为星型结构**。

## 模式架构
中介者模式将错综复杂的交错交互方式，调整为星状的交互方式，所有交互节点都通过中介者进行通信，由中介者进行转换通信动作，已达到各交互节点的相互调用。

### 参与角色对象
+ **`Mediator`：抽象中介者**，定义了同事对象到中介者对象的接口，用于联通哥哥同事对象进行相互通信衔接。
+ **`ConcreteMediator`：具体中介者**，它从具体的同事对象接收消息，向具体同事发出命令。
+ **`Colleague`：抽象同事类**，定义了中介者对象接口，它只知道中介者而不知道其他同事对象。
+ **`ConcreteColleague`：具体同事类**，每个具体同事类都知道自己在小范围内的行为，而不知道它在大范围内的目的。


### UML关系图



## 优点与缺点
+ **优点**
	- 简化了对象之间的交互，降低了类的复杂度，将一对多转化成了一对一。
	- 各个类之间的解耦。
	- 减少子类生成。
	- 可以简化各同事类的设计和实现。
	- 符合迪米特原则。

+ **缺点**
	+ 在具体中介者类中包含了同事之间的**交互细节**，可能会导致具体中介者类**非常复杂**，使得**系统难以维护**。

## 代码实现
中介者模式的实现要点如下：
+ 创建 `Mediator` 抽象中介者对象，完成抽象的接口定义，接口方法需要接受`Colleague`对象，通过使用`Colleague`完成最终的业务方法执行。
+ 创建 `ConcreteMediator`具体中介者，接收到 `ConcreteColleague` 具体同事类，利用具体同事类发出调用命令执行业务方法。
+ 创建 `Colleague` 抽象同事类，定义同事类需要完成的业务方法，接收 `Mediator` 抽象中介者对象，通过将**自己**传递`Mediator` 完成给具体的业务方法调用。
+ 创建 `ConcreteColleague` 具体同事类，完成 `Colleague` 抽象同事类的方法，调用接口业务方法的调用。

### 示例参考
+ [中介者模式](./java/io/github/hooj0/mediator)

## 应用场景
中介者模式适用于：
+ 一组对象以明确但**复杂的方式进行通信**。由此产生的相互依赖性是**非结构化**的，**难以理解**。
+ **重用对象很困难**，因为它引用并与许多其他对象通信。
+ 在几个类之间分配的行为应该是**可自定义**的，而不需要很多子类。
+ 系统中对象之间存在**比较复杂的引用**关系，导致它们之间的**依赖关系结构混乱**而且难以复用该对象。
+ 想通过一个**中间类来封装多个类**中的行为，而又**不想生成太多的子类**。

## 应用实例参考

### `JavaSDK` 
- All scheduleXXX() methods of [java.util.Timer](http://docs.oracle.com/javase/8/docs/api/java/util/Timer.html)
- [java.util.concurrent.Executor#execute()](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Executor.html#execute-java.lang.Runnable-)
- submit() and invokeXXX() methods of [java.util.concurrent.ExecutorService](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ExecutorService.html)
- scheduleXXX() methods of [java.util.concurrent.ScheduledExecutorService](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ScheduledExecutorService.html)
- [java.lang.reflect.Method#invoke()](http://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Method.html#invoke-java.lang.Object-java.lang.Object...-)

### `GoSDK`

### `PythonSDK`

### `JavaScript Libs`


## 总结