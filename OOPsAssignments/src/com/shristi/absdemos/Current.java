package com.shristi.absdemos;

public class Current extends Bank {

	public Current(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
public	void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(amount>0)
		{
			balance-=amount;
			System.out.println("withdrawn"+amount);
		}else {
			System.out.println("invalid amount");
		}
		
	}

	@Override
public	void deposit(double amount) {
		// TODO Auto-generated method stub
		if(amount>0)
		{
			balance+=amount;
			System.out.println("deposited"+amount);
		}else {
			System.out.println("invalid amount");
		}
		
	}

}
