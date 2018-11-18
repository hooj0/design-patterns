package io.github.hooj0.chainofresponsibility.pay;

import io.github.hooj0.chainofresponsibility.pay.support.PayChain;

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

		PayChain chain = new PayChain();
		
		chain.pay(350); // Account [Bitcoin] pay amount '350' successful, balance is '50'.
		chain.pay(130); // Account [alipay] pay amount '130' successful, balance is '70'.
		chain.pay(240); // Account [ICBC BANK] pay amount '240' successful, balance is '60'.

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
