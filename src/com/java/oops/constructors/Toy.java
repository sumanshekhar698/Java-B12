package com.java.oops.constructors;

public class Toy {

	String name;
	String color;
	float weight;
	boolean isChildSafe;

//	Toy() {
//
//	}

	// not parameterized Explicit constructor
	// A constructor is a special method/fn
	Toy() {// no return type; name is exactly as same as the class Name
//		this("","");
		System.out.println("Toy() constructor called");
	}

	Toy(String name, String color, float weight, boolean isChildSafe) {// parameterized Explicit Constructor

//		System.out.println(this.name);
		this(name, color);// constructor chaining should be the 1st statement
		System.out.println("Toy(String name, String color, float weight, boolean isChildSafe)...");
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.isChildSafe = isChildSafe;// shadow problem
	}

	Toy(String name, String color) {// parameterized Explicit Constructor
		this();
		System.out.println("Toy(String name, String color) called...");
		this.name = name;
		this.color = color;

	}

	Toy giveCurrentObject() {
		System.out.println(this.hashCode());
		return this;//it contains the ref of the current object
	}

}
