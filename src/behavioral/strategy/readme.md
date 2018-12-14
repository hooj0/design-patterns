# 策略 `Strategy`

| :sparkles:模式类型:sparkles::sparkles:|:sparkles::sparkles:难度:sparkles:  :sparkles: | :sparkles::sparkles:实用性:sparkles::sparkles: | :sparkles::sparkles:重要程度:sparkles::sparkles: |  :sparkles::sparkles:经典性:sparkles::sparkles: | :sparkles::sparkles:历史性:sparkles: |
| :----------------------------------------: | :-----------------------------------------------: | :-------------------------------------------------: | :----------------------------------------------------: | :--------------------------------------------------: | :--------------------------------------: |
|                    行为型模式                        |                ★★★★★ :arrow_down:                 |                  ★★★★★ :arrow_up:                   |                    ★★★★★ :arrow_up:                    |              :green_heart:  :arrow_up:               |        :green_heart:  :arrow_up:         |

## 概念
策略模式(`Strategy Pattern`)：定义**一系列算法**，将每一个算法封装起来，并让它们可以**相互替换**。策略模式让算法独立于使用它的客户而变化，也称为**政策模式**(`Policy`)。策略模式是一种**对象行为型模式**。

## 用途


## 模式架构



### 参与角色对象
+ **`Context`: 环境类**，
+ **`Strategy`: 抽象策略类**，
+ **`ConcreteStrategy`: 具体策略类**，


### UML关系图



## 优点与缺点
+ **优点**

+ **缺点**


## 代码实现
策略模式的实现要点如下：
+

### 示例参考
+ [策略模式](./java/io/github/hooj0/strategy)

## 应用场景
策略模式适用于：
+

## 应用实例参考

### `JavaSDK` 
+ `java.util.Comparator#compare()`
+ `javax.servlet.http.HttpServlet`
+ `javax.servlet.Filter#doFilter()`

### `GoSDK`

### `PythonSDK`

### `JavaScript Libs`


## 总结