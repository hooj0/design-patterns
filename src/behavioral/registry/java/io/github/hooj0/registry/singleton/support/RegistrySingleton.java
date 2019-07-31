package io.github.hooj0.registry.singleton.support;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * registry singleton pattern — RegistrySingleton class defined
 * 注册对象模式实现
 * 
 * @author hoojo
 * @createDate 2019年7月31日 下午4:31:00
 * @file RegistrySingleton.java
 * @package io.github.hooj0.registry.singleton.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class RegistrySingleton {

	private static Map<String, RegistrySingleton> registry = new HashMap<>();
	private String moduleName;
	
	private RegistrySingleton() {
	}

	public synchronized static RegistrySingleton newInstance(String moduleName) {
		RegistrySingleton instance = null;
		
		if (registry.containsKey(moduleName)) {
			instance = registry.get(moduleName);
		} else {
			instance = new RegistrySingleton();
			instance.moduleName = moduleName;
			
			registry.put(moduleName, instance);
		}
		
		return instance;
	}

	public String getModuleName() {
		return moduleName;
	}
	
	public Set<String> getModuleNames() {
		return registry.keySet();
	}
	
	public String toString() {
		return "RegistrySingletonn : " + getModuleName();
	}
}
