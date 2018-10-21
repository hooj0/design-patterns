package io.github.hooj0.adapter.classmode;

/**
 * adapter class extend BusinessSupport support run method, implement Target support execute method.
 * 适配器对象，继承系统现有的业务类BusinessSupport，利用业务类方法实现run业务。
 * 同时，适配器自己实现Target接口的 execute方法业务。
 * 
 * @author hoojo
 * @createDate 2018年10月21日 下午8:17:29
 * @file Adapter.java
 * @package io.github.hooj0.adapter.classmode
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class Adapter extends BusinessSupport implements Target {

	@Override
	public void run() {
		super.runBusiness();
	}

	@Override
	public void execute() {
		System.out.println("execution adapter business.");
	}
}
