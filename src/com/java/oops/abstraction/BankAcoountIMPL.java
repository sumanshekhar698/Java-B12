package com.java.oops.abstraction;

public class BankAcoountIMPL extends BankAccountAbstract {

	public BankAcoountIMPL(String holderName, String bankName, String ifscCode) {
		super(holderName, bankName, ifscCode);
		// TODO Auto-generated constructor stub
	}

	@Override
	boolean deposit(long amount) {
		if (amount > 0) {
			balance += amount;
			return true;
		} else
			return false;
	}

	@Override
	long withdraw(long amount) {
		if (amount <= balance) {
			balance -= amount;
			return amount;
		} else
			return -1L;
	}
}
