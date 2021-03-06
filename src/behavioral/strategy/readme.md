# 策略 `Strategy`

| :sparkles:模式类型:sparkles::sparkles:|:sparkles::sparkles:难度:sparkles:  :sparkles: | :sparkles::sparkles:实用性:sparkles::sparkles: | :sparkles::sparkles:重要程度:sparkles::sparkles: |  :sparkles::sparkles:经典性:sparkles::sparkles: | :sparkles::sparkles:历史性:sparkles: |
| :----------------------------------------: | :-----------------------------------------------: | :-------------------------------------------------: | :----------------------------------------------------: | :--------------------------------------------------: | :--------------------------------------: |
|                    行为型模式                        |                ★★ :arrow_down:                 |                  ★★★★ :arrow_up:                   |                    ★★★ :arrow_up:                    |              :green_heart:  :arrow_up:               |        :green_heart:  :arrow_up:         |

## 概念
策略模式(`Strategy Pattern`)：定义**一系列算法**，将每一个算法封装起来，并让它们可以**相互替换**。策略模式让算法独立于使用它的客户而变化，也称为**政策模式**(`Policy`)。策略模式是一种**对象行为型模式**。

## 用途
策略模式允许**对象在内部状态**发生改变时改变它的行为，对象看起来**好像修改了它的类**。主要解决对象的行为**依赖于它的状态**（属性），并且可以**根据它的状态改变而改变它的相关行为**。

## 模式架构
+ 策略模式是一个比较**容易理解和使用**的设计模式，策略模式是**对算法的封装**，它把**算法的责任和算法本身分割开**，委派给不同的对象管理。策略模式通常把一个**系列的算法**封装到一系列的策略类里面，作为一个**抽象策略类的子类**。用一句话来说，就是**准备一组算法，并将每一个算法封装起来，使得它们可以互换**。
+ 在策略模式中，应当由**客户端**自己决定在什么情况下**使用什么具体策略角色**。
+ 策略模式**仅仅封装算法**，提供**新算法**插入到已有系统中，以及**老算法**从系统中“退休”的方便，策略模式并**不决定在何时**使用何种算法，**算法的选择由客户端来决定**。这在一定程度上**提高了系统的灵活性**，但是**客户端需要理解所有具体策略类之间的区别**，以便选择合适的算法，这也是策略模式的缺点之一，在一定程度上增加了客户端的使用难度。


### 参与角色对象
+ **`Context`: 环境类**，定义策略算法或业务上下文，完成具体策略类的接收，并通过接收到的策略类调用其算法完成策略类的调用。
+ **`Strategy`: 抽象策略类或接口**，定义抽象策略类的算法或业务方法，提供给具体策略类去实现。
+ **`ConcreteStrategy`: 具体策略类**，继承抽象策略类或实现策略接口，完成未实现的方法。

### UML关系图

![1545558455680](../../../.images/1545558455680.png)

## 优点与缺点
+ **优点**
	- 扩展性良好：策略模式提供了**对“开闭原则”的完美支持**，用户可以在**不修改**原有系统的基础上选择算法或行为，也可以**灵活地增加新的算法或行为**。将所有与某个**状态**有关的行为**放到一个类**中，并且可以**方便地增加新的状态**，只需要改变对象状态即可改变对象的行为。 
	- 策略模式提供了**管理相关的算法族**的办法。
	- 策略模式提供了可以**替换继承关系**的办法。
	- 避免使用多重条件判断：使用策略模式可以**避免使用多重条件转移语句**。
	- 算法可以自由切换。
	- **枚举可能的状态**，在枚举状态之前需要确定状态种类。 
	- 允许状态转换逻辑与状态对象合成一体，而不是某一个巨大的条件语句块。 
	- 可以让**多个环境对象共享一个状态对象**，从而**减少系统中对象的个数**。

+ **缺点**
	- 所有策略类都需要对外暴露：客户端**必须知道所有的策略类**，并自行决定使用哪一个策略类。
	- 策略类会增多：策略模式将**造成产生很多策略类**，可以通过使用享元模式在一定程度上减少对象的数量。
	- 状态模式的**结构与实现都较为复杂**，如果使用不当将**导致程序结构和代码的混乱**。
	- 状态模式**对"开闭原则"的支持并不太好**，对于可以切换状态的状态模式，增加新的状态类需要修改那些负责状态转换的源代码，否则无法切换到新增状态，而且修改某个状态类的行为也**需修改对应类的源代码**。


## 代码实现
策略模式的实现要点如下：
+ 定义`Strategy`抽象策略类或接口，设置具体的算法实现方法，供子类或实现类去完成。
+ 定义`ConcreteStrategy`具体策略类，实现`Strategy` 抽象策略类或接口，完成具体方法的算法实现或业务。
+ 定义 `Context` 环境类，接收`Strategy`对象，通过接收到的`Strategy`对象完成具体业务和算法的调用。



### 示例参考
+ [策略模式](./java/io/github/hooj0/strategy)

## 应用场景
策略模式适用于：
+ 许多相关类只在他们的**行为上有所不同**。策略提供了一种将类配置为多种行为之一的方法。
+ **需要不同的算法变体**。例如，您可以定义反映不同空间/时间权衡的算法。当这些变体作为算法的类层次结构实现时，可以使用策略。
+ 算法使用客户端不应该知道的数据。使用策略模式可**避免暴露复杂的特定于算法的数据结构**。
+ 一个类**定义了许多行为**，这些行为在其操作中**显示为多个条件语句**。而不是很多条件，将相关的条件分支移动到自己的`Strategy`类中。
+ 如果在一个系统里面**有许多类**，它们之间的区别仅在于它们的行为，那么**使用策略模式**可以动态地让一个对象在许多行为中选择一种行为。
+ 一个系统需要**动态地在几种算法中选择一种**。
+ 如果一个对象有很多的行为，如果不用恰当的模式，这些行为就只好使用**多重的条件选择**语句来实现。
+ **不希望客户端知道复杂的、与算法相关的数据结构**，在具体策略类中封装算法和相关的数据结构，**提高算法的保密性与安全性**。

## 应用实例参考

### `JavaSDK` 
+ `java.util.Comparator#compare()`
+ `javax.servlet.http.HttpServlet`
+ `javax.servlet.Filter#doFilter()`

### `GoSDK`

### `PythonSDK`

### `JavaScript Libs`


## 总结
+ 策略模式定义**一系列算法**，将每一个算法封装起来，并让它们可以**相互替换**。策略模式让算法独立于使用它的客户而变化，也称为**政策模式**(`Policy`)。策略模式是一种**对象行为型模式**。
+ 策略模式允许**对象在内部状态**发生改变时改变它的行为，对象看起来**好像修改了它的类**。主要解决对象的行为**依赖于它的状态**（属性），并且可以**根据它的状态改变而改变它的相关行为**。
+ 策略模式是一个比较**容易理解和使用**的设计模式，策略模式是**对算法的封装**，它把**算法的责任和算法本身分割开**，委派给不同的对象管理。策略模式通常把一个**系列的算法**封装到一系列的策略类里面，作为一个**抽象策略类的子类**。用一句话来说，就是**准备一组算法，并将每一个算法封装起来，使得它们可以互换**。
+ 策略模式的优点有：算法可以自由切换；避免使用多重条件判断；扩展性良好。
+ 策略模式适用于：许多相关类只在他们的**行为上有所不同**，策略提供了一种将类配置为多种行为之一的方法； **需要不同的算法变体**；如果在一个系统里面**有许多类**，它们之间的区别仅在于它们的行为，那么**使用策略模式**可以动态地让一个对象在许多行为中选择一种行为。