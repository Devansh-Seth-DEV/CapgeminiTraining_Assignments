package com.assignment.string;
import java.util.Scanner;

public class ToggleEvenOddIndexCases {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your first-name: ");
		String s = sc.next();
		s = toggleEvenOddCases(s);
		
		System.out.println("String after Toggling even-odd index cases:\n" + s);

		sc.close();
	}
	
	public static char toupper(char ch) {
		ch &= ~32;
		return ch;
	}
	
	public static char tolower(char ch) {
		ch |= 32;
		return ch;
	}
	
	public static boolean iseven(long n) {
		return (n&1) == 0;
	}
	
	
	public static String toggleEvenOddCases(String s) {
		StringBuilder sb = new StringBuilder(s);

		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			ch = iseven(i+1) ? toupper(ch) : tolower(ch);
			sb.setCharAt(i, ch);
		}
		
		return sb.toString();
	}
}
