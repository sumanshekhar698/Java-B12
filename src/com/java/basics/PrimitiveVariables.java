package com.java.basics;

public class PrimitiveVariables {
//MTT
	public static void main(String[] args) {

//		[]-2 ^ n-1]  to [2 ^n-1]    - 1   ==> Range Formula

//		TODO write the range of each of the 4 integer data type in a numercal format

//		1. integers
		byte a = 127;// 1bytes = 8bits
		short b = 989;// 2 bytes = 16 bits
		int c = 9867;// 4 bytes
		long d = 8675890;// 8 bytes
		long phoneNumber = 9006567388L;//2s complement

//		2. decimals
		float pi = 3.14159f;// 4 bytes = 32 bits
		double piValue = 3.14159;// 64 bits

//		3. char
		char ch = 'a';
		System.out.println((int) ch);
		
//		4. boolean
		boolean isJavaEasy = true;//1 bit
		
		int x = 78997;
//		short sh  = x;
		
		float fl = phoneNumber;//IEEE format
//		long sh  = x;
//		System.out.println(sh);
		
		
		/* Decimal Numbers : 10 symbols  [0 to 9]
		 * Octal : 8 symbols [0  to 7]
		 * Hexadecimal : 16 symbols [0 to 9 U A to F]
		 * Binary : 2 symbols [0 and 1]
		 * 
		 * */
		
//		TODO
		int oct = 05363;//0 octal
		System.out.println(oct);//2803
		
		int binary = 0b101010;//0B stands for binary
		System.out.println(binary);
		
		long hexadecimal = 0X9708AB;//0X stands for hex
		System.out.println(hexadecimal);
		
		
		

	}

}
