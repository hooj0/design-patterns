package io.github.hooj0.iterator.support;

/**
 * concrete implementation of the iterator interface implements all methods in the Iterator interface.
 * 迭代器接口的具体实现，实现Iterator接口中的所有方法
 * 
 * @author hoojo
 * @createDate 2018年11月25日 下午7:56:07
 * @file ConcreteIterator.java
 * @package io.github.hooj0.iterator.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class ConcreteIterator<E> implements Iterator<E> {

	private int position = -1;
	private Collection<E> collection;
	
	public ConcreteIterator(Collection<E> collection) {
		this.collection = collection;
	}
	
	@Override
	public E first() {
		position = 0;
		return collection.get(position);
	}

	@Override
	public E prev() {
		if (position > 0) {
			position--;
		}
		return collection.get(position);
	}

	@Override
	public E next() {
		if (position < collection.size() - 1) {
			position++;
		}
		return collection.get(position);
	}

	@Override
	public boolean hasNext() {
		if (position < collection.size() - 1) {
			return true;
		}
		
		return false;
	}

	@Override
	public E last() {
		position = collection.size() - 1;
		return collection.get(position);
	}
}
