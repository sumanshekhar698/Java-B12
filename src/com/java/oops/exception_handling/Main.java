package com.java.oops.exception_handling;

import java.util.Scanner;

// catch ? ==> NO

// try catch
// try catch catch catch
//+ finally

public class Main {

	static int counter = 0;

	public static void main(String[] args) {

		System.out.println("START");
		Scanner scanner = new Scanner(System.in);
		int arr[] = { 1, 2, 3, 4, 5 };
		int num = scanner.nextInt();

		try {
			System.out.println(arr[arr.length / num]);// 5/0 || 7 undefined numbers
			return;

		}

//		catch (ArithmeticException e) {
//			e.printStackTrace();
//		} catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
//		} 
		catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {// JAVA 8

			e.printStackTrace();
			System.exit(8);
			return;
		} catch (Exception e) {// default catch block should be at the last
			e.printStackTrace();

		} finally {
			System.out.println("finally !");
			scanner.close();
		}

//		System.out.println(8 / -0.0);// x : x -> 0
		System.out.println("END");
//		foo();

	}

	private static void foo() {
		System.out.println(counter++);
		foo();
	}

}
