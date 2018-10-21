package io.github.hooj0.adapter.classmode;

/**
 * class mode adapter pattern client application
 * 
 * @author hoojo
 * @createDate 2018年10月21日 下午8:21:19
 * @file Client.java
 * @package io.github.hooj0.adapter.classmode
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class Client {

	public static void main(String[] args) {
		// 调用适配器类，直接完成客户端业务
		Target target = new Adapter();
		
		target.execute();
		target.run();
	}
}
