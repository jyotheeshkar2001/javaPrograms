package com.voterapp.service;

import com.voterapp.exception.InValidVoterException;
import com.voterapp.exception.UnderAgeException;

public interface ElectionBooth {
	
	public boolean checkEligibility(int age,String locality,int vid) throws InValidVoterException;

}
