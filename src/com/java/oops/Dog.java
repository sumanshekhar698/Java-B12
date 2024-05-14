package com.java.oops;

public class Dog {

	// has part --> [instance/object variables]
	String name;//null
	int age ;
	int legs = 4;// 0 
	String species;//null
	String color;//null

//	does --> fn == methods

	void eat(int n) {
		System.out.println("Eating .... " + n + " times");
		return;
	}

	String sayMyDogName() {
		return name;
	}

	void sleep() {
		System.out.println("Sleeping");
	}

	void run() {
		System.out.println("Running");
	}

	void bark() {
		System.out.println("Barking");
	}

}
