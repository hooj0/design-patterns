# 观察者 `Observer`

| :sparkles:模式类型:sparkles::sparkles:|:sparkles::sparkles:难度:sparkles:  :sparkles: | :sparkles::sparkles:实用性:sparkles::sparkles: | :sparkles::sparkles:重要程度:sparkles::sparkles: |  :sparkles::sparkles:经典性:sparkles::sparkles: | :sparkles::sparkles:历史性:sparkles: |
| :----------------------------------------: | :-----------------------------------------------: | :-------------------------------------------------: | :----------------------------------------------------: | :--------------------------------------------------: | :--------------------------------------: |
|                  行为型模式                          |                ★★★★★ :arrow_down:                 |                  ★★★★★ :arrow_up:                   |                    ★★★★★ :arrow_up:                    |              :green_heart:  :arrow_up:               |        :green_heart:  :arrow_up:         |

## 概念
观察者模式(`Observer Pattern`)：定义对象间的**一种一对多**依赖关系，使得每当一个对象**状态发生改变**时，其**相关依赖对象皆得到通知并被自动更新**。观察者模式又叫做**发布-订阅**（`Publish/Subscribe`）模式、**模型-视图**（`Model/View`）模式、**源-监听器**（`Source/Listener`）模式或**从属者**（`Dependents`）模式。观察者模式是一种对象**行为型模式**。

## 用途
建立一种对象与对象之间的依赖关系，一个对象发生改变时将自动通知其他对象，其他对象将相应做出反应。在此，发生改变的对象称为观察目标，而被通知的对象称为观察者，一个观察目标可以对应多个观察者，而且这些观察者之间没有相互联系，可以根据需要增加和删除观察者，使得系统更易于扩展，这就是观察者模式的模式动机。

## 模式架构



### 参与角色对象
+ **`Subject`: 目标**，
+ **`ConcreteSubject`: 具体目标**，
+ **`Observer`: 观察者**，
+ **`ConcreteObserver`: 具体观察者**，


### UML关系图



## 优点与缺点
+ **优点**

+ **缺点**


## 代码实现
观察者模式的实现要点如下：
+

### 示例参考
+ [观察者模式](./java/io/github/hooj0/observer)

## 应用场景
观察者模式适用于：
+

## 应用实例参考

### `JavaSDK` 

### `GoSDK`

### `PythonSDK`

### `JavaScript Libs`


## 总结