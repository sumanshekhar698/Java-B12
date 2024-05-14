package com.java.oops.strings;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();

		String rev = "";
		StringBuilder sb = new StringBuilder();
		for (int i = word.length() - 1; i >= 0; i--) {
//			rev+=word.charAt(i);
			sb.append(word.charAt(i));
		}
		
		System.out.println(sb);
	}

}
