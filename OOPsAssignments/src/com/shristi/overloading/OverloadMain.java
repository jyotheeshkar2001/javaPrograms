package com.shristi.overloading;
import java.util.Scanner;
public class OverloadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("enter employee name");
      String name=sc.next();
      System.out.println("enter employee designation");
      String designation=sc.next();
      Employee employee1=new Employee(name,designation);
      double bonus=0;
      if(designation.equals("programmer")) {
    	  System.out.println("enter basic allowance");
    	  double basicAllowance=sc.nextDouble();
    	  bonus=employee1.calcBonus(basicAllowance);
      }
      else if(designation.equals("manager"))
      {
    	  System.out.println("enter basic allowance");
    	  double basicAllowance=sc.nextDouble();
    	  System.out.println("enter car allowance");
    	  double carAllowance=sc.nextDouble();
    	  bonus=employee1.calcBonus(basicAllowance,carAllowance);
      }
      else if(designation.equals("director"))
      {
    	  System.out.println("enter basic allowance");
    	  double basicAllowance=sc.nextDouble();
    	  System.out.println("enter car allowance");
    	  double carAllowance=sc.nextDouble();
    	  System.out.println("enter house allowance");
    	  double houseAllowance=sc.nextDouble();
    	  bonus=employee1.calcBonus(basicAllowance,carAllowance,houseAllowance);
      }
      System.out.println(bonus+" "+name+" "+designation);
	}

}
