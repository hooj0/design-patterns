# 迭代器 `Iterator`

| :sparkles:模式类型:sparkles::sparkles:|:sparkles::sparkles:难度:sparkles:  :sparkles: | :sparkles::sparkles:实用性:sparkles::sparkles: | :sparkles::sparkles:重要程度:sparkles::sparkles: |  :sparkles::sparkles:经典性:sparkles::sparkles: | :sparkles::sparkles:历史性:sparkles: |
| :----------------------------------------: | :-----------------------------------------------: | :-------------------------------------------------: | :----------------------------------------------------: | :--------------------------------------------------: | :--------------------------------------: |
|                 行为型模式                           |                ★★★ :arrow_down:                 |                  ★★★ :arrow_up:                   |                    ★★★★ :arrow_up:                    |              :green_heart:  :arrow_up:               |        :green_heart:  :arrow_up:         |

## 概念
迭代器模式（`Iterator Pattern`）是编程环境中常用的设计模式，这种模式**用于顺序访问集合对象的元素**，不需要知道集合对象的**底层实现**，迭代器模式属于**行为型模式**。

## 用途
提供一种方法**顺序访问**一个聚合对象中**各个元素**， 而又**无须暴露**该对象的内部表示。主要解决**不同的方式来遍历整个聚合集合对象**。

## 模式架构



### 参与角色对象



### UML关系图



## 优点与缺点
+ **优点**

+ **缺点**


## 代码实现
模式的实现要点如下：
+

### 示例参考
+ [模式](./java/io/github/hooj0/)

## 应用场景
迭代器模式适用于：
+ **访问聚合对象的内容**，而**不暴露其内部实现细节**的表示。
+ 支持聚合对象的**多次遍历**。
+ 为穿越不同的聚合结构提供**统一的界面**。

## 应用实例参考

### `JavaSDK` 
- [java.util.Iterator](http://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html)
- [java.util.Enumeration](http://docs.oracle.com/javase/8/docs/api/java/util/Enumeration.html)

### `GoSDK`

### `PythonSDK`

### `JavaScript Libs`




