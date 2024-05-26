package com.java.oops.polymorphism;

public class Shape {

	int square(int side) {
		return side * side;
	}

	int rectangele(int length, int breadth) {
		return length * breadth;
	}

	double circle(double radius) {
		return Math.PI * radius * radius;
	}

	float traingle(float height, int base) {
		return 0.5f * height * base;
	}

	float parallelogram(float height, int base) {
		return height * base;
	}

}
