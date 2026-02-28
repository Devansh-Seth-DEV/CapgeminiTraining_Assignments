package com.assignment.string;
import java.util.Scanner;

public class CheckPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter any string: ");
		String s = sc.next();
		boolean isPalin = isPalindrome(s);
		
		System.out.println("Is Palindrome: " + 
						   (isPalin ? "True" : "False"));

		sc.close();
	}
	
	public static boolean isPalindrome(String s) {
		int left = 0;
		int right = s.length()-1;
		
		while (left < right) {
			char leftChar = s.charAt(left);
			char rightChar = s.charAt(right);

			if (leftChar != rightChar) return false;
			
			left++;
			right--;
		}
		
		return true;
	}
}
