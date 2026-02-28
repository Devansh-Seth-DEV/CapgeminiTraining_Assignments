package com.assignment.array1d;
import java.util.Scanner;

public class FindArrayMax {
	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 5 integers:");
		for(int i=0; i<arr.length; i++) {
			int val = sc.nextInt();
			arr[i] = val;
		}
		sc.close();
		
		printArray(arr);
		
		int arrayMax = getArrayMax(arr);
		System.out.println("Max: " + arrayMax);
	}

	public static void printArray(int[] array) {
		System.out.print("Array: [");
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]);
			System.out.print(i<array.length-1 ? ", " : "");
		}
		System.out.println("]");
	}
	
	public static int getArrayMax(int[] array) {
		int maxIndex = getArrayMaxAt(array);
		return array[maxIndex];
	}
	
	public static int getArrayMaxAt(int[] array) {
		int maxIndex = 0;
		
		for(int i=1; i<array.length; i++) {
			if (array[i] > array[maxIndex])
				maxIndex = i;
		}
		
		return maxIndex;
	}
}