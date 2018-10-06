# 工厂方法 `Factory Method`

| :sparkles:模式类型:sparkles::sparkles:|:sparkles::sparkles:难度:sparkles:  :sparkles: | :sparkles::sparkles:实用性:sparkles::sparkles: | :sparkles::sparkles:重要程度:sparkles::sparkles: |  :sparkles::sparkles:经典性:sparkles::sparkles: | :sparkles::sparkles:历史性:sparkles: |
| :----------------------------------------: | :-----------------------------------------------: | :-------------------------------------------------: | :----------------------------------------------------: | :--------------------------------------------------: | :--------------------------------------: |
|          创造型                                  |                ★★★★★ :arrow_down:                 |                  ★★★★★ :arrow_up:                   |                    ★★★★★ :arrow_up:                    |              :green_heart:  :arrow_up:               |        :green_heart:  :arrow_up:         |

## 概念
工厂方法模式(`Factory Method Pattern`)又称为工厂模式，也叫虚拟构造器(`Virtual Constructor`)模式或者多态工厂(`Polymorphic Factory`)模式，它属于类创建型模式。在工厂方法模式中，工厂父类负责定义创建产品对象的公共接口，而工厂子类则负责生成具体的产品对象，这样做的目的是**将产品类的实例化操作延迟到工厂子类中完成**，即通过工厂子类来确定究竟应该实例化哪一个具体产品类。

## 用途
在简单工厂模式中，当添加新产品的时候，都需要修改工厂类的业务逻辑，提供创建新产品的业务。在产品过多的情况下，这种方式非常复杂或繁琐，并且容易出错导致维护、扩展极其复杂。这个时候如果使用工厂方法模式，将实例化产品的方法推迟到子类中完成，这将工厂的业务分离到子类从而变得简单且易于维护。


## 模式架构
工厂方法承接简单工厂模式，在工厂类这一层进行了分解，将所有构建产品的工厂分解成不同产品的工厂让子类工厂进行业务封装实现，这样就解决了所有创建产品的业务聚集在一个类中的情况，避免了业务复杂性。


### 参与角色对象
工厂方法模式包含如下角色：
+ **Product**：抽象产品、产品接口，提供统一的产品定制模型，定制一套规范规格化的产品
+ **ConcreteProduct**：具体产品，提供构建不同的产品对象
+ **Factory**：抽象工厂，提供生产不同的产品实例的抽象类
+ **ConcreteFactory**：具体工厂，继承抽象工厂类，将生产产品的业务逻辑封装在工厂类而不对外暴露


### UML关系图

![1538821418543](../../.images/1538821418543.png)

## 优点与缺点
+ **优点**
	- 高内聚低耦合，降低工厂类原先
+ **缺点**


## 代码实现



## 应用场景



## 应用实例参考

### `JavaSDK` 

### `GoSDK`

### `PythonSDK`

### `JavaScript Libs`



## 总结



## 参考资料




