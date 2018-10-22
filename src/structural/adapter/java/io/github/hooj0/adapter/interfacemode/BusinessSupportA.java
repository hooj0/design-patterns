package io.github.hooj0.adapter.interfacemode;

/**
 * business support class, implement method biz. 
 * 系统有一个业务接口，完成了一定的业务。
 * 
 * @author hoojo
 * @createDate 2018年10月21日 下午8:13:01
 * @file BusinessSupport.java
 * @package io.github.hooj0.adapter.classmode
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class BusinessSupportA extends Wrapper {

	@Override
	public void runBusiness() {
		System.out.println("run business support.");
	}
}
