package com.userapp.service;
import java.util.Scanner;

import com.userapp.exception.NameExistException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;

public class Client {

	public static void main(String[] args) throws NameExistException,  TooLongException, TooShortException {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("enter username");
   String Username=sc.next();
   IValidationServiceImpl ivalidation=new IValidationServiceImpl();
   System.out.println(ivalidation.validateUserName(Username));
   
   System.out.println("enter password");
   String password=sc.next();
   System.out.println(ivalidation.validatePassword(password));
   
   
		
	}

}
