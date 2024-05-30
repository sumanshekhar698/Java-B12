package com.java.oops.abstraction;

public abstract class BankAccountAbstract {//0 to 100%

	String holderName;
	String bankName;

	String ifscCode;
	long acNo;
	public long balance;

	public long getBalance() {//concert method is a method with body
		return balance;
	}

	public BankAccountAbstract(String holderName, String bankName, String ifscCode) {
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

	abstract boolean deposit(long amount);// abstract fn has no body

	abstract long withdraw(long amount);

}
