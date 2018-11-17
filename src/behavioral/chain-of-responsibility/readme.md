# 责任链 `Chain of Responsibility`

| :sparkles:模式类型:sparkles::sparkles:|:sparkles::sparkles:难度:sparkles:  :sparkles: | :sparkles::sparkles:实用性:sparkles::sparkles: | :sparkles::sparkles:重要程度:sparkles::sparkles: |  :sparkles::sparkles:经典性:sparkles::sparkles: | :sparkles::sparkles:历史性:sparkles: |
| :----------------------------------------: | :-----------------------------------------------: | :-------------------------------------------------: | :----------------------------------------------------: | :--------------------------------------------------: | :--------------------------------------: |
|                  行为型模式                          |                ★★★ :arrow_down:                 |                  ★★★★ :arrow_up:                   |                    ★★★★ :arrow_up:                    |              :green_heart:  :arrow_up:               |        :green_heart:  :arrow_up:         |

## 概念
责任链模式(`Chain of Responsibility Pattern`)为**请求创建了一个接收者对象的链**。这种模式给予**请求的类型**，对请求的**发送者和接收者进行解耦**。这种类型的设计模式属于行为型模式。将这些对象**连成一条链**，并**沿着**这条链发送该请求，直到有一个对象处理它为止。

在这种模式中，通常**每个接收者都包含对另一个接收者的引用**。如果一个对象**不能处理该请求**，那么它会把相同的请求**传给下一个接收者**，依此类推。

## 用途
**避免请求**发送者与接收者**耦合**在一起，让多个对象都有可能接收请求，将这些对象**连接成一条链**，并且**沿着**这条链传递请求，**直到有对象处理它为止**。

**职责链**上的处理者负责处理请求，**客户只需要将请求发送到职责链上**即可，无须关心请求的**处理细节和请求的传递**，所以职责链将请求的发送者和请求的处理者**解耦**了。

## 模式架构
**职责链**上的请求可以是一条链，可以是**一个树**，还可以是**一个环**，模式本身不约束这个，需要我们自己去实现。同时在一个时刻，命令只允许由一个对象传给另一个对象，而**不允许传给多个对象**。


### 参与角色对象



### UML关系图



## 优点与缺点
+ **优点**
	- **降低耦合度**：它将请求的发送者和接收者**解耦**。
	- **简化了对象**：使得对象**不需要知道链的结构**。 
	- **极好的灵活性**：增强给对象指派职责的灵活性。通过改变链内的成员或者调动它们的**次序**，允许动态地**新增或删除责任**。
	- **使用方便**：增加新的请求处理类很方便。

+ **缺点**
	- 不能保证请求**一定被接收**。 
	- 系统**性能将受到一定影响**，而且在进行代码调试时不太方便，可能会造成循环调用。 
	- 可能不容易观察运行时的特征，**有碍于除错**。

## 代码实现
责任链模式的实现要点如下：

### 示例参考
+ [责任链模式](./java/io/github/hooj0/chain-of-responsibility/)

## 应用场景
责任链模式适用于：
+ **多个对象可以处理请求**，具体哪个对象处理该请求由运行时刻自动确定。 
+ 在**不明确**指定**接收者**的情况下，向多个对象中的一个提交一个请求。
+ 可动态指定一组对象处理请求。

## 应用实例参考

### `JavaSDK` 
+ [`java.util.logging.Logger#log()`](http://docs.oracle.com/javase/8/docs/api/java/util/logging/Logger.html#log%28java.util.logging.Level,%20java.lang.String%29)
+ [`javax.servlet.Filter#doFilter()`](http://docs.oracle.com/javaee/7/api/javax/servlet/Filter.html#doFilter-javax.servlet.ServletRequest-javax.servlet.ServletResponse-javax.servlet.FilterChain-)
+ [`Apache Commons Chain`](https://commons.apache.org/proper/commons-chain/index.html)

### `GoSDK`

### `PythonSDK`

### `JavaScript Libs`



## 总结



## 参考资料





