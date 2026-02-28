package com.assignment.string;
import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your first name: ");
		String s = sc.next();
		s = reverseString(s);
		
		System.out.println("Reversed String: " + s);

		sc.close();
	}
	
	public static String reverseString(String s) {
		StringBuilder sb = new StringBuilder(s);
		
		int left = 0;
		int right = s.length()-1;
		
		while (left < right) {
			char temp = sb.charAt(left);
			sb.setCharAt(left, sb.charAt(right));
			sb.setCharAt(right, temp);
			
			left++;
			right--;
		}
		
		return sb.toString();
	}
}
