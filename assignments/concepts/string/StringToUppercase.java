package com.assignment.string;
import java.util.Scanner;

public class StringToUppercase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your first-name: ");
		String s = sc.next();
		s = convertToUpper(s);
		
		System.out.println("Uppercased: " + s);

		sc.close();
	}
	
	public static char toupper(char ch) {
		ch &= ~32;
		return ch;
	}
	
	public static String convertToUpper(String s) {
		StringBuilder sb = new StringBuilder(s);

		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'a' && ch <= 'z')
				ch = toupper(ch);
			sb.setCharAt(i, ch);
		}
		
		return sb.toString();
	}
}
