package io.github.hooj0.iterator.support;

/**
 * collection interface defined get iterator method
 * 聚合类，定义创建Iterator的方法
 *  
 * @author hoojo
 * @createDate 2018年11月25日 下午7:58:19
 * @file Collection.java
 * @package io.github.hooj0.iterator.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public interface Collection<E> {

	public Iterator<E> getIterator();
	
	public int size();
	
	public E get(int index);
}
