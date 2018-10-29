package io.github.hooj0.decorator.support.extend;

/**
 * chocolate tea decorator interface，implement cost & description method
 * 巧克力装饰模式接口实现，实现补差价价格和描述方法
 * 
 * @author hoojo
 * @createDate 2018年10月29日 下午12:07:41
 * @file ChocolateTeaDecorator.java
 * @package io.github.hooj0.decorator.support.extend
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class ChocolateTeaDecorator extends TeaDecorator {

	public ChocolateTeaDecorator(Tea teaDecorator) {
		super(teaDecorator);
	}

	@Override
	protected int addCost() {
		return 8;
	}

	@Override
	protected String addDescription() {
		return "add chocolate";
	}
}
