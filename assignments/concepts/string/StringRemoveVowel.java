package com.assignment.string;
import java.util.Scanner;

public class StringRemoveVowel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your full name: ");
		String s = sc.nextLine();
		s = removeVowel(s);
		
		System.out.println("String after removing vowels: " + s);

		sc.close();
	}
	
	public static char tolower(char ch) {
		if (ch >= 'A' && ch <= 'Z')
			ch |= 32;
		return ch;
	}
	
	public static boolean isVowel(char ch) {
		return ch == 'a' || ch == 'e' ||
			   ch == 'i' || ch == 'o' ||
			   ch == 'u';
	}
	
	public static String removeVowel(String s) {
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<s.length(); i++) {
			char ch = tolower(s.charAt(i));
			if (isVowel(ch)) continue;
			sb.append(ch);
		}
		
		return sb.toString();
	}
}
