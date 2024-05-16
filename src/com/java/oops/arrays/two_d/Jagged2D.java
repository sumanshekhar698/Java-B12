package com.java.oops.arrays.two_d;

public class Jagged2D {

	public static void main(String[] args) {

		int[][] jagged2D = { 
				{ 3, 43, 5, 6 }, 
				{ 2, 4 }, 
				{ 43, 53, 55, 5, 55, 5, 5 } };

		int[][] jaggedCustom = new int[3][];
		jaggedCustom[0] = new int[4];
		jaggedCustom[1] = new int[2];
		jaggedCustom[2] = new int[6];
		
		print2Dmatrix(jaggedCustom);
		
		

	}
	
	private static void print2Dmatrix(int[][] mat1) {
		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat1[i].length; j++) {
				System.out.print(mat1[i][j] + " ");
			}
			System.out.println();
		}

	}

}
