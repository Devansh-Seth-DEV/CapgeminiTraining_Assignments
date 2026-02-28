package com.assignment.string;
import java.util.Scanner;

public class CountStringCharacterTypes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter you email-id: ");
		String s = sc.next();
		int[] typeCount = getCharacterTypeCount(s);
		String[] types = new String[] {"Vowels",
									  "Consonants",
									  "Numbers",
									  "Special Characters"};
		
		for(int i=0; i<types.length; i++)
			System.out.println(types[i] + "Count: " + typeCount[i]);

		sc.close();
	}
	
	public static int[] getCharacterTypeCount(String s) {
		int[] typeCount = new int[4];
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);

			if (c >= 'A' && c <= 'Z') c |= 32;
			
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				typeCount[0]++;
			else if (c >= 'a' && c <= 'z') typeCount[1]++;
			else if (c >= '0' && c <= '9') typeCount[2]++;
			else typeCount[3]++;
		}
		
		return typeCount;
	}
}
