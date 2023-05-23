package com.shristi.absdemos;

public abstract class Bank {
	double balance;

	public Bank(double balance) {
		super();
		this.balance = balance;
	}

	abstract void withdraw(double amount);

	abstract void deposit(double amount);

	public double getBalance() {
		return balance;
	}
}
