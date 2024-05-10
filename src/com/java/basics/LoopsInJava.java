package com.java.basics;

public class LoopsInJava {

	public static void main(String[] args) {
		// Even no from 1 to 100
//		System.out.println(2);
//		System.out.println(4);// .... 100

//		Loops

//		for loop

//		scope of variables

//		System.out.println(x);
		int x = 9;

		int y;
//		System.out.println(y);
//		int i = 99;
		for (int i = 2; i <= 100; i += 2) {// intialisation;consiution;updational
//			if (i % 2 == 0)
			System.out.print(i + " ");
		}

//		while loop
//		System.out.println(i);

		System.out.println();
		int i = 1;
		while (i <= 100) {
			System.out.print(i + " ");
			i += 2;

		}

		int m = 99;
		do {
			System.out.println("Hey");
		} while (m < 1);
	}

}
