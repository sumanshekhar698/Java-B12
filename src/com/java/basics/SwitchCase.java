package com.java.basics;

public class SwitchCase {

	public static void main(String[] args) {

		int x = 12;

		// 1 : Coke
		// 2 : Limca
		// 3 : Maza
		// 4 : Water
		// anything else : Error

		switch (x) {
		case 1:
			System.out.println("Enjoy Coke");
			break;
		case 2:
			System.out.println("Enjoy Limca");
			break;
		case 3:
			System.out.println("Enjoy Maza");
			break;
		case 4:
			System.out.println("Enjoy Water");
			break;
		default:
			System.out.println("ERROR");
			break;
		}

	}

}
