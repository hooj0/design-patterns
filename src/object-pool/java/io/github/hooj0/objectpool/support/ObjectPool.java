package io.github.hooj0.objectpool.support;

import java.util.HashSet;
import java.util.Set;

/**
 * object pool Generic, <T> Type T of Object in the Pool
 * @author hoojo
 * @createDate 2018年10月17日 下午8:54:19
 * @file ObjectPool.java
 * @package io.github.hooj0.objectpool.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public abstract class ObjectPool<T> {

	// 已用对象
	private Set<T> usingObjects = new HashSet<T>();
	// 可用对象
	private Set<T> availableObjects = new HashSet<T>();
	
	// 子类需要实现该方法，提供创建对象的方式
	protected abstract T create();
	
	// 从对象池获取即将使用的对象
	public synchronized T checkOut() {
		// 如果可用对象集合为空，就创建新对象
		if (availableObjects.isEmpty()) {
			availableObjects.add(this.create());
		}
		
		// 从可用对象集合中拿出一个对象
		T instance = availableObjects.iterator().next();
		// 从可用对象集合剔除该对象
		availableObjects.remove(instance);
		// 向已用对象集合添加新对象
		usingObjects.add(instance);
		
		return instance;
	}
	
	// 向对象池投放用完的对象
	public synchronized void checkIn(T instance) {
		if (instance == null) {
			throw new RuntimeException("instance be not null.");
		}
		
		availableObjects.add(instance);
		usingObjects.remove(instance);
	}
}
