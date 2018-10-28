# 装饰 `Decorator`

| :sparkles:模式类型:sparkles::sparkles:|:sparkles::sparkles:难度:sparkles:  :sparkles: | :sparkles::sparkles:实用性:sparkles::sparkles: | :sparkles::sparkles:重要程度:sparkles::sparkles: |  :sparkles::sparkles:经典性:sparkles::sparkles: | :sparkles::sparkles:历史性:sparkles: |
| :----------------------------------------: | :-----------------------------------------------: | :-------------------------------------------------: | :----------------------------------------------------: | :--------------------------------------------------: | :--------------------------------------: |
|                  结构型模式                          |                ★★★★★ :arrow_down:                 |                  ★★★★★ :arrow_up:                   |                    ★★★★★ :arrow_up:                    |              :green_heart:  :arrow_up:               |        :green_heart:  :arrow_up:         |

## 概念
装饰模式(`Decorator Pattern`)：动态地给一个对象增加一些**额外**的职责(`Responsibility`)，就增加对象功能来说，**装饰模式比生成子类实现更为灵活**。其别名也可以称为**包装器**(`Wrapper`)，与适配器模式的别名相同，但它们适用于不同的场合。根据翻译的不同，装饰模式也有人称之为“油漆工模式”，它是一种对象结构型模式。简单来说：装饰模式允许通过将对象包装在装饰器类的对象中来动态更改对象在运行时的行为。

## 用途
动态的给一个对象附加额外的功能，这也是子类的一种替代方式。装饰器为子类化提供了灵活的替代扩展功能。可以看到，在创建一个类型的时候，同时也传入同一类型的对象。这在JDK里随处可见，你会发现它无处不在，所以下面这个列表只是一小部分。

## 模式架构



### 参与角色对象



### UML关系图



## 优点与缺点
+ **优点**

+ **缺点**


## 代码实现
装饰模式的实现要点如下：

### 示例参考
+ [装饰模式](./java/io/github/hooj0/decorator/)

## 应用场景
装饰器模式适用于：
+ **动态且透明**地向各个对象添加职责，即**不影响**其他对象
+ 对于可以**撤回**的责任
+ 通过**子类扩展**是不切实际的。有时可能会有大量独立扩展，并会**产生大量子类**以支持每种组合。或者类定义可能隐藏或不可用于子类化


## 应用实例参考

### `JavaSDK` 
+ `java.io.BufferedInputStream(InputStream)`
+ `java.io.DataInputStream(InputStream)`
+ `java.io.BufferedOutputStream(OutputStream)`
+ `java.util.zip.ZipOutputStream(OutputStream)`
+ `java.util.Collections#checkedList|Map|Set|SortedSet|SortedMap`

### `GoSDK`

### `PythonSDK`

### `JavaScript Libs`



## 总结



## 参考资料





