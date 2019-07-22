# 空对象 `Null Object`

| :sparkles:模式类型:sparkles::sparkles:|:sparkles::sparkles:难度:sparkles:  :sparkles: | :sparkles::sparkles:实用性:sparkles::sparkles: | :sparkles::sparkles:重要程度:sparkles::sparkles: |  :sparkles::sparkles:经典性:sparkles::sparkles: | :sparkles::sparkles:历史性:sparkles: |
| :----------------------------------------: | :-----------------------------------------------: | :-------------------------------------------------: | :----------------------------------------------------: | :--------------------------------------------------: | :--------------------------------------: |
|                 行为型模式                           |                ★★ :arrow_down:                 |                  ★★★ :arrow_up:                   |                    ★★★ :arrow_up:                    |              :green_heart:  :arrow_up:               |        :green_heart:  :arrow_up:         |

## 概念
在空对象模式(`Null Object Pattern`)中，一个空对象取代 `NULL` 对象实例的检查。`Null` 对象不是检查空值，而是反应一个**不做任何动作**的关系。这样的 `Null` 对象也可以在**数据不可用**的时候提供**默认**的行为。
在空对象模式中，我们创建一个指定各种要**执行的操作的抽象类和扩展该类**的实体类，还创建一个**未对该类做任何实现的空对象类**，该空对象类将无缝地使用在需要检查空值的地方

## 用途
在大多数面向对象语言中，如`Java`或`C`语言，引用可能是`null`。在调用任何方法之前，需要**检查这些引用以确保它们不是空的**，因为通常不能对空引用调用方法。
不是使用空引用来表示缺少对象（例如，不存在的客户），而是使用实现预期接口但**方法体为空**的对象。与工作默认实现相比，这种方法的优势在于空对象是**非常可预测**的，并且没有副作用：**它什么也不做**。

## 模式架构



### 参与角色对象



### UML关系图



## 优点与缺点
+ **优点**

+ **缺点**


## 代码实现
空对象模式的实现要点如下：
+

### 示例参考
+ [模式](./java/io/github/hooj0/null-object)

## 应用场景
空对象模式适用于：
+

## 应用实例参考

### `JavaSDK` 
+ `java.util.Collections#emptyList()`
+ `java.util.Collections#emptyMap()`
+ `java.util.Collections#emptySet()`
	
### `GoSDK`

### `PythonSDK`

### `JavaScript Libs`


## 总结