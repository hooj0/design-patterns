# 对象池 `Object-Pool`

| :sparkles:模式类型:sparkles::sparkles:|:sparkles::sparkles:难度:sparkles:  :sparkles: | :sparkles::sparkles:实用性:sparkles::sparkles: | :sparkles::sparkles:重要程度:sparkles::sparkles: |  :sparkles::sparkles:经典性:sparkles::sparkles: | :sparkles::sparkles:历史性:sparkles: |
| :----------------------------------------: | :-----------------------------------------------: | :-------------------------------------------------: | :----------------------------------------------------: | :--------------------------------------------------: | :--------------------------------------: |
|                   创造型模式                         |                ★★★ :arrow_down:                 |                  ★★★★ :arrow_up:                   |                    ★★★★★ :arrow_up:                    |              :green_heart:  :arrow_up:               |        :green_heart:  :arrow_up:         |

## 概念
实例化并维护一组相同类型的对象实例.

## 用途
当创建对象很昂贵并且仅在短时间内需要它们时，利用对象池模式是有利的。对象池为实例化对象提供缓存，以跟踪正在使用哪些对象以及哪些对象可用。


## 模式架构



### 参与角色对象
+ **AbstractFactory**：工厂接口、工厂抽象类，提供生产不同的产品工厂的抽象类


### UML关系图



## 优点与缺点
+ **优点**
	
+ **缺点**

## 代码实现
对象池模式的实现要点如下：
+ 需要定义产品接口或抽象类，定制需要实现产品的功能方法

### 示例参考
+ [对象池模式](./java/io/github/hooj0/objectpool/)


## 应用场景
使用对象池模式时：
+ 对象的创建成本很高（分配成本）
+ 你需要大量的短期对象（内存碎片）


## 应用实例参考

### `JavaSDK` 

### `GoSDK`

### `PythonSDK`

### `JavaScript Libs`



## 总结



## 参考资料




