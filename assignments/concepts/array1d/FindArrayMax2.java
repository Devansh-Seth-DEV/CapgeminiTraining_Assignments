package com.assignment.array1d;
import java.util.Scanner;

public class FindArrayMax2 {
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
		
		int arrayMax2 = getArrayMax2(arr);
		System.out.println("Max: " + arrayMax2);
	}

	public static void printArray(int[] array) {
		System.out.print("Array: [");
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]);
			System.out.print(i<array.length-1 ? ", " : "");
		}
		System.out.println("]");
	}
	
	public static int getArrayMax2(int[] array) {
		int maxIndex = getArrayMaxAt(array);
		int maxIndex2 = 0;
		
		for(int i=1; i<array.length; i++) {
			// even if our index i has the value equals to
			// the global max element, then also we'll not going to
			// consider it as 2nd max element
			if (i != maxIndex && array[i] != array[maxIndex] &&
				array[i] > array[maxIndex2])
				maxIndex2 = i;
		}

		return array[maxIndex2];
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
