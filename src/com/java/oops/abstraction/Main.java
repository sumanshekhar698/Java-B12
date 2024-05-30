package com.java.oops.abstraction;

import com.java.oops.abstraction.interfaces.BankAccountImpl2;
import com.java.oops.abstraction.interfaces.types.Bird;

public class Main {

	public static void main(String[] args) {
		BankAccount ac1 = new BankAccount("Tom", "Royal Bank", "RBS897");
		System.out.println(ac1);
		boolean deposit = ac1.deposit(1000);
		System.out.println(deposit);
		System.out.println(ac1.getBalance());

		System.out.println(ac1.withdraw(50));
		System.out.println(ac1.getBalance());

//		new BankAccountAbstract();//YOU CANNOT CREATE AN OBJECT OF AN ABSTRACT CLASS, INTERFACES DIRECTLY

		BankAccountAbstract bankAcoountIMPL = new BankAcoountIMPL("John", "Royal Bank", "RBS897");// UPCASTING
		System.out.println(bankAcoountIMPL);

		BankAccountAbstract ac4 = new BankAccountAbstract("Jim", "Royal Bank", "RBS897") {// ANNONYMOUS INNER TYPE TODO
																							// try with interfaces

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
		};

		BankAccountImpl2 ac3 = new BankAccountImpl2("Jane", "RBS", "RBS7689");
		System.out.println(ac3);
		System.out.println(BankAccountImpl2.REGULATORY_BANK);
		ac3.testing();

		Bird ostrich = new Bird() {

			@Override
			public void fly() {
				System.out.println("Cannot fly :(");
			}
		};

		Bird eagle = () -> {//Lambda fn | Functional Interface
			System.out.println("Flying very highh..");
		};

	}

}

class Crow implements Bird {

	@Override
	public void fly() {
		System.out.println("Flying at low speed");
	}

}
