package com.atm.transaction;
import java.util.Scanner;
import com.atm.model.*;

public class WithdrawOption implements TransactionOption {
	@Override
	public String getLabel() { return "Withdraw"; }
	
	@Override
	public void execute(Account acc) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the amount to withdraw: ");
		float amount = sc.nextFloat();
		
		boolean success = acc.withdraw(amount);
		if (success) {
			System.out.println("Amount withdraw successfully!");
			System.out.println("Updated balance: " + acc.getBalance());
		} else {
			System.out.println("Failed: Not Enough Balance! or Invalid withdrawl amount");
		}
	}
}