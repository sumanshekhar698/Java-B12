package com.java.oops.exception_handling;

public class ThrowsKeyword {
	
	//DEH

	public static void main(String[] args) throws InterruptedException {// Exception Propagation

		foo1();

	}

	private static void foo1() throws InterruptedException {

		foo2();

	}

	private static void foo2() throws InterruptedException {
		foo3();

	}

	private static void foo3() throws InterruptedException {

//		System.out.println(8/0);
		for (int i = 0; i < 6; i++) {
			Thread.sleep(500);
			System.out.println(i);
		}

	}

}
