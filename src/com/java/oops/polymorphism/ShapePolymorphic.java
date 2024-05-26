package com.java.oops.polymorphism;

public class ShapePolymorphic {

	// Make all the methods as same name
//	1. no of parameters
//	2. Type of parameters
//	3. Position of the type of parameter
	
//	* return type does not decide method polymorphism

	
	// 1. Compile Time Polymorphism (Method Overloading)
	// 2. Runtime (Method Overriding)
	int area(int side) {
		return side * side;
	}

	int area(int length, int breadth) {
		return length * breadth;
	}

	double area(double radius) {
		return Math.PI * radius * radius;
	}

	float area(float height, int base) {
		return 0.5f * height * base;
	}

	float area(int base, float height) {
		return height * base;
	}

}
