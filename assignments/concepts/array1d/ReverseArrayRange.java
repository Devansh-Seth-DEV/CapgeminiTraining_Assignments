package com.assignment.array1d;
import java.util.Scanner;

public class ReverseArrayRange {
	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter " + arr.length + " integers:");
		for(int i=0; i<arr.length; i++) {
			int val = sc.nextInt();
			arr[i] = val;
		}
		
		printArray(arr);

		reverseArrayFrom(0, arr.length/2-1, arr);
		System.out.println("Array after reversing first half:");
		printArray(arr);

		reverseArrayFrom(arr.length/2, arr.length-1, arr);
		System.out.println("Array after reversing last half:");
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
	
	public static void reverseArrayFrom(int start, int end, int[] array) {
		int mid = start + (end-start+1)/2;

		for(int i=start; i<=mid; i++)
			swapIndex(i, end-i+start, array);
	}
}
