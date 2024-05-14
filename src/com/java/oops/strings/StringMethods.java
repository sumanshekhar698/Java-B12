package com.java.oops.strings;

public class StringMethods {

	public static void main(String[] args) {
		// Immutable String

		String str1 = "   Apples and Mangoes ";// String Literal
		String str2 = "Lichi  ";

		System.out.println(str2.concat(" Starwberry"));
		str1 = str1.concat(str2);
		System.out.println(str1);
//		String str2 = "Apples and Mangoes";// String Literal

		System.out.println(str1.length());
		System.out.println(str1.charAt(7));
//		System.out.println(str1);

		str1 = str1.trim();
		str1 = str1.toUpperCase();
		System.out.println(str1);
		String str3 = str1.toLowerCase();
		System.out.println(str3);// ?

		System.out.println(str1.charAt(str1.length() - 1));
		System.out.println(str1.substring(10));
		System.out.println(str1.substring(10, 13));// ending -1
		System.out.println(str1.indexOf('E'));
		System.out.println(str1.lastIndexOf('E'));

		str1.isEmpty();
		String str4 = "";
		str4 = str4.concat("Mickey");
		str4 = str4 + " and";
		System.out.println();
		str4+=" Miney";
		System.out.println(str4);

	}

}
