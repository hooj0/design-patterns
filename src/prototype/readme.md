# 原型 `Prototype`

| :sparkles:模式类型:sparkles::sparkles:|:sparkles::sparkles:难度:sparkles:  :sparkles: | :sparkles::sparkles:实用性:sparkles::sparkles: | :sparkles::sparkles:重要程度:sparkles::sparkles: |  :sparkles::sparkles:经典性:sparkles::sparkles: | :sparkles::sparkles:历史性:sparkles: |
| :----------------------------------------: | :-----------------------------------------------: | :-------------------------------------------------: | :----------------------------------------------------: | :--------------------------------------------------: | :--------------------------------------: |
|                创造型模式                            |                ★ :arrow_down:                 |                  ★★★ :arrow_up:                   |                    ★★★★★ :arrow_up:                    |              :green_heart:  :arrow_up:               |        :green_heart:  :arrow_up:         |

## 概念
原型模式（Prototype Pattern）是用于创建重复的对象，同时又能保证性能。原型模式虽然是创建型的模式，但是与工厂模式没有关系，从名字即可看出，该模式的思想就是将一个对象作为原型，对其进行复制、克隆，产生一个和原对象类似的新对象。使得类的实例能够生成自身的拷贝。如果创建一个对象的实例非常复杂且耗时时，就可以使用这种模式，而不重新创建一个新的实例，你可以拷贝一个对象并在原始对象副本数据的基础上修改它。

## 用途
使用原型实例指定要创建的对象类型，并通过复制此原型来创建新对象。这种模式是实现了一个原型接口，该接口用于创建当前对象的克隆。它允许您创建现有对象的副本并根据需要进行修改，而不是从头开始创建对象并进行设置。当直接创建对象的代价比较大时，则采用这种模式。例如，一个对象需要在一个高代价的数据库操作之后被创建。我们可以缓存该对象，在下一个请求时返回它的克隆，在需要的时候更新数据库，以此来减少数据库调用。

## 模式架构



### 参与角色对象
+ **Product**：具体产品，需要实现 `Cloneable` 接口，并并覆盖 `clone` 方法。在 `clone` 方法中返回对象实例，提供需要的数据。

### UML关系图



## 优点与缺点
+ **优点**
	- 直接创建对象的代价比较大，利用原型模式会节约系统资源和提高性能
	- 避免构造函数的约束
	
+ **缺点**
	- 配备克隆方法需要对类的功能进行通盘考虑，这对于全新的类不是很难，但对于已有的类不一定很容易，特别当一个类引用不支持串行化的间接对象，或者引用含有循环结构的时候。
	- 必须实现 `Cloneable` 接口。

## 代码实现
原型模式的实现要点如下：
+ 需要实现 `Cloneable` 接口，并并覆盖 `clone` 方法
+ 在 `clone` 方法中返回对象实例，提供需要的数据

### 示例参考
+ [原型模式](./java/io/github/hooj0/prototype/)

## 应用场景
原型模式的核心就是在已经提供的对象的基础上来构造一个新的对象，所以以下场景适用原型模式

+ 当一个系统应该独立于它的产品创建，构成和表示时。
+ 当系统应独立于其产品的创建、组合和表示方式时。
+ 当要在运行时指定要实例化的类时，例如，通过动态加载。
+ 避免构建与产品类层次结构相似的工厂类层次结构。
+ 当一个类的实例可以只有几个不同的状态组合之一。创建相应数量的原型并克隆它们可能更方便，而不是手动实例化类，每次都有适当的状态。
+ 与克隆相比，对象创建成本高昂。
+ 同一个对象，需要创建大量重复的创建。使用原型模式进行克隆对象可以快速并降低资源。

## 应用实例参考

### `JavaSDK` 
+ `java.lang.Object#clone()`
+ `java.lang.Cloneable`

### `GoSDK`

### `PythonSDK`

### `JavaScript Libs`



## 总结



## 参考资料




