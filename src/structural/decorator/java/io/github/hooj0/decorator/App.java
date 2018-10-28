package io.github.hooj0.decorator;

import io.github.hooj0.decorator.support.association.Coffee;
import io.github.hooj0.decorator.support.association.HoneyCoffee;
import io.github.hooj0.decorator.support.association.MilkCoffee;
import io.github.hooj0.decorator.support.association.SimpleCoffee;
import io.github.hooj0.decorator.support.association.VanillaCoffee;

/**
 * deacorator pattern app client class
 * 
 * @author hoojo
 * @createDate 2018年10月28日 下午2:57:19
 * @file App.java
 * @package io.github.hooj0.decorator
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class App {

	public static void main(String[] args) {

		Coffee coffee = new SimpleCoffee();
		
		MilkCoffee milkCoffee = new MilkCoffee(coffee);
		System.out.println(milkCoffee.getCost()); // 10
		System.out.println(milkCoffee.getDescription()); // ordinary coffe, add milk
		
		VanillaCoffee vanillaCoffee = new VanillaCoffee(milkCoffee);
		System.out.println(vanillaCoffee.getCost()); // 15
		System.out.println(vanillaCoffee.getDescription()); // ordinary coffe, add milk, add vanilla
		
		HoneyCoffee honeyCoffee = new HoneyCoffee(vanillaCoffee);
		System.out.println(honeyCoffee.getCost()); // 18
		System.out.println(honeyCoffee.getDescription()); // ordinary coffe, add milk, add vanilla, add honey

		VanillaCoffee vanillaCoffee2 = new VanillaCoffee(coffee);
		System.out.println(vanillaCoffee2.getCost()); // 13
		System.out.println(vanillaCoffee2.getDescription()); // ordinary coffe, add vanilla
	}
}
