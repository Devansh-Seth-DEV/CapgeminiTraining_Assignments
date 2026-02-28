package com.assignment.matrix;
import java.util.Scanner;

public class Transpose2DArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] matrix;
		
		System.out.print("Enter size of 2D array (row, col): ");
		int rowSize = sc.nextInt();
		int colSize = sc.nextInt();
		matrix = new int[rowSize][colSize];
		
		inputMatrix(matrix, sc);
		
		System.out.println("");
		print2DArr(matrix);
		
		int[][] transMatrix = getMatrixTranspose(matrix);
		
		System.out.println("\nAfter Transpose:");
		print2DArr(transMatrix);
	
		sc.close();
	}

	public static void inputMatrix(int[][] matrix, Scanner sc) {
		System.out.println("Enter matrix elements:");
		int rowSize = matrix.length;
		int colSize = matrix[0].length;
		
		for(int row = 0; row<rowSize; row++) {
			for(int col = 0; col<colSize; col++)
				matrix[row][col] = sc.nextInt();
		}
	}
	
	public static void print2DArr(int[][] matrix) {
		if (matrix == null) {
			System.out.println("Matrix: []");
			return;
		}
		
		int rowSize = matrix.length;
		int colSize = matrix[0].length;
		
		System.out.println("Matrix:");
		for(int row = 0; row < rowSize; row++) {
			System.out.print("[");
			for(int col = 0; col < colSize; col++) {
				System.out.print(matrix[row][col]);
				System.out.print(col < colSize-1 ? " " : "");
			}
			System.out.println("]");
		}
	}
	
	public static int[][] getMatrixTranspose(int[][] matrix) {
		if (matrix==null) return null;

		int rowSize = matrix.length;
		int colSize = matrix[0].length;
		int[][] transMat = new int[colSize][rowSize];
		
		for(int row=0; row<rowSize; row++) {
			for(int col=0; col<colSize; col++)
				transMat[col][row] = matrix[row][col];
		}
		
		return transMat;
	}
}
