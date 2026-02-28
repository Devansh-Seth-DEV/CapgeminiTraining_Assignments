package com.assignment.string;
import java.util.Scanner;

public class RemoveStringSpaces {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a sentence below:");
		String s = sc.nextLine();
		s = removeWhiteSpaces(s);
		
		System.out.println("String after removing white spaces:\n" + s);

		sc.close();
	}
	
	public static String removeWhiteSpaces(String s) {
		StringBuilder sb = new StringBuilder();
		
		String[] words = s.split(" ");
		for(String word: words)
			sb.append(word);
		
		return sb.toString();
	}
}
