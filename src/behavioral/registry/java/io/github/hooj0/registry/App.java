package io.github.hooj0.registry;

import io.github.hooj0.registry.singleton.support.RegistrySingleton;

/**
 * registry design pattern application client
 * @author hoojo
 * @createDate 2019年8月1日 下午4:23:48
 * @file App.java
 * @package io.github.hooj0.registry
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class App {

	public static void main(String[] args) {
		
		System.out.println(RegistrySingleton.newInstance("Web"));
		System.out.println(RegistrySingleton.newInstance("Dao"));
		System.out.println(RegistrySingleton.newInstance("Service"));
		System.out.println(RegistrySingleton.newInstance("Web").getModuleNames());
	}
}
