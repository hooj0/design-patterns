# 状态 ` State `

| :sparkles:模式类型:sparkles::sparkles:|:sparkles::sparkles:难度:sparkles:  :sparkles: | :sparkles::sparkles:实用性:sparkles::sparkles: | :sparkles::sparkles:重要程度:sparkles::sparkles: |  :sparkles::sparkles:经典性:sparkles::sparkles: | :sparkles::sparkles:历史性:sparkles: |
| :----------------------------------------: | :-----------------------------------------------: | :-------------------------------------------------: | :----------------------------------------------------: | :--------------------------------------------------: | :--------------------------------------: |
|                     行为型模式                       |                ★★★ :arrow_down:                 |                  ★★★★ :arrow_up:                   |                    ★★★★★ :arrow_up:                    |              :green_heart:  :arrow_up:               |        :green_heart:  :arrow_up:         |

## 概念
状态模式(`State Pattern`) ：允许一个对象在其**内部状态改变时改变它的行为**，对象看起来似乎**修改了它的类**。其别名为**状态对象**(`Objects for States`)，状态模式是一种对象**行为型**模式。

## 用途
在很多情况下，一个对象的行为**取决于一个或多个动态**变化的属性，这样的属性叫做状态，这样的对象叫做**有状态的(`stateful`)对象**，这样的对象状态是从**事先定义好**的一系列值中取出的。当一个这样的对象**与外部事件**产生互动时，其**内部状态就会改变**，从而使得系统的行为也随之发生变化。
在UML中可以使用状态图来描述对象状态的变化。

## 模式架构
- 状态模式描述了**对象状态的变化**以及对象如何在每一种状态下**表现出不同的行为**。
- 状态模式的关键是引入了一个**抽象类来专门表示对象的状态**，这个类我们叫做**抽象状态类**，而对象的每一种**具体状态类**都**继承了该类**，并在不同具体状态类中实现了不同状态的行为，包括各种**状态之间的转换**。

- 在状态模式结构中需要理解**环境类与抽象状态类**的作用：
	+ **环境类**实际上就是**拥有状态**的对象，环境类有时候可以**充当状态管理器**(`State Manager`)的角色，可以在环境类中**对状态进行切换**操作。
	+ **抽象状态类**可以是**抽象类，也可以是接口**，不同状态类就是**继承**这个父类的不同子类，状态类的产生是由于**环境类存在多个状态**，同时还满足两个条件： 这些状态经常需要**切换**，在不同的状态下对象的**行为不同**。因此可以将**不同对象下的行为单独提取出来封装在具体的状态类中**，使得环境类对象在其**内部状态改变时可以改变它的行为**，对象看起来似乎修改了它的类，而实际上是由于切换到不同的具体**状态类实现**的。由于环境类可以设置为**任一具体状态类**，因此它针对抽象状态类进行编程，在程序运行时可以将任一具体状态类的对象**设置到环境类**中，从而使得环境类可以改变内部状态，并且改变行为。


### 参与角色对象
+ **`Context`: 环境类**，环境类负责完成当前状态的存储和具体状态的切换操作。
+ **`State`: 抽象状态类**，定义状态接口方法，具体状态和状态切换的操作。
+ **`ConcreteState`: 具体状态类**，实现状态接口方法，具体状态和状态切换的操作。


### UML关系图

![1544793640717](../../../.images/1544793640717.png)

## 优点与缺点
+ **优点**
	- **封装了转换规则**。
	- **枚举可能的状态**，在枚举状态之前需要确定状态种类。
	- 将**所有与某个状态有关的行为放到一个类中**，并且可以方便地增加新的状态，只需要**改变对象状态**即可改变对象的行为。
	- 允许**状态转换逻辑与状态对象合成一体**，而不是某一个巨大的条件语句块。
	- 可以**让多个环境对象共享一个状态对象**，从而**减少**系统中对象的个数。
	
+ **缺点**
	- 状态模式的使用必然会**增加系统类和对象的个数**。
	- 状态模式的**结构与实现都较为复杂**，如果使用不当将导致程序结构和代码的**混乱**。
	- 状态模式**对“开闭原则”的支持并不太好**，对于可以切换状态的**状态模式**，增加新的状态类需要**修改**那些负责状态转换的源代码，否则无法切换到新增状态；而且修改某个状态类的行为也需修改对应类的源代码。

## 代码实现
状态模式的实现要点如下：
+ 定义`Context`环境类，实现状态的切换和具体状态的操作业务。
+ 定义`State`状态接口，定义多个不同状态下的具体方法操作。
+ 定义 `ConcreteState`具体状态类，定义接收`Context`环境类来实现完成不同状态切换的操作。


### 示例参考
+ [状态模式](./java/io/github/hooj0/state)

## 应用场景
状态模式适用于：
+ **对象的行为取决于其状态**，并且必须根据该状态**在运行时更改其行为**。
+ 操作具有依赖于对象状态的大型多部分**条件语句**。该状态通常由一个或多个**枚举常量表示**。通常，几个操作将包含**相同的条件结构**。`State`模式将**条件的每个分支放在一个单独的类**中。这使您可以将对象的状态视为一个**独立于其他对象**的对象。
+ 代码中包含**大量与对象状态有关的条件语句**，这些条件语句的出现，会**导致代码的可维护性和灵活性变差**，不能方便地增加和删除状态，使客户类与类库之间的**耦合增强**。在这些条件语句中包含了对象的行为，而且这些条件对应于对象的各种状态。

## 应用实例参考

### `JavaSDK` 
+ `java.util.Iterator`
+ [`javax.faces.lifecycle.LifeCycle#execute()`](http://docs.oracle.com/javaee/7/api/javax/faces/lifecycle/Lifecycle.html#execute-javax.faces.context.FacesContext-)
+ [`JDiameter - Diameter State Machine`](https://github.com/npathai/jdiameter/blob/master/core/jdiameter/api/src/main/java/org/jdiameter/api/app/State.java)

### `GoSDK`

### `PythonSDK`

### `JavaScript Libs`


## 总结
+ 状态模式(`State Pattern`) ：允许一个对象在其**内部状态改变时改变它的行为**，对象看起来似乎**修改了它的类**。
+ 在很多情况下，一个对象的行为**取决于一个或多个动态**变化的属性，这样的属性叫做状态，这样的对象叫做**有状态的(`stateful`)对象**，这样的对象状态是从**事先定义好**的一系列值中取出的。当一个这样的对象**与外部事件**产生互动时，其**内部状态就会改变**，从而使得系统的行为也随之发生变化。
+ 状态模式描述了**对象状态的变化**以及对象如何在每一种状态下**表现出不同的行为**。
+ 状态模式的优点有：**封装了转换规则**；**枚举可能的状态**，在枚举状态之前需要确定状态种类；将**所有与某个状态有关的行为放到一个类中**，并且可以方便地增加新的状态，只需要**改变对象状态**即可改变对象的行为；允许**状态转换逻辑与状态对象合成一体**，而不是某一个巨大的条件语句；可以**让多个环境对象共享一个状态对象**，从而**减少**系统中对象的个数。
+ 状态模式适用于：**对象的行为取决于其状态**，并且必须根据该状态**在运行时更改其行为**；操作具有依赖于对象状态的大型多部分**条件语句**；代码中包含**大量与对象状态有关的条件语句**，这些条件语句的出现，会**导致代码的可维护性和灵活性变差**，不能方便地增加和删除状态，使客户类与类库之间的**耦合增强**。