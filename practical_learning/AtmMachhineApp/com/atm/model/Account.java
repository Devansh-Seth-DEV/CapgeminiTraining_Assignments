package com.atm.model;

public class Account {
	private float amount = 0;
	private String pin = "";
	private static final float EPSILON = 1e-6f;
	
	public Account(float amount, String pin) {
		this.amount = amount;
		if (pin.length() != 4)
			this.pin = "";
		else this.pin = pin;
	}
	
	public Account(String pin) {
		this(0.0f, pin);
	}
	
	public float getBalance() {
		return amount;
	}
	
	public boolean deposite(float amount) {
		if (Math.abs(amount) < EPSILON ||
			amount < -EPSILON) return false;
		this.amount += amount;
		return true;
	}
	
	public boolean withdraw(float amount) {
		if (Math.abs(amount) < EPSILON ||
			amount < -EPSILON ||
			this.amount < amount) return false;
		
		this.amount -= amount;
		return true;
	}
	
	public boolean changePin(String newPin) {
		if (newPin.length() != 4 || pin.equals(newPin))
			return false;
		pin = newPin;
		return true;
	}
	
	public boolean isValidPin(String pin) {
		return this.pin.equals(pin);
	}
}
