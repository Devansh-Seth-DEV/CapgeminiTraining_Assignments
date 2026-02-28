package com.atm.transaction;
import java.util.Scanner;
import com.atm.model.*;

public class DepositOption implements TransactionOption {
	@Override
	public String getLabel() { return "Deposite"; }
	
	@Override
	public void execute(Account acc) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the amount to deposite: ");
		float depAmount = sc.nextFloat();
		
		boolean success = acc.deposite(depAmount);
		if (success) {
			System.out.println("Amount deposited successfully!");
			System.out.println("Updated balance: " + acc.getBalance());
		} else {
			System.out.println("Failed: The deposite amount should be valid!");
		}
	}
}
