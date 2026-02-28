package com.atm.transaction;
import com.atm.model.Account;

public interface TransactionOption {
	public String getLabel();
	public void execute(Account acc);
}
