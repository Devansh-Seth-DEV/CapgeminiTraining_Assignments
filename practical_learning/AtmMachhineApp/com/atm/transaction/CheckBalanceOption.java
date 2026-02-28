package com.atm.transaction;
import com.atm.model.*;

public class CheckBalanceOption implements TransactionOption {
	@Override
	public String getLabel() { return "Check Balance"; }
	
	@Override
	public void execute(Account acc) {
		System.out.println("Current balance: " + acc.getBalance());
	}
}
