package io.github.hooj0.decorator.support.extend;

/**
 * abstract tea decorator class implement tea interface method.
 * 茶抽象类装饰器，实现 Tea 接口的方法
 * 
 * @author hoojo
 * @createDate 2018年10月29日 上午11:46:45
 * @file TeaDecorator.java
 * @package io.github.hooj0.decorator.support.extend
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public abstract class TeaDecorator implements Tea {

	protected Tea teaDecorator;
	
	public TeaDecorator(Tea teaDecorator) {
		this.teaDecorator = teaDecorator;
	}

	@Override
	public int getCost() {
		//System.out.println("tea decorator cost: " + this.teaDecorator.getCost());
		
		return this.teaDecorator.getCost() + this.addCost();
	}
	
	@Override
	public String getDescription() {
		//System.out.println("tea decorator desc: " + this.teaDecorator.getDescription());
		
		return this.teaDecorator.getDescription() + ", " + this.addDescription();
	}
	
	protected abstract int addCost();
	
	protected abstract String addDescription();
}
