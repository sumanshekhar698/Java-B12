package com.java.oops.arrays;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {

		int[] arr = { 32, 43, 54, 45, 665, 7, 9 };
		System.out.println(Arrays.toString(arr));

		// empty array [arr.length]
		// for loop reverse
		// empty array store

//		int[] dummy = new int[arr.length];// extra space
//		for (int i = arr.length - 1, j = 0; i >= 0; i--) {
//			dummy[j++] = arr[i];
//		}
//
//		for (int j = 0; j < arr.length - 1; j++) {
//			arr[j] = dummy[j];
//		}

//		Double Pointer

		int i = 0, j = arr.length - 1;

		//DSA
		while (i <= j) {// len/2

			// swap
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;

			// loop updation
			i++;
			j--;

		}

		System.out.println(Arrays.toString(arr));

	}

}
