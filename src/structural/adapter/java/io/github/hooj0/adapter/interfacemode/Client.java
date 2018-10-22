package io.github.hooj0.adapter.interfacemode;

/**
 * interface mode adapter pattern client application
 * @author hoojo
 * @createDate 2018年10月22日 下午8:42:35
 * @file Client.java
 * @package io.github.hooj0.adapter.interfacemode
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class Client {

	public static void main(String[] args) {
		// 利用现有业务类调用需要的方法
		Business business1 = new BusinessSupportA();
		business1.runBusiness();
		business1.execBusiness();
		
		Business business2 = new BusinessSupportB();
		business2.runBusiness();
		business2.execBusiness();
	}
}
