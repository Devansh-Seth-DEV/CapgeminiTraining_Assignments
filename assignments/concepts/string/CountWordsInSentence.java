package com.assignment.string;
import java.util.Scanner;

public class CountWordsInSentence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter any sentence below:\n");
		String s = sc.nextLine();
		int wordCount = getWordsCount(s);
		
		System.out.println("Words Count: " + wordCount);

		sc.close();
	}
	
	public static int getWordsCount(String s) {
		int count = 0;
		int wordSize = 0;
		
		int strLen = s.length();
		
		for(int i=0; i<strLen; i++) {
			if (s.charAt(i) == ' ' || s.charAt(i) == '\t') {
				if (wordSize>0) count++;
				wordSize = 0;
			} else wordSize++;
		}
		
		if (wordSize>0) count++;
		
		return count;
	}
}
