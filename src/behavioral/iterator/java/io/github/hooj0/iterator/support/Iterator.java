package io.github.hooj0.iterator.support;

/**
 * iterator interface defined
 * 迭代器接口定义
 * 
 * @author hoojo
 * @createDate 2018年11月25日 下午7:51:53
 * @file Iterator.java
 * @package io.github.hooj0.iterator.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public interface Iterator<E> {

	public E first();
	
	public E prev();

	public E next();
	
	public boolean hasNext();
	
	public E last();
}
