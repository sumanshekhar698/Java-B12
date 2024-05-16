package com.java.oops.arrays;

public class ArrayIntroOneD {

	public static void main(String[] args) {

		int[] intArr = new int[5];

		System.out.println(intArr);// an array is also an object
		// after intialisation array contains default values of the type

		System.out.println(intArr.length);
		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}

//		int j = 0;
		for (int i = 2, j = 0; j < intArr.length; i += 2) {
			intArr[j++] = i;
		}

		System.out.println();
		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}

	}

}
