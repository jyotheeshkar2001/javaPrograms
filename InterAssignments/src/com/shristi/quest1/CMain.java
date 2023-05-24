package com.shristi.quest1;

public class CMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Calculator calculator=(int x,int y)->{
    	 
    	   System.out.println("addition:"+(x+y));
       };
       calculator.calculate(10, 5);
       
       calculator=(int x,int y)->{
      	 
    	   System.out.println("subtraction:"+(x-y));
       };
       calculator.calculate(10, 5);
       calculator=(int x,int y)->{
      	 
    	   System.out.println("multiplication:"+(x*y));
       };
       calculator.calculate(10, 5);
       calculator=(int x,int y)->{
      	 
    	   System.out.println("division:"+(x/y));
       };
       calculator.calculate(10, 5);
       
	}

}
