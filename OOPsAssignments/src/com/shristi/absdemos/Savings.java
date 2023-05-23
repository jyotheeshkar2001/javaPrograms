package com.shristi.absdemos;

public class Savings extends Bank {

	public Savings(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
public	void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(amount>0&& amount<=balance)
		{
			balance-=amount;
			System.out.println("withdraw:"+amount);
		}
		else {
			System.out.println("insufficient balance");
		}
	}

	@Override
public	void deposit(double amount) {
		// TODO Auto-generated method stub
		if(amount>0) {
			balance+=amount;
			System.out.println("Deposited amount"+amount);
		}
		else {
			System.out.println("invalid amount");
		}
		
	}

}
