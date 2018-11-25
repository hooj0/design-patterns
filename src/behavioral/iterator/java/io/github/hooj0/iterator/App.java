package io.github.hooj0.iterator;

import io.github.hooj0.iterator.support.Collection;
import io.github.hooj0.iterator.support.ConcreteCollection;
import io.github.hooj0.iterator.support.Iterator;

/**
 * iterator application client
 * 
 * @author hoojo
 * @createDate 2018年11月25日 下午8:17:02
 * @file App.java
 * @package io.github.hooj0.iterator
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class App {

	public static void main(String[] args) {
		Collection<String> collection = new ConcreteCollection<>();
		System.out.println(collection.size());
		System.out.println(collection.get(3));
		
		Iterator<String> iter = collection.getIterator();
		while (iter.hasNext()) {
			System.out.println("next item: " + iter.next());
		}
		
		System.out.println("prev item: " + iter.prev());
		System.out.println("first item: " + iter.first());
		System.out.println("last item: " + iter.last());
	}
}
