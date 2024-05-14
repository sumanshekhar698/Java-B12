package com.java.oops.strings.mutable;

public class Main {

	public static void main(String[] args) {// TODO WAP to check if a String is Palindrome ie. madam, dad, rAdaR
//		CASE INSENSITIVE

		// Mutable Strings | changing the string too many times
		StringBuilder sb = new StringBuilder(" Hey ");// single thread
		sb.append("How are");
		sb.append("You");
		System.out.println(sb);

		sb.reverse();
		System.out.println(sb);

		sb.insert(3, "9999");
		System.out.println(sb);

		StringBuffer sbuf = new StringBuffer("apple");// multi thread
		String str = "Apple";

		if (str.equalsIgnoreCase(sbuf.toString())) {
			System.out.println(true);

		}

	}

}
