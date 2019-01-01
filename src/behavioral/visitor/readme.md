# 访问者 `Visitor`

| :sparkles:模式类型:sparkles::sparkles:|:sparkles::sparkles:难度:sparkles:  :sparkles: | :sparkles::sparkles:实用性:sparkles::sparkles: | :sparkles::sparkles:重要程度:sparkles::sparkles: |  :sparkles::sparkles:经典性:sparkles::sparkles: | :sparkles::sparkles:历史性:sparkles: |
| :----------------------------------------: | :-----------------------------------------------: | :-------------------------------------------------: | :----------------------------------------------------: | :--------------------------------------------------: | :--------------------------------------: |
|                    行为型模式                        |                ★★★ :arrow_down:                 |                  ★★★ :arrow_up:                   |                    ★★★ :arrow_up:                    |              :green_heart:  :arrow_up:               |        :green_heart:  :arrow_up:         |

## 概念
在访问者模式(`Visitor Pattern`)中，使用了一个访问者类，它**改变了元素类的执行算法**。通过这种方式，元素的执行算法**可以随着访问者改变而改变**。这种类型的设计模式属于**行为型模式**。根据模式，元素对象**已接受访问者**对象，这样访问者对象就可以处理元素对象上的操作。

## 用途
主要将**数据结构与数据操作分离**，解决稳定的**数据结构和易变的操作耦合**问题。

## 模式架构


### 参与角色对象



### UML关系图



## 优点与缺点
+ **优点**
	 - 符合**单一职责**原则。 
	 - 优秀的**扩展性**。 
	 - **灵活性**。
	 
+ **缺点**
	- 具体元素对访问者公布细节，**违反了迪米特**原则。
	- 具体元素**变更比较困难**。 
	- 违反了**依赖倒置原则**，**依赖了具体类**，没有依赖抽象。

## 代码实现
访问者模式的实现要点如下：
+

### 示例参考
+ [访问者模式](./java/io/github/hooj0/visitor)

## 应用场景
访问者模式适用于：
+ 对象结构包含许多具有**不同接口**的对象类，并且希望对依赖于其具体类的这些对象执行操作。
+ 需要对对象结构中的对象执行许多不同且不相关的操作，希望避免使用这些操作“污染”它们的类。访问者允许您通过在一个类中定义它们来保持相关操作。当许多应用程序共享对象结构时，使用Visitor将操作放在那些需要它们的应用程序中。
+ 定义对象结构的类很少改变，但是您经常希望在结构上定义新的操作。更改对象结构类需要重新定义所有访问者的界面，这可能是昂贵的。如果对象结构类经常更改，那么在这些类中定义操作可能更好。

+ 对象结构中对象对应的**类很少改变**，但经常需要在此对象结构上**定义新的操作**。 
+ 需要对一个**对象结构中的对象进行很多不同的并且不相关**的操作，而需要避免让这些操作"**污染**"这些对象的类，也**不希望**在增加新操作时**修改这些类**。

## 应用实例参考

### `JavaSDK` 

- [`Apache Wicket`](https://github.com/apache/wicket) component tree, see [`MarkupContainer`](https://github.com/apache/wicket/blob/b60ec64d0b50a611a9549809c9ab216f0ffa3ae3/wicket-core/src/main/java/org/apache/wicket/MarkupContainer.java)
- [`javax.lang.model.element.AnnotationValue`](http://docs.oracle.com/javase/8/docs/api/javax/lang/model/element/AnnotationValue.html) and [`AnnotationValueVisitor`](http://docs.oracle.com/javase/8/docs/api/javax/lang/model/element/AnnotationValueVisitor.html)
- [`javax.lang.model.element.Element`](http://docs.oracle.com/javase/8/docs/api/javax/lang/model/element/Element.html) and [`Element Visitor`](http://docs.oracle.com/javase/8/docs/api/javax/lang/model/element/ElementVisitor.html)
- [`java.nio.file.FileVisitor`](http://docs.oracle.com/javase/8/docs/api/java/nio/file/FileVisitor.html)

### `GoSDK`

### `PythonSDK`

### `JavaScript Libs`


## 总结