package io.github.hooj0.chainofresponsibility.pay.support;

/**
 * alipay pay account chain class, extend account 
 * 支付宝账户支付链
 * 
 * @author hoojo
 * @createDate 2018年11月17日 下午3:40:01
 * @file AlipayAccount.java
 * @package io.github.hooj0.chainofresponsibility.pay.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class AlipayAccount extends Account {

	public AlipayAccount(Account next, int balance) {
		super(next, balance);
	}

	@Override
	public String accountType() {
		return "alipay";
	}
}
