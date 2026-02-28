package com.assignment.string;
import java.util.Scanner;

public class RemoveCharOccurence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your first name: ");
		String s = sc.next();
		
		System.out.print("Enter a letter to remove: ");
		char toRemoveChar = sc.next().charAt(0);
		
		System.out.print("Remove all occurences [yes/no] ?: ");
		boolean isRemoveAll = sc.next().equalsIgnoreCase("yes");

		s = removeOuccurenceOf(toRemoveChar, s, isRemoveAll);
		
		System.out.println("Updated String: " + s);

		sc.close();
	}
	
	public static String removeOuccurenceOf(char ch, String s, boolean isRemoveAll) {
		StringBuilder sb = new StringBuilder();
		
		int i=0;
		int strLen = s.length();
		boolean isFirstRemoved = false;

		for(; i<strLen; i++) {
			char currCh = s.charAt(i);
			if (currCh == ch && !isRemoveAll && !isFirstRemoved) {
				isFirstRemoved = true;
				continue;
			} else if (currCh == ch && isRemoveAll)
				continue;

			sb.append(currCh);
		}

		return sb.toString();
	}
}
