package com.userapp.service;

import com.userapp.exception.NameExistException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;

public interface IValidationService {
	
	 boolean validateUsername(String username) throws NameExistException;
	 boolean validatePassword(String username) throws TooShortException,TooLongException;
	 

}

