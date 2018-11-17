# 责任链 `Chain of Responsibility`

| :sparkles:模式类型:sparkles::sparkles:|:sparkles::sparkles:难度:sparkles:  :sparkles: | :sparkles::sparkles:实用性:sparkles::sparkles: | :sparkles::sparkles:重要程度:sparkles::sparkles: |  :sparkles::sparkles:经典性:sparkles::sparkles: | :sparkles::sparkles:历史性:sparkles: |
| :----------------------------------------: | :-----------------------------------------------: | :-------------------------------------------------: | :----------------------------------------------------: | :--------------------------------------------------: | :--------------------------------------: |
|                  行为型模式                          |                ★★★ :arrow_down:                 |                  ★★★★ :arrow_up:                   |                    ★★★★ :arrow_up:                    |              :green_heart:  :arrow_up:               |        :green_heart:  :arrow_up:         |

## 概念

责任链模式(`Chain of Responsibility Pattern`)为**请求创建了一个接收者对象的链**。这种模式给予**请求的类型**，对请求的**发送者和接收者进行解耦**。这种类型的设计模式属于行为型模式。将这些对象**连成一条链**，并**沿着**这条链发送该请求，直到有一个对象处理它为止。

在这种模式中，通常**每个接收者都包含对另一个接收者的引用**。如果一个对象**不能处理该请求**，那么它会把相同的请求**传给下一个接收者**，依此类推。

## 用途
避免请求发送者与接收者耦合在一起，让多个对象都有可能接收请求，将这些对象连接成一条链，并且沿着这条链传递请求，直到有对象处理它为止。

职责链上的处理者负责处理请求，客户只需要将请求发送到职责链上即可，无须关心请求的处理细节和请求的传递，所以职责链将请求的发送者和请求的处理者解耦了。

## 模式架构



### 参与角色对象



### UML关系图



## 优点与缺点



## 代码实现



## 应用场景



## 应用实例参考

### `JavaSDK` 
+ `java.util.logging.Logger#log()`
+ `javax.servlet.Filter#doFilter()`

### `GoSDK`

### `PythonSDK`

### `JavaScript Libs`



## 总结



## 参考资料





