package com.shristi.scan;
import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
 String[] username= {"jyotheesh","ram","john"};
 System.out.println("enter username to login");
 String name1=sc.next();
 boolean flag=false;
 for(int i=0;i<username.length;i++)
 {
	  if(username[i].equals(name1))
	  {
		 
		  flag=true;
		  break;
 }
 }
	  if(flag)
	  {
		  System.out.println("you are logged successfully");
	  }
	  else {
		  System.out.println("Invalid username");
	  }
	  
 
}
	}


