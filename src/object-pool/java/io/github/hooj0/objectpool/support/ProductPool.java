package io.github.hooj0.objectpool.support;

/**
 * product object pool implements AbstractObjectPool class, override create
 * product method. 继承 AbstractObjectPool 实现 create 方法，提供Product对象实例创建方法。
 * 
 * @author hoojo
 * @createDate 2018年10月17日 下午10:17:30
 * @file ProductPool.java
 * @package io.github.hooj0.objectpool.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class ProductPool extends AbstractObjectPool<Product> {

	@Override
	protected Product create() {
		return new Product();
	}
}
