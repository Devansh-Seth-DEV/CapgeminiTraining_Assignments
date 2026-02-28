package com.assignment.string;
import java.util.Scanner;

public class StringTrimWhiteSpaces {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter any sentence with leading/trailing/both spaces:\n");
		String s = sc.nextLine();
		s = s.trim();
		
		System.out.println("String after trim: " + s);

		sc.close();
	}
}
