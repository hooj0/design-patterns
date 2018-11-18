package io.github.hooj0.chainofresponsibility.pay.support;

/**
 * account payment order responsibility chain
 * 账户支付顺序职责链条
 * @author hoojo
 * @createDate 2018年11月18日 上午10:07:39
 * @file PayChain.java
 * @package io.github.hooj0.chainofresponsibility.pay.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class PayChain {

	private Account chain;
	
	public PayChain() {
		chain = chainBuider();
	}
	
	// 构建一个支付账户的链条
	private Account chainBuider() {
		Account account = new BankAccount(300);
		account = new BitcoinAccount(account, 400);
		account = new AlipayAccount(account, 200);
		
		return account;
	}
	
	public void pay(int amount) {
		chain.playHandled(amount);
	}
}
