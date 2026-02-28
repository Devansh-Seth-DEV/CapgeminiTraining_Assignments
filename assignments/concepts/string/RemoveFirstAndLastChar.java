package com.assignment.string;
import java.util.Scanner;

public class RemoveFirstAndLastChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a sentence below:");
		String s = sc.nextLine();
		s = s.substring(1, s.length()-1);
		
		System.out.println("String after removing first and last character: " + s);

		sc.close();
	}
}
