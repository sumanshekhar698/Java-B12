package com.java.oops.exception_handling;

import java.util.Scanner;

public class TryANdFinally {

	public static void main(String[] args) {

//		System.out.println(8 / 0);
		
		
		try(Scanner scanner = new Scanner(System.in);) {
			System.out.println(8 / 0);
		} finally {
			System.out.println("Finally !");
		}
		
		System.out.println("END");
	}

}
