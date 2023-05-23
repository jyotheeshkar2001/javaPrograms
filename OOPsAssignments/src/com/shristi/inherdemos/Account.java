package com.shristi.inherdemos;

public class Account {
   double balance;

public Account(double balance) {
	super();
	this.balance = balance;
}
   public void withdraw(double amount)
   {
	 if(amount>balance) {
		 System.out.println("insufficient balance");
	 }else {
		 balance-=amount;
		 System.out.println("amount withdrawn:"+amount);
		 System.out.println("current balance"+balance);
	 }
   }
   
   public void deposit(double amount)
   {
	  balance+=amount;
	  System.out.println("amount deposited :"+amount);
	  System.out.println("current balance"+balance);
   }
   public double getBalance()
   {
	   return balance;
   }
}
