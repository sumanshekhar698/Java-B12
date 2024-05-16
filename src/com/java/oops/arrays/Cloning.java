package com.java.oops.arrays;

import java.util.Arrays;

public class Cloning {

	public static void main(String[] args) {
		int[] arr = { 32, 43, 54, 45, 665, 7, 9 };

		int[] arr2 = arr;
		arr2[0] = -1;
		System.out.println(arr[0]);
		
		//TODO create a new arr of same size and copy the element via code
		int[] clonedArray = arr.clone();//Only useful for 1D arrays

		System.out.println(Arrays.toString(clonedArray));

	}

}
