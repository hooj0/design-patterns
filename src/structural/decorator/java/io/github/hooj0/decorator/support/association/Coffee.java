package io.github.hooj0.decorator.support.association;

/**
 * coffee interface class, defined coffee unsupport method.
 * 定义咖啡接口，提供咖啡价格和咖啡描述方法
 * 
 * @author hoojo
 * @createDate 2018年10月28日 下午11:07:01
 * @file Coffee.java
 * @package io.github.hooj0.decorator.support.association
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public interface Coffee {

	int getCost();
	
	String getDescription();
}
