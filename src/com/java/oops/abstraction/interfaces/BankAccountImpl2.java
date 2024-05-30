package com.java.oops.abstraction.interfaces;

public class BankAccountImpl2 extends Secured implements BankAcoountInterface, PrivateBank {
	String holderName;
	String bankName;

	String ifscCode;

	public BankAccountImpl2(String holderName, String bankName, String ifscCode) {
		super();
		this.holderName = holderName;
		this.bankName = bankName;
		this.ifscCode = ifscCode;
		this.acNo = (long) (Math.random() * 10000000);
		this.balance = 100;
	}

	@Override
	public String toString() {
		return "BankAccountImpl2 [holderName=" + holderName + ", bankName=" + bankName + ", ifscCode=" + ifscCode
				+ ", acNo=" + acNo + ", balance=" + balance + "]";
	}

	long acNo;
	private long balance;

	public boolean deposit(long amount) {
		if (amount > 0) {
			balance += amount;
			return true;
		} else
			return false;
	}

	public long withdraw(long amount) {
		if (amount <= balance) {
			balance -= amount;
			return amount;
		} else
			return -1L;
	}

}

interface PrivateBank extends GoodBank {

}

interface GoodBank {

}

class Secured {
	boolean isSecure = true;
}
