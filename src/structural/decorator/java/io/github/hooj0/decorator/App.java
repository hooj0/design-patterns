package io.github.hooj0.decorator;

import io.github.hooj0.decorator.support.association.Coffee;
import io.github.hooj0.decorator.support.association.HoneyCoffee;
import io.github.hooj0.decorator.support.association.MilkCoffee;
import io.github.hooj0.decorator.support.association.SimpleCoffee;
import io.github.hooj0.decorator.support.association.VanillaCoffee;
import io.github.hooj0.decorator.support.extend.BlackTea;
import io.github.hooj0.decorator.support.extend.ChocolateTeaDecorator;
import io.github.hooj0.decorator.support.extend.GreenTea;
import io.github.hooj0.decorator.support.extend.MilkTeaDecorator;
import io.github.hooj0.decorator.support.extend.Tea;
import io.github.hooj0.decorator.support.extend.VanillaTeaDecorator;

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
		
		System.out.println("---------------------------------");
		Tea blackTea = new MilkTeaDecorator(new BlackTea());
		System.out.println(blackTea.getCost());	// 15
		System.out.println(blackTea.getDescription()); // black tea, add milk
		
		blackTea = new VanillaTeaDecorator(blackTea);
		System.out.println(blackTea.getCost()); // 18
		System.out.println(blackTea.getDescription()); // black tea, add milk, add vanilla
		
		blackTea = new ChocolateTeaDecorator(blackTea);
		System.out.println(blackTea.getCost()); // 26
		System.out.println(blackTea.getDescription()); // black tea, add milk, add vanilla, add chocolate
		
		Tea greenTea = new VanillaTeaDecorator(new GreenTea());
		System.out.println(greenTea.getCost()); // 13
		System.out.println(greenTea.getDescription()); // green tea, add vanilla
		
		greenTea = new MilkTeaDecorator(greenTea);
		System.out.println(greenTea.getCost()); // 18
		System.out.println(greenTea.getDescription()); // green tea, add vanilla, add milk
		
		blackTea = new ChocolateTeaDecorator(new VanillaTeaDecorator(new GreenTea()));
		System.out.println(blackTea.getCost()); // 21
		System.out.println(blackTea.getDescription()); // green tea, add vanilla, add chocolate
	}
}
