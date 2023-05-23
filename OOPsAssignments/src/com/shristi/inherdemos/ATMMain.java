package com.shristi.inherdemos;
import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner scanner=new Scanner(System.in);
   System.out.println("enter initial balance");
   double balance=scanner.nextDouble();
   System.out.println("choose account type (Savings/Current");
   String accountType=scanner.next();
   Account account =null;
   if(accountType.equalsIgnoreCase("Current"))
   {
	   account=new Current(balance);
	   
   }
   else if(accountType.equalsIgnoreCase("Savings"))
   {
	   account=new Savings(balance);
	   
   }else {
	   System.out.println("invalid account");
   }
   double amount;
   boolean exit=false;
   while(!exit)
   {
	   System.out.println("select an option:");
	   System.out.println("1.withdraw");
	   System.out.println("2.deposit");
	   System.out.println("3.checkBalance");
	   System.out.println("4.exit");
	   System.out.println("enter your choice");
	   int choice =scanner.nextInt();
	   switch(choice)
	   {
	   case 1:System.out.println("enter amount to withdraw");
	      amount=scanner.nextDouble();
	      account.withdraw(amount);
	      break;
	   case 2:System.out.println("enter amount to deposit");
	      amount=scanner.nextDouble();
	      account.deposit(amount);
	      break;
	   case 3:System.out.println("current balance:"+account.getBalance());
	      
	      break;
	   case 4:System.out.println("exiting program thank u");
	        return;
	   default:System.out.println("invalid choice.please try again"); 
	      
	   }
   }
	}

}
