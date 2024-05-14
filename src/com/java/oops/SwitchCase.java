package com.java.oops;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your drink number ?");
		int x = sc.nextInt();


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
		
		sc.close();
		x = sc.nextInt();

	}

}
