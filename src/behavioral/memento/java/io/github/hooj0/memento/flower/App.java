package io.github.hooj0.memento.flower;

import java.util.Stack;

import io.github.hooj0.memento.flower.support.Flower;
import io.github.hooj0.memento.flower.support.FlowerMemento;
import io.github.hooj0.memento.flower.support.FlowerState;

/**
 * memento pattern application client
 * 
 * @author hoojo
 * @createDate 2018年12月2日 下午9:02:11
 * @file App.java
 * @package io.github.hooj0.memento.flower
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class App {

	public static void main(String[] args) {
		Stack<FlowerMemento> states = new Stack<>();
		
		Flower flower = new Flower(FlowerState.BUD, 2, 5);
		
		System.out.println(flower);
		states.add(flower.getMemento());
		flower.blossom();

		System.out.println(flower);
		states.add(flower.getMemento());
		flower.blossom();
		
		System.out.println(flower);
		states.add(flower.getMemento());
		flower.blossom();
		
		System.out.println(flower);
		states.add(flower.getMemento());
		flower.blossom();
		
		while (states.size() > 0) {
			flower.setMemento(states.pop());
			System.out.println(flower);
		}
	}
}
