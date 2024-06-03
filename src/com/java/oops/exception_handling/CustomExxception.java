package com.java.oops.exception_handling;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomExxception {

	public static void main(String[] args) {//

		String email = new Scanner(System.in).nextLine();
		// abc@abc.abc suman@gmail.com

		try {
			validate(email);
		} catch (InvalidEmail e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void validate(String email) throws InvalidEmail {

		String regex = "^(.+)@(\\S+)$";
//		String regex = "";
		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(email);
		boolean isMatching = matcher.matches();

		if (isMatching)
			System.out.println(email + " : " + isMatching);
		else
			throw new InvalidEmail("You mail id is not proper !");

	}

}

class InvalidEmail extends Exception {// 1. Make a child of Exception

	public InvalidEmail(String message) {// 2. Implement a suitable Constructor
		super(message);
	}

}
