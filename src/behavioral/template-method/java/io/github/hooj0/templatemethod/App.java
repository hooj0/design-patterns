package io.github.hooj0.templatemethod;

import io.github.hooj0.templatemethod.support.CoffeeDrink;
import io.github.hooj0.templatemethod.support.TeaDrink;
import io.github.hooj0.templatemethod.support.VendingMachine;

/**
 * template method pattern application client
 * @author hoojo
 * @createDate 2018年12月27日 上午10:45:16
 * @file App.java
 * @package io.github.hooj0.templatemethod
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class App {

	public static void main(String[] args) {
		VendingMachine machine = new VendingMachine();
		machine.chooseDrink(new CoffeeDrink());
		machine.steepDrink();
		
		machine.chooseDrink(new TeaDrink());
		machine.steepDrink();
	}
}
