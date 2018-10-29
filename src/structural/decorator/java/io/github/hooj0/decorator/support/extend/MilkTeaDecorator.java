package io.github.hooj0.decorator.support.extend;

/**
 * milk tea decorator interface，implement cost & description method
 * 牛奶茶装饰模式接口实现，实现补差价价格和描述方法
 * 
 * @author hoojo
 * @createDate 2018年10月29日 上午11:54:07
 * @file MilkTeaDecorator.java
 * @package io.github.hooj0.decorator.support.extend
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class MilkTeaDecorator extends TeaDecorator {

	public MilkTeaDecorator(Tea teaDecorator) {
		super(teaDecorator);
	}

	@Override
	protected int addCost() {
		return 5;
	}

	@Override
	protected String addDescription() {
		return "add milk";
	}
}
