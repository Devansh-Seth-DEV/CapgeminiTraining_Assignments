package com.assignment.array1d;
import java.util.Scanner;

public class ReverseOddIndexed {
	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter " + arr.length + " integers:");
		for(int i=0; i<arr.length; i++) {
			int val = sc.nextInt();
			arr[i] = val;
		}
		
		printArray(arr);

		reverseOddIndexes(arr);
		System.out.println("Array after reversing odd indexes:");
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
	
	public static void reverseOddIndexes(int[] array) {
		int mid = array.length/2;
		int end = array.length-1;
		
		for(int i=0; i<=mid; i++) {
			if (!iseven(i+1)) swapIndex(i, end-i, array);
		}
	}
	
	public static boolean iseven(int n) {
		return (n&1)==0;
	}
}
