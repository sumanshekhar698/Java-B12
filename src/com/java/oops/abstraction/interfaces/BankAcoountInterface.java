package com.java.oops.abstraction.interfaces;

public interface BankAcoountInterface {// You cannot have simple concrete methods in an interface

	String REGULATORY_BANK = "RBI";// Any variable you declare is public static final in an interface

	abstract boolean deposit(long amount);

	long withdraw(long amount);

	static String sayRegBody() {// Java 8 onwards your interface can have static and default concrete fn
		return REGULATORY_BANK;
	}

	default void testing() {
		System.out.println("Testing..");
	}

}
