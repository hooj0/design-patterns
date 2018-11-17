package io.github.hooj0.chainofresponsibility.pay;

import io.github.hooj0.chainofresponsibility.pay.support.Account;
import io.github.hooj0.chainofresponsibility.pay.support.AlipayAccount;
import io.github.hooj0.chainofresponsibility.pay.support.BankAccount;
import io.github.hooj0.chainofresponsibility.pay.support.BitcoinAccount;

/**
 * chain of responsibility application client
 * 
 * @author hoojo
 * @createDate 2018年11月17日 下午3:46:45
 * @file App.java
 * @package io.github.hooj0.chainofresponsibility.pay
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class App {

	public static void main(String[] args) {

		// 构建一个支付账户的链条
		Account account = new BankAccount(null, 300);
		account = new BitcoinAccount(account, 400);
		account = new AlipayAccount(account, 200);
		
		account.play(350); // Account [Bitcoin] pay amount '350' successful, balance is '50'.
		account.play(130); // Account [alipay] pay amount '130' successful, balance is '70'.
		account.play(240); // Account [ICBC BANK] pay amount '240' successful, balance is '60'.

		/*
		 	Account [Bitcoin] pay amount '350' successful, balance is '50'.
			using next account pay -> Bitcoin
			Account [alipay] pay amount '130' successful, balance is '70'.
			Account [ICBC BANK] pay amount '240' successful, balance is '60'.
			using next account pay -> ICBC BANK
			using next account pay -> Bitcoin
		 */
	}
}
