package io.github.hooj0.decorator.support.extend;

/**
 * green tea interface support，implement cost & description method
 * 绿茶接口实现，实现价格和描述方法
 * 
 * @author hoojo
 * @createDate 2018年10月29日 上午11:40:44
 * @file GreenTea.java
 * @package io.github.hooj0.decorator.support.extend
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class GreenTea implements Tea {
	
	@Override
	public int getCost() {
		return 10;
	}

	@Override
	public String getDescription() {
		return "green tea";
	}
}
