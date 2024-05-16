package com.java.oops.arrays;

import java.util.Arrays;

public class ArraysUtilMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 32, 43, 54, 45, 665, 7, 9 };
		System.out.println(Arrays.toString(arr));

		// .sort will use Dual Pivot Quick Sort
		Arrays.sort(arr);// Sorting [Bubble Sort, Merge Sort]
		System.out.println(Arrays.toString(arr));

		Arrays.fill(arr, -1);
		System.out.println(Arrays.toString(arr));

		Arrays.fill(arr, 2, arr.length, 100);
		System.out.println(Arrays.toString(arr));

	}

}
