package com.java.oops.strings;

public class StringIntro {

	public static void main(String[] args) {

		String str1 = "Apples and Mangoes";// String Literal
		String str2 = "Apples and Mangoes";// String Literal
		String str3 = new String("Apples and Mangoes");
		String str4 = new String("Apples and Mangoes");
		String str5 = "apples and Mangoes";// String Literal
		
		if (str1 == str2) {// == will not check the value of the String
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}

		if (str1 == str3) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
		
		if (str4 == str3) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
		
		
		if (str4.equals(str3)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
		
		if (str5.equalsIgnoreCase(str4)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
	}

}
