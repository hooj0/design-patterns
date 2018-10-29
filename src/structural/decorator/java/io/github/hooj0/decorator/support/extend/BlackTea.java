package io.github.hooj0.decorator.support.extend;

/**
 * black tea interface support，implement cost & description method
 * 红茶接口实现，实现价格和描述方法
 * 
 * @author hoojo
 * @createDate 2018年10月29日 上午11:38:32
 * @file BlackTea.java
 * @package io.github.hooj0.decorator.support.extend
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class BlackTea implements Tea {

	@Override
	public int getCost() {
		return 10;
	}

	@Override
	public String getDescription() {
		return "black tea";
	}
}
