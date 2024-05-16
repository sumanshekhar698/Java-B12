package com.java.oops.arrays;

import java.util.Arrays;

public class PassByValAndRef {

	public static void main(String[] args) {
		int arr[] = { 32, 23, 23, 232, 2, 4, 42, 88 };
		int x = 9;//primitive variables
		System.out.println(arr);
		
		
		change(arr, x);//object same addres[pbr], copy[pbv]
		System.out.println(x);//
		System.out.println(arr[0]);//

	}

	static void change(int[] arrrr, int x) {
		System.out.println(arrrr);
		x = 0;
		arrrr[0] = -11;

	}

}
