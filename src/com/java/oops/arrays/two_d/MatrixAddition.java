package com.java.oops.arrays.two_d;

public class MatrixAddition {

	public static void main(String[] args) {

		int[][] mat1 = new int[3][2];

		print2Dmatrix(mat1);

		int[][] mat2 = { { 2, 4, 5 }, { 2, 4, -3 } };

		int[][] mat3 = { { 5, 42, 15 }, { 32, 42, -33 } };

		if (mat2.length == mat3.length && mat2[0].length == mat3[0].length) {
			int[][] resMatrix = new int[mat2.length][mat2[0].length];

			for (int i = 0; i < resMatrix.length; i++) {
				for (int j = 0; j < resMatrix[i].length; j++) {
					resMatrix[i][j] = mat2[i][j] + mat3[i][j];

				}
			}
			print2Dmatrix(resMatrix);

		} else {
			System.out.println("Addition not possible");
		}

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
