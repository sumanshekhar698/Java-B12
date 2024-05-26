package com.java.oops;

public class WrapperClasses {

	public static void main(String[] args) {

		int x = 9;// primitive var
		Integer y = new Integer(x);
		System.out.println(y);

		Integer z = x;// Auto Boxing
		System.out.println(z);

		int m = z;// Auto Unboxing

		Character ch = '9';
		//Boolean
		//Float
		//Double

	}

}
