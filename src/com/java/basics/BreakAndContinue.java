package com.java.basics;

public class BreakAndContinue {

	public static void main(String[] args) {

		for (int i = 0; i <= 100; i++) {
			if (i % 2 != 0)
				continue;
			System.out.print(i + " ");
		}

		System.out.println();
		
		for (int i = 0; i <= 100; i++) {
			if (i * i > 100)
				break;
			System.out.print(i + " ");
		}

	}

}
