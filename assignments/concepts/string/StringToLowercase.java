package com.assignment.string;
import java.util.Scanner;

public class StringToLowercase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your first-name: ");
		String s = sc.next();
		s = convertToLower(s);
		
		System.out.println("Lowercased: " + s);

		sc.close();
	}
	
	public static char tolower(char ch) {
		ch |= 32;
		return ch;
	}
	
	public static String convertToLower(String s) {
		StringBuilder sb = new StringBuilder(s);

		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'A' && ch <= 'Z')
				ch = tolower(ch);
			sb.setCharAt(i, ch);
		}
		
		return sb.toString();
	}
}
