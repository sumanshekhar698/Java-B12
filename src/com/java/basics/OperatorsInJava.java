package com.java.basics;

public class OperatorsInJava {

	public static void main(String[] args) {
		int x = 8;// asingment operator

		// arithmetic operators + - * /
		System.out.println(14 % 4);

		// unary operators
//		x : 9
		System.out.println(x++);// 8 post increment --> 9
		System.out.println(++x);// 10 pre increment --> 10

		x = 100;

		// --x => x = x-1
		System.out.println(--x);// 99
		System.out.println(x--);// 99 ---> 98
		System.out.println(-x--); // --> -98
		System.out.println(x);// 97

		// shorthand operators
		x = 10;
//		x = x * 2;
		x *= 2;
		x += 2;
		System.out.println(x);

		// conditional operators

		// bitwise operator
		System.out.println(8 & 9);
		System.out.println(~8);
		System.out.println(8 ^ 8);
		System.out.println(8 | 6);
		System.out.println(8 << 2);// 8 * 2 *2
		System.out.println(8 >> 1);// 8 / 2

	}

}
