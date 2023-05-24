package com.shristi.scan;
import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      String[] name= {"jyotheesh","ram","john"};
      System.out.println("enter name");
      String name1=sc.next();
      boolean flag=false;
      for(int i=0;i<name.length;i++)
      {
    	  if(name[i].equals(name1))
    	  {
    		 //System.out.println("name is not unique");
    		  flag=true;
    		  break;
      }
    	  if(flag)
    	  {
    		  System.out.println("name is not unique");
    	  }
    	  else {
    		  System.out.println("you are registered");
    	  }
    	  
      
	}

}
}
