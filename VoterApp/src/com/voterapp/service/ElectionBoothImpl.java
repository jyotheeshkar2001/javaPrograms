package com.voterapp.service;

import com.voterapp.exception.InValidVoterException;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NoVoterIDException;
import com.voterapp.exception.UnderAgeException;

public class ElectionBoothImpl implements ElectionBooth {
	String[] localities= {"ban","hyd","chennai","vizag"};

	@Override
	public boolean checkEligibility(int age, String locality, int vid) throws InValidVoterException {
		
		// TODO Auto-generated method stub
		if(checkAge(age))
		{
			if(checkLocality(locality))
			{
				if(checkVoterId(vid))
				{
					return true;
				}else {
					return false;
				}
				
			}
			else {
				return false;
			}
		}else {
			return false;
		}
		
	}
	private boolean checkAge(int age) throws UnderAgeException
	{
		if(age<18)
		{
			throw new UnderAgeException("under age");
		}
		return true;
		
	}
	private boolean checkLocality(String locality) throws LocalityNotFoundException {
		int count=0;
       
		for(String location:localities)
		{
			if(locality.equals(location)) {
				count++;
			}
		}
		if(count==0)
		{
			throw new LocalityNotFoundException("locality not found");
		}
       return true;
    }

    private boolean checkVoterId(int vid) throws NoVoterIDException {
    	if(vid >= 1000 && vid <= 9999)
    	
        return true;
        else {
        	throw new NoVoterIDException("no voterid");
        }
    }

}
