package com.java.oops.inheritance;

public class StaticInheritance {

	public static void main(String[] args) {

		Child child = new Child();
		child.foo();
		System.out.println();
		
		child.bar();
		Child.bar();

	}

}

class Parent {

	static void foo() {
		System.out.println("foo");
	}

	static void bar() {
		System.out.println("bar");
	}

}

class Child extends Parent {

//	@Override
	static void foo() {// Method Hiding
		System.out.println("foo000000000000000000");
	}
}

//casting
