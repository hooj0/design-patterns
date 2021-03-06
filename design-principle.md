# 设计模式的设计原则
在程序设计中，程序的设计原则会帮助我们尽可能降低错误、工作量，提高程序的性能、开发效率。在某些情况下，设计程序需要根据当前程序进行一些规则的权衡选择。下面的设计原则并非绝对，仅仅是一个设计想法的参考，实际中的应用还需要考虑到众多因素，需要自己去权衡利弊进而选择适合自己的设计模式和原则。

## 六大原则

最常用的设计原则，也是目前比较被大众认可、统一固化的设计原则。

+ [单一职责原则](#单一责任原则)（`Single Responsibility Principle`）
+ 里氏代换原则（`Liskov Substitution Principle`）
+ [依赖倒置原则](#控制反转)（`Dependence Inversion Principle`）
+ [接口隔离原则](#接口隔离原则)（`Interface Segregation Principle`）
+ 迪米特法则（`Demeter Principle`）
+ [开放/封闭原则](#开放/封闭原则)（`Open Close Principle`）

## 适用于所有地方

+ [保持简单原则](#保持简单原则)
+ [YAGNI原则](#yagni原则)
+ [做最简单的事可能有效](#做最简单的事可能有效)
+ [关注点分离原则](#关注点分离)
+ [DRY原则](#dry原则)
+ [维护者代码](#代码维护者)
+ [避免过早优化原则](#避免过早优化)
+ [机会重构原则](#机会重构原则)

## 仅适用于模块内部/类

+ [最小化耦合](#最小化耦合)
+ [得墨忒耳定律](#得墨忒耳定律)
+ [继承的组合](#继承的组合)
+ 正交
+ [稳健性原则](#稳健性原则)
+ [控制反转](#控制反转)

## 用于所有模块/类

+ [最大化凝聚力](#最大化凝聚力)
+ 利斯科夫替代原则
+ [开放/封闭原则](#开放/封闭原则)
+ [单一责任原则](#单一责任原则)
+ [隐藏实现细节](#隐藏实现细节)
+ [卷毛定律](#卷毛定律：做一件事)
+ [封装了哪些变化](#封装了哪些变化)
+ [接口隔离原则](#接口隔离原则)
+ [命令查询分离](#命令查询分离)

<hr/>

## 保持简单原则

**能保持简单就不要复杂**，简单能让系统都能发挥最佳性能，而复杂的程序让系统变得缓慢、不易维护和移植等诸多问题。

### `Why?`

- **更少的代码**花费**更少的时间**来编写，具有**更少的错误**，并且**更容易修改**。
- 简约是最终的完美。
- 没有多余的东西，这样可以达到完美，不需要的什么都不用留下来。

### 参考资源

- [KISS principle](http://en.wikipedia.org/wiki/KISS_principle)
- [Keep It Simple Stupid (KISS)](http://principles-wiki.net/principles:keep_it_simple_stupid)

## YAGNI原则

YAGNI代表“**你不会需要它**”：在非**必要**之前**不要实现某些接口或方法**。未来不明确需要的东西，不需要在当前完成它，但可以留下接口或扩展。因为未来是未知的变数，虽然在程序设计中，我们常常给未来做出很多看似明确的设计，但后期大部分都没有实现。

### `Why?`

- 任何仅用于明天需要的功能的工作，意味着从当前迭代完成功能会需要很大的工作量。
- 它导致代码膨胀，软件变得更大，更复杂。

### `How?`

- 当你真正需要它们时，总是会实现它们的，而不是在你预见到需要它们的时候。

### 参考资源

- [You Arent Gonna Need It](http://c2.com/xp/YouArentGonnaNeedIt.html)
- [You’re NOT gonna need it!](http://www.xprogramming.com/Practices/PracNotNeed.html)
- [You ain't gonna need it](http://en.wikipedia.org/wiki/You_ain't_gonna_need_it)

## 做最简单的事可能有效

用最简单的方式实现功能，让代码尽量简单简短。简单的代码更容易理解和沟通，维护更方便。

### `Why?`

- 如果我们只是解决问题的真正原因，那么真正问题的真正进展就会最大化。

### `How?`

- 问问自己：“最简单的事情是什么？”

### 参考资源

- [Do The Simplest Thing That Could Possibly Work](http://c2.com/xp/DoTheSimplestThingThatCouldPossiblyWork.html)

## 关注点分离

关注点分离（`Soc`）是将计算机程序**分成不同部分**的设计原则，这样**每个部分都解决了一个单独的问题**。例如，应用程序的业务逻辑是一个问题，用户界面是另一个问题。更改用户界面不应要求更改业务逻辑，反之亦然。

### `Why?`

- 简化软件应用程序的开发和维护。
- 当问题分离时，各个部分可以重复使用，也可以独立开发和更新。

### `How?`

- 将程序功能分解为尽可能少重叠的单独模块。

### 参考资源

- [Separation of Concerns](https://en.wikipedia.org/wiki/Separation_of_concerns)

## DRY原则

保持唯一原则，即`DRY`（`Don't repeat yourself `），字面意思来看："不要重复自己"。强调的意思就是在进行编程时相同的代码不要重复写，最好只写一次，然后可以在其他地方直接引用。如此一来，可以提高代码重用率，缩减代码量，同时也有助于提高代码的可读性和可维护性。当需要做出更改时，只需要更改一个地方即可。

每一条知识都必须在系统中具有单一、明确、权威的表示。程序中的每个重要功能都应该在源代码中的一个位置实现。在通过不同的代码片段执行类似的功能的情况下，通过**抽象出变化的部分**将它们组合成一个通常是有益的。

### `Why?`

- 重复（无意或有目的的重复）可能导致维护噩梦，差的因素和逻辑矛盾。
- 对系统的任何单个元素的修改不需要改变其他逻辑上不相关的元素。
- 另外，逻辑上相关的元素都可以预测和统一地改变，因此保持同步。

### `How?`

- 只在一个地方放置业务规则，长表达式，if语句，数学公式，元数据等。
- 确定系统中使用的每一条知识的单一，权威来源，然后使用该源生成该知识的适用实例（代码，文档，测试等）。
- 适用[三条规则](http://en.wikipedia.org/wiki/Rule_of_three_(computer_programming))。

### 参考资源

- [Dont Repeat Yourself](http://c2.com/cgi/wiki?DontRepeatYourself)
- [Don't repeat yourself](http://en.wikipedia.org/wiki/Don't_repeat_yourself)
- [Don't Repeat Yourself](http://programmer.97things.oreilly.com/wiki/index.php/Don't_Repeat_Yourself)

### 参考相关

- [抽象原则](http://en.wikipedia.org/wiki/Abstraction_principle_(computer_programming))
- [Once And Only Once](http://c2.com/cgi/wiki?OnceAndOnlyOnce)是DRY的一个子集（也称为重构的目标）。
- [单一真相来源](http://en.wikipedia.org/wiki/Single_Source_of_Truth)
- 违反DRY是[WET](http://thedailywtf.com/articles/The-WET-Cart)（一切写两次）

## 代码维护者

### `Whay?`

- 到目前为止，维护是任何项目中最昂贵的阶段。

### `How?`

- 把自己当做是代码的维护者。
- 总是编码好像最终维护你的代码的人是一个知道你住在哪里的暴力精神病患者。
- 总是以这样一种方式编码和评论：如果有人在少数几个级别上接受代码，他们会很乐意阅读并从中学习。
- [不要让我思考](http://www.sensible.com/dmmt.html)。
- 使用[最小惊讶原则](http://en.wikipedia.org/wiki/Principle_of_least_astonishment)。

### 参考资源

- [Code For The Maintainer](http://c2.com/cgi/wiki?CodeForTheMaintainer)
- [The Noble Art of Maintenance Programming](http://blog.codinghorror.com/the-noble-art-of-maintenance-programming/)

## 避免过早优化

引用[唐纳德克努特](http://en.wikiquote.org/wiki/Donald_Knuth)：

> 程序员浪费了大量时间来思考或担心程序中非关键部分的速度，而这些效率尝试实际上在考虑调试和维护时会产生很大的负面影响。我们应该忘记小的效率，大约97％的时间说：过早的优化是所有邪恶的根源。然而，我们不应该放弃那个至关重要的3％的机会。

理解什么是“不成熟”并不是“过早”是至关重要的。当系统成熟后，经过大量的使用这时再去进行优化能有更好的效果。太早优化是你不能确定真正能出现问题的关键。

### `Why?`

- 事先不知道瓶颈在哪里，因为系统没有经过大量的运营。没有大量的真实数据，有些系统需要创建大量数据才能进行测试，这是极度浪费时间和精力。
- 优化后，可能更难以阅读并因此维护。优化后的代码可能更复杂，粒度更细，维护成本更好。

### `How?`

- [让它工作正确使它快速](http://c2.com/cgi/wiki?MakeItWorkMakeItRightMakeItFast)，经历过大量的使用，才能知道瓶颈，才能有的放矢。
- 在你真正需要之前不要进行优化，并且只有在进行性能分析后才发现瓶颈才能优化。

### 参考资源

- [Program optimization](http://en.wikipedia.org/wiki/Program_optimization)
- [Premature Optimization](http://c2.com/cgi/wiki?PrematureOptimization)

## 最小化耦合

模块/组件之间的耦合是它们相互依赖的程度，较低的耦合会更好，低耦合的程序移植性更好。换句话说，耦合是代码单元“A”的改变对其他依赖代码单元“A”的破坏和影响，破坏和影响越大，耦合性越高。

### `Why?`

- 一个模块的变化通常会对其他模块的变化产生连锁反应。
- 由于模块间依赖性的增加，模块的组装可能需要更多的精力和时间。
- 特定模块可能更难以重用或测试，因为必须包含依赖模块。
- 开发人员可能**害怕更改代码**，因为他们**不确定**可能会受到什么影响。

### `How?`

- 消除最小化并减少必要关系的复杂关系。
- 通过隐藏实现细节，减少了耦合。
- 应用得[墨忒耳定律](http://java-design-patterns.com/principles/#law-of-demeter)。

### 参考资源

- [耦合](http://en.wikipedia.org/wiki/Coupling_(computer_programming))
- [Coupling And Cohesion](http://c2.com/cgi/wiki?CouplingAndCohesion) 耦合与凝聚力

## 得墨忒耳定律

不要和陌生人说话。不会不需要建立关联的模块发生关联，极大程度降低依赖，不进行任何程序上的交流。

### `Why?`

- 它通常会收紧耦合，大大降低模块间的耦合性
- 它可能会揭示太多的实现细节

### `How?`

对象的方法只能调用以下方法：

1. 对象本身。
2. 方法的一个论点。
3. 在方法中创建的任何对象。
4. 对象的任何直接属性/字段。

### 参考资源

- [得墨忒耳定律](http://en.wikipedia.org/wiki/Law_of_Demeter)
- [得墨忒耳定律不是一个点数运动](http://haacked.com/archive/2009/07/14/law-of-demeter-dot-counting.aspx/)

## 继承的组合

### `Why?`

- 类之间的耦合较少。
- 使用继承，子类很容易做出重写覆盖，并破坏`LSP`。

### `How?`

- 测试`LSP`（可替代性）以决定何时继承。
- 当存在具有或“使用”关系时，才进行继承。

### 参考资源

- [赞成组合而不是继承](http://blogs.msdn.com/b/thalesc/archive/2012/09/05/favor-composition-over-inheritance.aspx)

## 正交

> 正交性的基本思想是，在概念上不相关的事物不应该与系统相关。

来源：[Be Orthogonal](http://www.artima.com/intv/dry3.html)

> 它与简单相关; 设计越正交，异常越少。这使得用编程语言更容易学习，读写程序。正交特征的含义与上下文无关; 关键参数是对称性和一致性。

资料来源：[正交性](http://en.wikipedia.org/wiki/Orthogonality_(programming))

## 稳健性原则

协作服务取决于彼此的接口。通常接口需要进化和升级，这会导致接口另一端接收未指定的数据。如果收到的数据不严格遵循规范，那么不稳健的接收方的实现就会拒绝协作。更复杂的实现仍然会忽略它无法识别的数据。

### `Why?`

- 为了能够发展服务，您需要确保提供商可以进行更改以支持新需求，同时最大限度地减少对现有客户的破坏。

### `How?`

- 将命令或数据发送到其他机器（或同一台机器上的其他程序）的代码应完全符合规范，但只要含义明确，接收输入的代码就应接受不符合要求的输入。

### 参考资源

- [维基百科中的稳健性原则](https://en.wikipedia.org/wiki/Robustness_principle)
- [宽容读者](http://martinfowler.com/bliki/TolerantReader.html)

## 控制反转

控制倒置也被称为好莱坞原则，“不要打电话给我们，我们会打电话给你”。这是一种设计原则，其中计算机程序的定制编写部分从通用框架接收控制流。控制反转带有强烈的内涵，即可重用代码和特定于问题的代码是独立开发的，即使它们在应用程序中一起运行。

### `Why?`

- 控制反转用于增加程序的模块性并使其**可扩展**。
- 将任务的**执行与实现分离**。
- 将模块集中在它所针对的任务上。
- 使模块免于假设其他系统如何做他们所做的事情，而是依赖合同。
- 更换模块时防止副作用。

### `How?`

- 使用工厂模式
- 使用服务定位器模式
- 使用依赖注入
- 使用上下文查找
- 使用模板方法模式
- 使用策略模式

### 参考资源

- [维基百科中的控制反转](https://en.wikipedia.org/wiki/Inversion_of_control)
- [控制容器的反转和依赖注入模式](https://www.martinfowler.com/articles/injection.html)

## 最大化凝聚力

单个模块/组件的凝聚力是其职责构成有意义单元的程度，更高的凝聚力更好。有时候一个功能的代码太分散不便于维护，分散的代码业务不够集中，更改后对影响的地方很难把控。

### `Why?`

- 理解模块的难度增加。
- 维护系统的难度增加，因为域中的逻辑更改会影响多个模块，并且因为一个模块中的更改需要更改相关模块。
- 由于大多数应用程序不需要模块提供的随机操作集，因此增加了重用模块的难度。

### `How?`

- 集体相关的功能共享一个单一的职责（例如在一个班级）。将类似的功能放在一个模块，便于通用或扩展、维护、移植。

### 参考资源

- [凝聚](http://en.wikipedia.org/wiki/Cohesion_(computer_science))
- [耦合与凝聚力](http://c2.com/cgi/wiki?CouplingAndCohesion)

## 利斯科夫替代原则

LSP完全是关于对象的预期行为：程序中的对象应该可以替换其子类型的实例，而不会改变该程序的正确性。

### 参考资源

- [利斯科夫替代原则](http://en.wikipedia.org/wiki/Liskov_substitution_principle)
- [利斯科夫替代原则](http://www.blackwasp.co.uk/lsp.aspx)

## 开放/封闭原则

软件实体（例如类）应该是可以扩展的，但是可以关闭修改。即，这样的实体可以允许在不改变其源代码的情况下修改其行为。

### `Why?`

- 通过最小化对现有代码的更改来提高可维护性和稳定性

### `How?`

- 编写可以扩展的类（与可以修改的类相对）。
- 仅暴露需要更改的移动部件，隐藏其他所有内容。提供可以扩展或覆盖重写实现的方法，其他细节可以保留避免修改。

### 参考资源

- [开放封闭原则](http://en.wikipedia.org/wiki/Open/closed_principle)
- [开放封闭原则](https://8thlight.com/blog/uncle-bob/2014/05/12/TheOpenClosedPrinciple.html)

## 单一责任原则

每个班级都应该承担一个责任，并且该责任应该由班级完全封装。责任可以被定义为改变的理由，因此一个类或模块应该只有一个改变的理由。

### `Why?`

- 可维护性：仅在一个模块或类中需要进行更改。

### `How?`

- 应用[Curly定律](http://java-design-patterns.com/principles/#Curly-s-Law)。

### 参考资源

- [单一责任原则](http://en.wikipedia.org/wiki/Single_responsibility_principle)

## 隐藏实现细节

软件模块通过提供接口隐藏信息（即实现细节），而不泄漏任何不必要的信息。

### `Why?`

- 当实现更改时，使用的接口客户端不必更改。

### `How?`

- 最小化类和成员的可访问性。
- 不要公开公开成员数据。
- 避免将私有实现细节放入类的接口中。
- 减少耦合以隐藏更多实现细节。

### 参考资源

- [信息隐藏](http://en.wikipedia.org/wiki/Information_hiding)

## 卷毛定律：做一件事

卷毛定律是为任何特定的代码选择一个明确定义的目标：做一件事。

- [卷毛定律：做一件事](http://blog.codinghorror.com/curlys-law-do-one-thing/)
- [一个规则或卷曲定律](http://fortyplustwo.com/2008/09/06/the-rule-of-one-or-curlys-law/)

## 封装了哪些变化

一个好的设计可以识别最有可能改变的热点，并将它们封装在API之后。当发生预期的变化时，修改保持在本地。

### `Why?`

- 在发生更改时最小化所需的修改

### `How?`

- 封装API背后不同的概念
- 可能将不同的概念分成它自己的模块

### 参考资源

- [封装变化的概念](http://principles-wiki.net/principles:encapsulate_the_concept_that_varies)
- [封装什么变化](http://blogs.msdn.com/b/steverowe/archive/2007/12/26/encapsulate-what-varies.aspx)
- [信息隐藏](https://en.wikipedia.org/wiki/Information_hiding)

## 接口隔离原则

将臃肿的接口减少为多个更小的、更具体的特定接口。接口应该**更多地依赖于调用它的代码**而**不是实现**它的代码。

### `Why?`

- 如果一个类实现了不需要的方法，则调用者需要知道该类的方法实现。例如，如果一个类实现一个方法但只是抛出，那么调用者将需要知道实际上不应该调用此方法。

### `How?`

- 避免肥胖臃肿的接口，类不应该实现违反[单一责任原则的方法](http://java-design-patterns.com/principles/#single-responsibility-principle)。

### 参考资源

- [界面隔离原理](https://en.wikipedia.org/wiki/Interface_segregation_principle)

## 机会重构原则

我们应该始终保持代码比我们发现的更干净清晰，当发现代码不够清晰、不易看懂，应该立即进行重构调整，避免其他人进行阅读再次浪费大量时间。

### `Why?`

- 在对现有代码库进行更改时，代码质量往往会降低，从而累积技术债务。按照boyscout规则，我们应该注意每次提交的质量。无论多么小，技术债务都会受到持续重构的抵制。

### `How?`

- 每次提交都要确保它不会降低代码库质量。
- 每当有人看到一些不太清晰的代码时，他们应该抓住机会在那里修复它。

### 参考资源

- [机会重构](http://martinfowler.com/bliki/OpportunisticRefactoring.html)

## 命令查询分离

命令查询分离原则指出每个方法应该是执行操作的命令或将数据返回给调用者而不是两者都返回的查询。提出问题不应该修改答案。

应用此原则后，程序员可以更自信地编写代码。查询方法可以在任何地方以任何顺序使用，因为它们不会改变状态。使用命令必须更加小心。

### `Why?`

- 通过将方法明确地分离为查询和命令，程序员可以在不知道每个方法的实现细节的情况下进行编码。

### `How?`

- 将每个方法实现为查询或命令
- 将命名约定应用于方法名称，该方法名称暗示该方法是查询还是命令

资源

- [维基百科中的命令查询分离](https://en.wikipedia.org/wiki/Command%E2%80%93query_separation)
- [Martin Fowler命令查询分离](http://martinfowler.com/bliki/CommandQuerySeparation.html)

## 参考资料

http://java-design-patterns.com/principles/#interface-segregation-principle