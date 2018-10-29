package io.github.hooj0.decorator.support.extend;

/**
 * vanilla tea decorator interface，implement cost & description method
 * 香草装饰模式接口实现，实现补差价价格和描述方法
 * 
 * @author hoojo
 * @createDate 2018年10月29日 下午12:02:04
 * @file VanillaTeaDecorator.java
 * @package io.github.hooj0.decorator.support.extend
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class VanillaTeaDecorator extends TeaDecorator {

	public VanillaTeaDecorator(Tea teaDecorator) {
		super(teaDecorator);
	}

	@Override
	protected int addCost() {
		return 3;
	}

	@Override
	protected String addDescription() {
		return "add vanilla";
	}
}
