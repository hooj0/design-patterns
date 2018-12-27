package io.github.hooj0.templatemethod.support;

/**
 * template method pattern —— drink abstract interface defined.
 * 饮料饮品模板方法类
 * @author hoojo
 * @createDate 2018年12月27日 上午10:18:54
 * @file AbstractDrink.java
 * @package io.github.hooj0.templatemethod.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public abstract class AbstractDrink {

	public void makingBeverages() {
		System.out.println("开始制作饮品：" + this);
		
		this.boilWater();
		this.addRawMaterials();
		this.pourInCup();
		this.addCondiments();
	}
	
	// 烧水
	protected void boilWater() {
		System.out.println("烧开水");
	}
	
	// 加入原料
	protected abstract void addRawMaterials();
	
	// 装入杯子
	protected void pourInCup() {
		System.out.println("装入杯子");
	}
	
	// 添加调味料
	protected abstract void addCondiments();
}
