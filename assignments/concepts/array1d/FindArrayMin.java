package com.assignment.array1d;
import java.util.Scanner;

public class FindArrayMin {
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
		
		int arrayMin = getArrayMin(arr);
		System.out.println("Min: " + arrayMin);
	}

	public static void printArray(int[] array) {
		System.out.print("Array: [");
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]);
			System.out.print(i<array.length-1 ? ", " : "");
		}
		System.out.println("]");
	}
	
	public static int getArrayMin(int[] array) {
		int minIndex = getArrayMinAt(array);
		return array[minIndex];
	}
	
	public static int getArrayMinAt(int[] array) {
		int minIndex = 0;
		
		for(int i=1; i<array.length; i++) {
			if (array[i] < array[minIndex])
				minIndex = i;
		}
		
		return minIndex;
	}
}
