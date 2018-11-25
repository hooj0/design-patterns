package io.github.hooj0.iterator.support;

/**
 * implements collection interface, provide how to create an iterator object.
 * 实现Collection接口，提供Iterator对象的创建方式
 * 
 * @author hoojo
 * @createDate 2018年11月25日 下午8:02:12
 * @file ConcreteCollection.java
 * @package io.github.hooj0.iterator.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class ConcreteCollection<E> implements Collection<E> {

	private E[] elements;
	
	@SuppressWarnings("unchecked")
	public ConcreteCollection() {
		elements = (E[]) new String[] { "a", "b", "c", "e", "f" };
	}
	
	@Override
	public Iterator<E> getIterator() {
		return new ConcreteIterator<>(this);
	}

	@Override
	public int size() {
		return elements.length;
	}

	@Override
	public E get(int index) {
		return elements[index];
	}
}
