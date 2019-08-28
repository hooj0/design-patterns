package io.github.hooj0.nullobject;

import io.github.hooj0.nullobject.support.NullObject;
import io.github.hooj0.nullobject.support.RealObject;
import io.github.hooj0.nullobject.support.Subject;

/**
 * null object design pattern application client
 * @author hoojo
 * @createDate 2019年8月27日 上午10:49:01
 * @file App.java
 * @package io.github.hooj0.nullobject
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class App {

	public static void main(String[] args) {

		// 传入真实对象实现
		run(new RealObject());

		// 传入空对象实现
		run(new NullObject());
		
		// 会出现空指针异常，或者在run方法中需要检查空值
		run(null);
	}
	
	public static void run(Subject subject) {
		subject.start();
		subject.stop();
	}
}
