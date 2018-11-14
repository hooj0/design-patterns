package io.github.hooj0.proxy._static.support;

/**
 * RealSubject class: support ImageLoader interface method
 * `RealSubject`: 真实主题角色，继承或实现抽象主题角色，完成真实业务操作
 * @author hoojo
 * @createDate 2018年11月14日 下午11:02:51
 * @file PhotoImageLoader.java
 * @package io.github.hooj0.proxy._static.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class PhotoImageLoader implements ImageLoader {

	@Override
	public void loader() {
		System.out.println("load HD photo.");
	}
}
