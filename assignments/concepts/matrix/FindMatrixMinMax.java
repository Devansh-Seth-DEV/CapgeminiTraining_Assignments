package com.assignment.matrix;
import java.util.Scanner;

public class FindMatrixMinMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] matrix;
		
		System.out.print("Enter size of matrix (row col): ");
		int rowSize = sc.nextInt();
		int colSize = sc.nextInt();
		matrix = new int[rowSize][colSize];
		
		inputMatrix(matrix, sc);
		
		System.out.println("");
		print2DArr(matrix);
		
		System.out.print("\nMatrix Minimum Element: ");
		int[] minEleIndex = getMatrixMinIndex(matrix);
		if (minEleIndex[0] < 0) System.out.println("None");
		else System.out.println(matrix[minEleIndex[0]][minEleIndex[1]]);

		System.out.print("Matrix Maximum Element: ");
		int[] maxEleIndex = getMatrixMaxIndex(matrix);
		if (maxEleIndex[0] < 0) System.out.println("None");
		else System.out.println(matrix[maxEleIndex[0]][maxEleIndex[1]]);
		
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

	public static int[] getMatrixMinIndex(int[][] matrix) {
		if (matrix == null) return new int[] {-1};
		
		int minRowIdx = 0, minColIdx = 0;

		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				if (matrix[i][j] < matrix[minRowIdx][minColIdx]) {
					minRowIdx = i;
					minColIdx = j;
				}
			}
		}
		
		return new int[] {minRowIdx, minColIdx};
	}
	
	public static int[] getMatrixMaxIndex(int[][] matrix) {
		if (matrix == null) return new int[] {-1};
		
		int maxRowIdx = 0, maxColIdx = 0;

		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				if (matrix[i][j] > matrix[maxRowIdx][maxColIdx]) {
					maxRowIdx = i;
					maxColIdx = j;
				}
			}
		}
		
		return new int[] {maxRowIdx, maxColIdx};
	}
}
