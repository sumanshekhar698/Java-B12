package com.java.oops.arrays;

import java.util.Arrays;

public class VarArgs {

	public static void main(String ... suman) {// var args

		foo("Hey", 5, 45, 5, 5, 5, 45, 5, 54, 56);
		System.out.println(suman.length);
		System.out.println(Arrays.toString(suman));


	}

	private static void foo(String str, int... numArr) {// variable Arguments should be the last parameter
		System.out.println(Arrays.toString(numArr));

	}

}
