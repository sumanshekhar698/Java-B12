package com.java.basics;

public class Conditionals {

	public static void main(String[] args) {

		int x = 100;

		// == Comprison Operators > < >= <= !=
//		if (x <= 0) {\

//		&& Logical And operator     
//		|| Logical OR

//		Shortcuting
		if (x >= 0 && x % 2 == 0) {// boolean
			System.out.println("Even");

		} else {
			System.out.println("Odd");
		}
//		}

//		if (x % 5 == 0) {
//			System.out.println("Divisible by 5");
//		} else if (x % 2 == 0) {
//			System.out.println("Divisible by 2");
//		} else if (x % 10 == 0) {
//			System.out.println("Divisible by 10");
//		} else {
//			System.out.println("END");
//		}

		if (x % 5 == 0) {
			System.out.println("Divisible by 5");
		}
		if (x % 2 == 0) {
			System.out.println("Divisible by 2");
		}
		if (x % 10 == 0) {
			System.out.println("Divisible by 10");
		} else {
			System.out.println("END");
		}

		if (!(x % 2 == 0)) {
			System.out.println("ODD");
		} else {
			System.out.println("Even");
		}

		char ch = 'a';//
		ch = 'A';// Uppercase and LowerCase TODO
		if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u')) {
			System.out.println("Vowel");
		} else {
			System.out.println("Consonant");
		}

	}

}
