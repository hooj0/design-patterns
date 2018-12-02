# 备忘录 `Memento`

| :sparkles:模式类型:sparkles::sparkles:|:sparkles::sparkles:难度:sparkles:  :sparkles: | :sparkles::sparkles:实用性:sparkles::sparkles: | :sparkles::sparkles:重要程度:sparkles::sparkles: |  :sparkles::sparkles:经典性:sparkles::sparkles: | :sparkles::sparkles:历史性:sparkles: |
| :----------------------------------------: | :-----------------------------------------------: | :-------------------------------------------------: | :----------------------------------------------------: | :--------------------------------------------------: | :--------------------------------------: |
|                     行为型模式                       |                ★★★★★ :arrow_down:                 |                  ★★★★★ :arrow_up:                   |                    ★★★★★ :arrow_up:                    |              :green_heart:  :arrow_up:               |        :green_heart:  :arrow_up:         |

## 概念
备忘录模式(`Memento Pattern`)**在不违反封装的情况下，保存一个对象的内部状态**，以便稍后可以将对象**恢复到此状态**。备忘录模式属于**行为型模式**。

## 用途


## 模式架构



### 参与角色对象



### UML关系图



## 优点与缺点
+ **优点**

+ **缺点**


## 代码实现
备忘录模式的实现要点如下：
+

### 示例参考
+ [备忘录模式](./java/io/github/hooj0/)

## 应用场景
备忘录模式适用于：
+ 必须保存对象状态的快照，以便以后可以将其恢复到该状态
+ 获取状态的直接接口将暴露实现细节并破坏对象的封装

## 应用实例参考

### `JavaSDK` 
+ `java.util.Date`
+ `java.io.Serializable`

### `GoSDK`

### `PythonSDK`

### `JavaScript Libs`


## 总结