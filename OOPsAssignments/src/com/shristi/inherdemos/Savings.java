package com.shristi.inherdemos;

public class Savings extends Account {

	public Savings(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		double minBalance = 1000;
		if (balance - amount < minBalance) {
			System.out.println(" withdrawl not allowed.minimum balance reached");
		} else {
			super.withdraw(amount);
		}

	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		double maxBalance = 50000;
		if (balance + amount > maxBalance) {
			System.out.println("deposit not possible.maximum limit reached");
		}
		else {
		super.deposit(amount);
	}

}
}
