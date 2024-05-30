package com.java.oops.abstraction;

public class BankAccount {

	String holderName;
	String bankName;

	String ifscCode;
	long acNo;
	private long balance;

	public long getBalance() {
		return balance;
	}

	public BankAccount(String holderName, String bankName, String ifscCode) {
		super();
		this.holderName = holderName;
		this.bankName = bankName;
		this.ifscCode = ifscCode;
		this.acNo = (long) (10000000l * Math.random());
		balance = 100;
	}

	@Override
	public String toString() {
		return "BankAccount [holderName=" + holderName + ", bankName=" + bankName + ", ifscCode=" + ifscCode + ", acNo="
				+ acNo + ", balance=" + balance + "]";
	}

	boolean deposit(long amount) {
		if (amount > 0) {
			balance += amount;
			return true;
		} else
			return false;
	}

	long withdraw(long amount) {
		if (amount <= balance) {
			balance -= amount;
			return amount;
		} else
			return -1L;
	}

}
