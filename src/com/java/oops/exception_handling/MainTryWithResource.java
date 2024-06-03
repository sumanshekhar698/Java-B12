package com.java.oops.exception_handling;

import java.util.Scanner;

// -> UnChecked
// -> Checked

// catch ? ==> NO

// try catch
// try catch catch catch
//+ finally
// try with resource ++ catch ++ finally
// try finally

public class MainTryWithResource {// Regex Validation input ? valid email

	static int counter = 0;

	public static void main(String[] args) {

		System.out.println("START");
		int arr[] = { 1, 2, 3, 4, 5 };

		try (Scanner scanner = new Scanner(System.in);) {// try with resource JAVA 8 onwards
			int num = scanner.nextInt();
			System.out.println(arr[arr.length / num]);// 5/0 || 7 undefined numbers
			return;
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {// JAVA 8
			e.printStackTrace();
			return;
		} catch (Exception e) {// default catch block should be at the last
			e.printStackTrace();

		}

//		finally {
//			System.out.println("finally !");
//			scanner.close();
//		}

		System.out.println("END");

	}

}
