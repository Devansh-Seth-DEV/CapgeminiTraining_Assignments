package com.assignment.string;
import java.util.Scanner;

public class StringCountWhiteSpaces {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a sentence below:");
		String s = sc.nextLine();
		long wspCount = countWhiteSpaces(s);
		
		System.out.println("White Spaces Count: " + wspCount);

		sc.close();
	}
	
	public static long countWhiteSpaces(String s) {
		long count = 0;
		for(int i=0; i<s.length(); i++) {
			if (s.charAt(i) == ' ') count++;
		}
		return count;
	}
}
