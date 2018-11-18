package io.github.hooj0.chainofresponsibility.pay.support;

/**
 * pay account chain abstract class, defined pay method, build pay chain account
 * 支付链的抽象接口，定义接收下一个支付账户和支付流转的核心方法
 * @author hoojo
 * @createDate 2018年11月17日 下午3:15:21
 * @file Account.java
 * @package io.github.hooj0.chainofresponsibility.pay.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public abstract class Account {

	private int balance;
	protected Account next;
	
	// 接收下一个链条部分
	public Account(Account next, int balance) {
		this.next = next;
		this.balance = balance;
	}
	
	public Account(int balance) {
		this.balance = balance;
	}
	
	// 支付链核心代码，直到支付成功或异常才停止
	public void playHandled(int amount) {
		
		if (this.canPay(amount)) {
			this.balance = balance - amount;
			System.out.println(String.format("Account [%s] pay amount '%s' successful, balance is '%s'.", this.accountType(), amount, balance));
		} else if (this.next != null) {
			this.next.playHandled(amount);
			System.out.println("using next account pay -> " + this.next.accountType());
		} else {
			throw new RuntimeException("None of the accounts have enough balance!");
		}
	}
	
	private boolean canPay(int amount) {
		if (amount <= balance) {
			return true;
		}
		
		return false;
	}
	
	protected abstract String accountType();
}
