package io.github.hooj0.chainofresponsibility.pay.support;

/**
 * bank pay account chain class, extend account 
 * 银行账户支付链
 * 
 * @author hoojo
 * @createDate 2018年11月17日 下午3:35:18
 * @file BankAccount.java
 * @package io.github.hooj0.chainofresponsibility.pay.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class BankAccount extends Account {

	public BankAccount(int balance) {
		super(balance);
	}

	public BankAccount(Account next, int balance) {
		super(next, balance);
	}

	@Override
	public String accountType() {
		return "ICBC BANK";
	}
}
