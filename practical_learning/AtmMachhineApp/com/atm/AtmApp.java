package com.atm;
import java.util.Scanner;

import com.atm.mode.*;
import com.atm.model.*;

public class AtmApp {
	public static void main(String[] args) {
		showMenu();
		exitSystem();
		sc.close();
	}
	
	private static void showMenu() {
		int cardChoice;
		do {
			System.out.println("========= OPTIONS ==========");

			for(int i=0; i<modes.length; i++) {
				System.out.println("[" + (i+1) + "] " + 
								   modes[i].getLabel());
			}

			System.out.println("[" + (modes.length+1) + "] Exit");
			System.out.println("============================");

			System.out.print("\nEnter your choice (e.g 1 or 2): ");
			
			cardChoice = sc.nextInt();
			if (cardChoice < 1 || cardChoice > modes.length+1) {
				System.out.println("Please select a valid option\n");
				continue;
			}
			
			if (cardChoice != modes.length+1)
				modes[cardChoice-1].showMenu(userAcc);
			System.out.println("");
		} while(cardChoice != 3);
	}

	private static void exitSystem() {
		System.out.println("\n===============================");
		System.out.println("Thankyou for using our service!");
		System.out.println("===============================");
	}

	private static Scanner sc = new Scanner(System.in);
	private static Account userAcc = new Account(2000.0f, "1234");

	private static AtmMode []modes = {
		new InsertCardMode(),
		new CardlessMode()
	};
}
