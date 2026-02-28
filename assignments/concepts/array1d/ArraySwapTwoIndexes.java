package com.assignment.array1d;
import java.util.Scanner;

public class ArraySwapTwoIndexes {
	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter " + arr.length + " integers:");
		for(int i=0; i<arr.length; i++) {
			int val = sc.nextInt();
			arr[i] = val;
		}
		
		printArray(arr);
		
		System.out.print("\nEnter two indexes to swap(0 - " + (arr.length-1) + "): ");
		int indexI = sc.nextInt();
		int indexJ = sc.nextInt();
		swapIndex(indexI, indexJ, arr);
		
		printArray(arr);
		sc.close();
	}
	
	public static void printArray(int[] array) {
		System.out.print("Array: [");

		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]);
			System.out.print(i<array.length-1 ? ", " : "");
		}
		System.out.println("]");
	}
	
	public static void swapIndex(int i, int j, int[] array) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
