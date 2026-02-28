package com.atm.transaction;
import java.util.Scanner;
import com.atm.model.*;

public class ChangePinOption implements TransactionOption {
	@Override
	public String getLabel() { return "Change Pin"; }
	
	@Override
	public void execute(Account acc) {
		String newPin;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Enter a new 4-digit pin: ");

			Integer intPin = sc.nextInt();
			newPin = intPin.toString();
		
			if (newPin.length() <= 0 || newPin.length() > 4) {
				System.out.println("Please enter a valid 4-digit pin!");
			}
		} while(newPin.length() != 4);
		
		System.out.print("Confirm the changes (e.g y or n): ");
		char confirmChoice = sc.next().toLowerCase()
							   .charAt(0);
		
		if (confirmChoice == 'y') {
			boolean success = acc.changePin(newPin);
			if (success)
				System.out.println("Pin changed successfully!");
			else
				System.out.println("Failed: Invalid Pin!");
		} else {
			System.out.println("Changing pin action has been cancelled!");
		}
	}
}
