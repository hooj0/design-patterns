package io.github.hooj0.proxy._dynamic.support;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * dynamic proxy factory class, accept interface support biz class, generator biz interface implement class instance
 * 继承或实现抽象主题角色，接收真实主题的引用，并完成真实业务的代理操作 
 * 
 * @author hoojo
 * @createDate 2018年11月15日 下午9:11:41
 * @file LoaderProxyFactory.java
 * @package io.github.hooj0.proxy._dynamic.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class LoaderProxyFactory {

	private Object target;

	public LoaderProxyFactory(Object target) {
		this.target = target;
	}
	
	public Object getProxyInstance() {
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				
				System.out.println("dynamic image loading...");
				Object data = method.invoke(target, args);
				System.out.println("dynamic image load complet!");

				return data;
			}
		});
	}
}
