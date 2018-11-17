package io.github.hooj0.chainofresponsibility.pay.support;

/**
 * bank pay account chain class, extend account 
 * 比特币账户支付链
 * 
 * @author hoojo
 * @createDate 2018年11月17日 下午3:38:51
 * @file BitcoinAccount.java
 * @package io.github.hooj0.chainofresponsibility.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class BitcoinAccount extends Account {

	public BitcoinAccount(Account next, int balance) {
		super(next, balance);
	}

	@Override
	public String accountType() {
		return "Bitcoin";
	}
}
