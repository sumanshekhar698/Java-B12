package com.java.oops.abstraction.interfaces.types;

@FunctionalInterface
public interface Bird {// One abstract method --> Functional Interface

	void fly();

	default void eat() {
		System.out.println("eating..");
	}

	static void sleep() {
		System.out.println("sleeping..");
	}

}
