package io.github.hooj0.adapter.interfacemode;

/**
 * wrapper abstract class implement business interface
 * 包装器抽象类 实现 Business 接口，空方法体实现接口，允许其他的业务类单独实现每个不同的方法。有利于将分散的业务类整合到一起。
 * 
 * @author hoojo
 * @createDate 2018年10月22日 下午8:38:54
 * @file Wrapper.java
 * @package io.github.hooj0.adapter.interfacemode
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public abstract class Wrapper implements Business {

	@Override
	public void runBusiness() {
	}

	@Override
	public void execBusiness() {
	}
}
