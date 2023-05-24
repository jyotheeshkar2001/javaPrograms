package com.userapp.service;

import com.userapp.exception.NameExistException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;

public class IValidationServiceImpl implements IvalidationService {

	@Override
	public boolean validateUserName(String username) throws NameExistException {
		// TODO Auto-generated method stub
		
		String[] usernames= {"john","ram","aadi"};
		for(String uname:usernames)
		{
			if(uname.equals(username)) {
				throw new NameExistException();
			}
		}
		return true;
		
	}

	@Override
	public boolean validatePassword(String password) throws TooShortException, TooLongException {
		// TODO Auto-generated method stub
		if(password.length()<6)
		{
			throw new TooShortException();
		}
		else if(password.length()>15)
		{
			throw new TooLongException();
		}
		else
		return true;
	}
	
	
	

}
