package io.github.hooj0.adapter.objectmode;

/**
 * wrapper class used BusinessSupport implement target run method & custom exec method
 * 包装器对象利用 现有的业务类，完成 target 对象的业务实现，并实现其他业务类没有的方法。
 * 
 * @author hoojo
 * @createDate 2018年10月21日 下午8:25:16
 * @file Wrapper.java
 * @package io.github.hooj0.adapter.objectmode
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class Wrapper implements Target {

	private BusinessSupport support;
	
	public Wrapper(BusinessSupport support) {
		this.support = support;
	}
	
	@Override
	public void run() {
		this.support.runBusiness();
	}

	@Override
	public void execute() {
		System.out.println("execution adapter business.");
	}
}
