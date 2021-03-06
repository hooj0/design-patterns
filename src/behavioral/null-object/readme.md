# 空对象 `Null Object`

| :sparkles:模式类型:sparkles::sparkles:|:sparkles::sparkles:难度:sparkles:  :sparkles: | :sparkles::sparkles:实用性:sparkles::sparkles: | :sparkles::sparkles:重要程度:sparkles::sparkles: |  :sparkles::sparkles:经典性:sparkles::sparkles: | :sparkles::sparkles:历史性:sparkles: |
| :----------------------------------------: | :-----------------------------------------------: | :-------------------------------------------------: | :----------------------------------------------------: | :--------------------------------------------------: | :--------------------------------------: |
|                 行为型模式                           |                ★★ :arrow_down:                 |                  ★★★ :arrow_up:                   |                    ★★★ :arrow_up:                    |              :green_heart:  :arrow_up:               |        :green_heart:  :arrow_up:         |

## 概念
在空对象模式(`Null Object Pattern`)中，一个空对象取代 `NULL` 对象实例的检查。`Null` 对象不是检查空值，而是反应一个**不做任何动作**的关系。这样的 `Null` 对象也可以在**数据不可用**的时候提供**默认**的行为。
在空对象模式中，我们创建一个指定各种要**执行的操作的抽象类和扩展该类**的实体类，还创建一个**未对该类做任何实现的空对象类**，该空对象类将无缝地使用在需要检查空值的地方。

## 用途
在大多数面向对象语言中，如`Java`或`C`语言，引用可能是`null`。在调用任何方法之前，需要**检查这些引用以确保它们不是空的**，因为通常不能对空引用调用方法。
不是使用空引用来表示缺少对象（例如，不存在的客户），而是使用实现预期接口但**方法体为空**的对象。与工作默认实现相比，这种方法的优势在于空对象是**非常可预测**的，并且没有副作用：**它什么也不做**。

## 模式架构
使用一个对象实现目标对象的接口或抽象类中的方法，但实现类中的方法是空实现，什么也不做。


### 参与角色对象

+ **`Subject`: 目标**，具有**具体的业务接口方法和抽象方法的**对象，这些方法定义具体的操作。
+ **`NullObject`: 空对象实现**，**实现具体目标对象接口中的方法**，但这些方法**不做任何业务操作**。

### UML关系图

![1564199431050](../../../.images/1564199431050.png)


## 优点与缺点
+ **优点**
	- 避免显式的空检查
	- 保持算法优雅且易于阅读
+ **缺点**
	- 多维护一份代码

## 代码实现
空对象模式的实现要点如下：
+ 定义 `Subject` 目标接口，声明**空对象模式**的接口方法。
+ 实现 `Subject` 目标接口中的所有方法，在方法中不做任何事。

### 示例参考
+ [空对象模式](./java/io/github/hooj0/nullobject/)

## 应用场景
空对象模式适用于：
+ 希望避免显式的空检查，并保持算法的优雅和易于阅读。
+ 显示的返回接口的空实现，避免空指针异常或空值检查。

## 应用实例参考

### `JavaSDK` 
+ `java.util.Collections#emptyList()`
+ `java.util.Collections#emptyMap()`
+ `java.util.Collections#emptySet()`
	
### `GoSDK`

### `PythonSDK`

### `JavaScript Libs`


## 总结
+ 一个空对象取代 `NULL` 对象实例的检查，创建一个**未对该类做任何实现的空对象类**，该空对象类将无缝地使用在需要检查空值的地方。
+ 使用一个对象实现目标对象的接口或抽象类中的方法，但实现类中的方法是空实现，什么也不做。
+ 空对象模式的优点：避免显示的检查空值，引发空指针异常；缺点是代码重复冗余，降低可维护性。
+ 空对象模式适用于任何需要返回空值或传递空值、检查空值的地方。