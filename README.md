# Design Patterns 设计模式
:racehorse:经典设计和应用模式聚合，各种模式的实现语言有`Java`、`Go `、`Python`、`JavaScript`。有些设计模式无法实现，主要由于语言特性的局限性。

在此之前，可以了解或需要知道 设计模式中的[设计原则](./design-principle.md )、UML中接口和类的各种关联关系表达方式。

## 创造型模式  `Creational Patterns`

|            模式             | 描述                                                         |              实现语言              |
| :-------------------------: | :----------------------------------------------------------- | :--------------------------------: |
|      单例 `Singleton`       | 将一个类型的实例化对象限制为一个全局唯一的对象               | Java \| Python \| Go \| JavaScript |
|  简单工厂`Simple Factory`   | 根据参数的不同返回不同类的实例                               | Java \| Python \| Go \| JavaScript |
|  工厂方法 `Factory Method`  | 将对象的实例化延迟到用于创建实例的专用函数                   | Java \| Python \| Go \| JavaScript |
| 抽象工厂 `Abstract Factory` | 提供用于创建相关对象族的函数                                 | Java \| Python \| Go \| JavaScript |
|      建造者  `Builder`      | 使用简单对象构建复杂对象                                     | Java \| Python \| Go \| JavaScript |
|      原型 `Prototype`       | 将一个对象作为原型，对其进行复制、克隆，<br/>产生一个和原对象类似的新对象 | Java \| Python \| Go \| JavaScript |
|    对象池 `Object Pool`     | 实例化并维护一组相同类型的对象实例                           | Java \| Python \| Go \| JavaScript |



## 结构模式 `Structural Patterns`

|       模式        | 描述                                                         |              实现语言              |
| :---------------: | ------------------------------------------------------------ | :--------------------------------: |
| 适配器 `Adapter ` | 将一个接口转换成对方希望的另一个接口，<br/>使接口不兼容的那些类可以一起工作 | Java \| Python \| Go \| JavaScript |
|  桥接  `Bridge`   | 将接口与其实现分离，以便两者可以独立变化                     | Java \| Python \| Go \| JavaScript |
| 组合 `Composite`  | 封装并提供对许多不同对象的访问                               | Java \| Python \| Go \| JavaScript |
| 装饰  `Decorator` | 静态或动态地向对象添加行为                                   | Java \| Python \| Go \| JavaScript |
|  外观   `Facade`  | 使用一种类型作为许多其他类型的API                            | Java \| Python \| Go \| JavaScript |
| 享元 `Flyweight`  | 重用具有`相似/相同`状态的对象的现有实例以最小化资源使用 :racehorse: | Java \| Python \| Go \| JavaScript |
|   代理  `Proxy`   | 为对象提供代理以控制其操作                                   | Java \| Python \| Go \| JavaScript |



## 行为模式 `Behavioral Patterns`

|                  模式                   | 描述                                                         |              实现语言              |
| :-------------------------------------: | ------------------------------------------------------------ | :--------------------------------: |
| 责任链<br/> ` Chain of Responsibility ` | 通过为对象提供处理请求的机会，<br/>避免将发送方与接收方耦合  | Java \| Python \| Go \| JavaScript |
|            命令   `Command`             | 捆绑命令和参数以便稍后调用                                   | Java \| Python \| Go \| JavaScript |
|          解释器 `Interpreter`           | 通常定义了一个语言的语法，<br/>然后解析相应语法的语句。      | Java \| Python \| Go \| JavaScript |
|           迭代器  `Iterator`            | 提供一个一致的方法来顺序访问集合中的对象:racehorse::racehorse::racehorse: <br/>这个方法与底层的集合的具体实现无关。 | Java \| Python \| Go \| JavaScript |
|           中介者   `Mediator`           | 连接对象并充当代理                                           | Java \| Python \| Go \| JavaScript |
|            备忘录 `Memento`             | 生成可用于返回先前状态的不透明令牌                           | Java \| Python \| Go \| JavaScript |
|           观察者  `Observer`            | 提供回调以通知事件/数据更改                                  | Java \| Python \| Go \| JavaScript |
|             状态 ` State `              | 根据内部状态封装同一对象的不同行为                           | Java \| Python \| Go \| JavaScript |
|            策略 ` Strategy `            | 允许在运行时选择算法的行为                                   | Java \| Python \| Go \| JavaScript |
|    模板方法 <br/>` Template Method`     | 定义一个框架类将某些方法推迟到子类中实现                     | Java \| Python \| Go \| JavaScript |
|           访问者 ` Visitor `            | 将算法与其运行的对象分开                                     | Java \| Python \| Go \| JavaScript |
|              空对象 `Null`              | 通过一个无意义的对象来代替没有对象这个状态<br/>它使得你不用额外对空对象进行处理。 | Java \| Python \| Go \| JavaScript |
|             注册 `Registry`             | 跟踪给定类的所有子类                                         | Java \| Python \| Go \| JavaScript |



## 同步模式 `Synchronization Patterns`

|                模式                 | 描述                                               |              实现语言              |
| :---------------------------------: | -------------------------------------------------- | :--------------------------------: |
| 条件变量 <br/> `Condition Variable` | 为线程提供一种机制，可以暂时放弃访问以等待某些条件 | Java \| Python \| Go \| JavaScript |
|       锁定/互斥 `Lock/Mutex`        | 对资源实施互斥限制以获得独占访问权限               | Java \| Python \| Go \| JavaScript |
|           监视 `Monitor`            | 互斥和条件变量模式的组合                           | Java \| Python \| Go \| JavaScript |
|   读写锁定 <br/>`Read-Write Lock`   | 允许并行读访问，但只允许对资源的写操作进行独占访问 | Java \| Python \| Go \| JavaScript |
|          信号 `Semaphore`           | 允许控制对公共资源的访问                           | Java \| Python \| Go \| JavaScript |



## 并发模式 `Concurrency Patterns`

|                  模式                  | 描述                                                         |              实现语言              |
| :------------------------------------: | ------------------------------------------------------------ | :--------------------------------: |
|          N道屏障 `N-Barrier`           | 阻止进程继续进行，直到所有N个进程都到达障碍 :racehorse:  :racehorse:  :racehorse: | Java \| Python \| Go \| JavaScript |
|  有界并行<br/> `Bounded Parallelism`   | 使用资源限制完成大量独立任务                                 | Java \| Python \| Go \| JavaScript |
|            广播 `Broadcast`            | 同时将消息传输给所有收件人                                   | Java \| Python \| Go \| JavaScript |
|          协同程序`Coroutines`          | 允许在某些位置暂停和恢复执行的子程序                         | Java \| Python \| Go \| JavaScript |
|           生成器`Generators`           | 一次产生一个值序列                                           | Java \| Python \| Go \| JavaScript |
|            反应堆 `Reactor`            | 解复用并发传递给服务处理程序的服务请求，<br/>并将它们同步地分派给关联的请求处理程序 | Java \| Python \| Go \| JavaScript |
|           排比 `Parallelism`           | 完成大量独立任务                                             | Java \| Python \| Go \| JavaScript |
| 生产者与消费者<br/>`Producer Consumer` | 将任务与任务执行分开                                         | Java \| Python \| Go \| JavaScript |



## 消息模式 `Messaging Patterns`

|             模式              | 描述                                         |              实现语言              |
| :---------------------------: | -------------------------------------------- | :--------------------------------: |
|           `Fan-In`            | 将任务漏斗到工作接收器（例如服务器）         | Java \| Python \| Go \| JavaScript |
|           `Fan-Out`           | 在工人之间分配任务（例如生产者）             | Java \| Python \| Go \| JavaScript |
|     `Futures & Promises`      | 充当结果的占位符，该结果最初未知用于同步目的 | Java \| Python \| Go \| JavaScript |
| 发布/订阅 `Publish/Subscribe` | 将信息传递给订阅主题的收件人集合             | Java \| Python \| Go \| JavaScript |
|   推送 & 拉取 `Push & Pull`   | 将消息分发给排列在管道中的多个工作人员       | Java \| Python \| Go \| JavaScript |



## 稳定性模式 `Stability Patterns`

|             模式              | 描述                                                         |              实现语言              |
| :---------------------------: | ------------------------------------------------------------ | :--------------------------------: |
|          `Bulkheads`          | 实施故障遏制原则（即防止级联故障）                           | Java \| Python \| Go \| JavaScript |
| 断路器<br/> `Circuit-Breaker` | 请求可能失败时停止请求流                                     | Java \| Python \| Go \| JavaScript |
|       限期  `Deadline`        | 允许客户端在响应概率变低后停止等待响应<br/>（例如，等待页面刷新10秒后） | Java \| Python \| Go \| JavaScript |
|   快速失败<br/> `Fail-Fast`   | 在请求开始时检查所需资源的可用性，如果不满足要求则失败       | Java \| Python \| Go \| JavaScript |
|      握手 `Handshaking`       | 询问组件是否可以承受更多负载，如果不能，则请求被拒绝         | Java \| Python \| Go \| JavaScript |
|  稳定状态<br/>`Steady-State`  | 对于累积资源的每个服务，某些其他服务必须回收该资源           | Java \| Python \| Go \| JavaScript |



## 分析模式 `Profiling Patterns`

|              模式               | 描述                                                         |              实现语言              |
| :-----------------------------: | ------------------------------------------------------------ | :--------------------------------: |
| 时序函数模式 `Timing Functions` | 包装函数并记录执行顺序信息 :racehorse:  :racehorse:  :racehorse:  :racehorse:  :racehorse:  :racehorse: | Java \| Python \| Go \| JavaScript |



## 成语模式 `Idioms`

|             模式              | 描述                                                         |              实现语言              |
| :---------------------------: | ------------------------------------------------------------ | :--------------------------------: |
| 功能选项 `Functional Options` | 允许使用合理的默认值和惯用替换创建干净的API :racehorse:  :racehorse: | Java \| Python \| Go \| JavaScript |



## 反对者模式 `Anti-Patterns`

|                模式                | 描述                                                         |              实现语言              |
| :--------------------------------: | ------------------------------------------------------------ | :--------------------------------: |
| 级联故障<br/> `Cascading Failures` | 互连部件系统中的故障，其中部件的故障导致 :racehorse:  :racehorse:  :racehorse:  :racehorse:  :racehorse: <br/>多米诺骨牌效应 | Java \| Python \| Go \| JavaScript |





- 结构型模式：
  - 适配器：用来把一个接口转化成另一个接口，如 java.util.Arrays#asList()。
  - 桥接模式：这个模式将抽象和抽象操作的实现进行了解耦，这样使得抽象和实现可以独立地变化，如JDBC；
  - 组合模式：使得客户端看来单个对象和对象的组合是同等的。换句话说，某个类型的方法同时也接受自身类型作为参数，如 Map.putAll，List.addAll、Set.addAll。
  - 装饰者模式：动态的给一个对象附加额外的功能，这也是子类的一种替代方式，如 java.util.Collections#checkedList|Map|Set|SortedSet|SortedMap。
  - 享元模式：使用缓存来加速大量小对象的访问时间，如 valueOf(int)。
  - 代理模式：代理模式是用一个简单的对象来代替一个复杂的或者创建耗时的对象，如 java.lang.reflect.Proxy
- 创建模式:
  - 抽象工厂模式：抽象工厂模式提供了一个协议来生成一系列的相关或者独立的对象，而不用指定具体对象的类型，如 java.util.Calendar#getInstance()。
  - 建造模式(Builder)：定义了一个新的类来构建另一个类的实例，以简化复杂对象的创建，如：java.lang.StringBuilder#append()。
  - 工厂方法：就是 **一个返*** 回具体对象的方法，而不是多个，如 java.lang.Object#toString()、java.lang.Class#newInstance()。
  - 原型模式：使得类的实例能够生成自身的拷贝、如：java.lang.Object#clone()。
  - 单例模式：全局只有一个实例，如 java.lang.Runtime#getRuntime()。
- 行为模式：
  - 责任链模式：通过把请求从一个对象传递到链条中下一个对象的方式，直到请求被处理完毕，以实现对象间的解耦。如 javax.servlet.Filter#doFilter()。
  - 命令模式：将操作封装到对象内，以便存储，传递和返回，如：java.lang.Runnable。
  - 解释器模式：定义了一个语言的语法，然后解析相应语法的语句，如，java.text.Format，java.text.Normalizer。
  - 迭代器模式：提供一个一致的方法来顺序访问集合中的对象，如 java.util.Iterator。
  - 中介者模式：通过使用一个中间对象来进行消息分发以及减少类之间的直接依赖，java.lang.reflect.Method#invoke()。
  - 空对象模式：如 java.util.Collections#emptyList()。
  - 观察者模式：它使得一个对象可以灵活的将消息发送给感兴趣的对象，如 java.util.EventListener。
  - 模板方法模式：让子类可以重写方法的一部分，而不是整个重写，如 java.util.Collections#sort()。

