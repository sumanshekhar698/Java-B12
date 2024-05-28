package com.java.oops.inheritance;

//public class A extends B {
public class A {

	int x = 10;
	int y = 8;

	public static void main(String[] args) {
		C c = new C();
		System.out.println(c.x);
		c.foo();
	}

}

class B extends A {

	int x = 11;

}

class C extends B {

	void foo() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(super.x);
//		System.out.println(super.super.x);
	}

	int x = 12;

}