# 享元 `Flyweight`

| :sparkles:模式类型:sparkles::sparkles:|:sparkles::sparkles:难度:sparkles:  :sparkles: | :sparkles::sparkles:实用性:sparkles::sparkles: | :sparkles::sparkles:重要程度:sparkles::sparkles: |  :sparkles::sparkles:经典性:sparkles::sparkles: | :sparkles::sparkles:历史性:sparkles: |
| :----------------------------------------: | :-----------------------------------------------: | :-------------------------------------------------: | :----------------------------------------------------: | :--------------------------------------------------: | :--------------------------------------: |
|                  结构型模式                          |                ★★★★ :arrow_down:                 |                  ★★★★★ :arrow_up:                   |                    ★★★★★ :arrow_up:                    |              :green_heart:  :arrow_up:               |        :green_heart:  :arrow_up:         |

## 概念
享元模式(`Flyweight` )：运用**共享技术**有效地支持**大量细粒度**对象的复用。系统只使用**少量的对象**，而这些对象都**很相似，状态变化很小**，可以**实现对象的多次复用**。由于享元模式要求能够共享的对象必须是细粒度对象，因此它又称为**轻量级模式**，它是一种对象结构型模式。简单来说：它用于通过尽可能多地与类似对象**共享来最小化内存**使用或计算开销。

## 用途


## 模式架构



### 参与角色对象



### UML关系图



## 优点与缺点
+ **优点**

+ **缺点**

## 代码实现

### 示例参考
+ [享元模式](./java/io/github/hooj0/flyweight/)

## 应用场景
享元模式的有效性在很大程度上取决于它的使用方式和位置。满足以下所有条件时应用`Flyweight`模式：

+ 应用程序使用**大量对象**
+ 由于物体的**数量庞大，存储成本很高**
+ 大多数对象**状态可以是外在**的
+ 一旦外部状态被移除，许多对象组可**被相对较少的共享对象替换**
+ 应用程序**不依赖于对象标识**。由于可以共享`flyweight`对象，因此对于概念上不同的对象，**身份测试将返回`true`**。


## 应用实例参考

### `JavaSDK` 
+ `java.lang.Integer#valueOf(int)`
+ `java.lang.Boolean#valueOf(boolean)`
+ `java.lang.Byte#valueOf(byte)`
+ `java.lang.Character#valueOf(char)`

### `GoSDK`

### `PythonSDK`

### `JavaScript Libs`



## 总结



## 参考资料





