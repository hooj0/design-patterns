# 适配器 `Adapter`

| :sparkles:模式类型:sparkles::sparkles:|:sparkles::sparkles:难度:sparkles:  :sparkles: | :sparkles::sparkles:实用性:sparkles::sparkles: | :sparkles::sparkles:重要程度:sparkles::sparkles: |  :sparkles::sparkles:经典性:sparkles::sparkles: | :sparkles::sparkles:历史性:sparkles: |
| :----------------------------------------: | :-----------------------------------------------: | :-------------------------------------------------: | :----------------------------------------------------: | :--------------------------------------------------: | :--------------------------------------: |
|                   结构型模式                         |                ★★★ :arrow_down:                 |                  ★★★★★ :arrow_up:                   |                    ★★★★★ :arrow_up:                    |              :green_heart:  :arrow_up:               |        :green_heart:  :arrow_up:         |

## 概念
适配器模式(`Adapter Pattern`) ：将一个接口转换成客户希望的另一个接口，适配器模式使接口不兼容的那些类可以一起工作，其别名为包装器(`Wrapper`)。适配器模式既可以作为类结构型模式，也可以作为对象结构型模式。

## 用途


## 模式架构



### 参与角色对象



### UML关系图



## 优点与缺点



## 代码实现



## 应用场景
假设一下你的存储卡里有一些照片，你需要把它们转移到你的电脑上。为了转移它们，你 需要一些与你的电脑接口兼容的适配器，这样你就可以将存储卡连接到你的电脑上。这里， 读卡器就起到了适配器的作用。更经典的例子就是人尽皆知的电源适配器了，一个三脚的 插头不能连接到两个孔的插座上，它需要一个电源适配器，使它与两个分叉的插座兼容


## 应用实例参考

### `JavaSDK` 
+ `java.util.Arrays#asList()`
+ `javax.swing.JTable(TableModel)`
+ `java.io.InputStreamReader(InputStream)`
+ `java.io.OutputStreamWriter(OutputStream)`
+ `javax.xml.bind.annotation.adapters.XmlAdapter#marshal()`
+ `javax.xml.bind.annotation.adapters.XmlAdapter#unmarshal()`

### `GoSDK`

### `PythonSDK`

### `JavaScript Libs`



## 总结



## 参考资料





