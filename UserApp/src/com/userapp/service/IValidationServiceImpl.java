package com.userapp.service;

import com.userapp.exception.NameExistException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;

public class IValidationServiceImpl implements IValidationService {

	
	String[] userNames= {"Viswa","nikki","suresh","harsha"};
	@Override
	public boolean validateUsername(String username) throws NameExistException {
		for(String uname:userNames) {
			if(username.equals(uname)) {
				throw new NameExistException("Name already exists");
			}
			}
		
		return true;
	}

	@Override
	public boolean validatePassword(String username) throws TooShortException, TooLongException {
		if(username.length()<4)
		{
			throw new TooShortException("your password is very short");
		}
		if(username.length()>8) {
			throw new TooLongException("your password is more strong");
		}

		return false;
	}

}
