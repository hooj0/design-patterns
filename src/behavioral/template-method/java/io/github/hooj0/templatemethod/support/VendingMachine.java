package io.github.hooj0.templatemethod.support;

/**
 * template method pattern —— strategy context defined
 * 模板方法 自动售卖机 策略模式上下文切换对象
 * @author hoojo
 * @createDate 2018年12月27日 上午10:36:41
 * @file VendingMachine.java
 * @package io.github.hooj0.templatemethod.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class VendingMachine {

	private AbstractDrink drink;
	
	// 选择品类
	public void chooseDrink(AbstractDrink drink) {
		this.drink = drink;
	}
	
	// 泡饮料
	public void steepDrink() {
		System.out.println("自动售卖机正在泡你要的饮料");
		
		drink.makingBeverages();
	}
}
