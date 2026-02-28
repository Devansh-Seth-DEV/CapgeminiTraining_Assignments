package com.assignment.array1d;
import java.util.Scanner;

public class SwapAdjacentIndex {
	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter " + arr.length + " integers:");
		for(int i=0; i<arr.length; i++) {
			int val = sc.nextInt();
			arr[i] = val;
		}
		
		printArray(arr);

		swapAdjacentIndexes(arr);
		System.out.println("Array after swapping adjacent indexes:");
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
	
	public static void swapAdjacentIndexes(int[] array) {
		int end = array.length-1;
		
		for(int i=0; i<end; i+=2)
			swapIndex(i, i+1, array);
	}
	
	public static boolean iseven(int n) {
		return (n&1)==0;
	}
}
