package com.assignment.array1d;
import java.util.Scanner;

public class FindArrayElementIndex {
	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter " + arr.length + " integers:");
		for(int i=0; i<arr.length; i++) {
			int val = sc.nextInt();
			arr[i] = val;
		}
		
		printArray(arr);
		
		System.out.print("\nEnter a value to find: ");
		int val = sc.nextInt();
		int index = find(val, arr);
		System.out.println("Index: " + (index < 0 ? "none" : index));
		
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
	
	public static int find(int val, int[] array) {
		for(int i=0; i<array.length; i++) {
			if (array[i] == val) return i;
		}
		return -1;
	}
}