package com.userapp.client;

import com.userapp.service.IValidationService;
import com.userapp.service.IValidationServiceImpl;

public class Register {


		public static void main(String[] args)  {

			IValidationService validationService = new IValidationServiceImpl();

	        try {

	            validationService.validateUsername("karthik6699");

	            try {

	                validationService.validatePassword("Kartthikjsfhksajchskja");

	            } catch (Exception e) {

	                System.out.println(e.getMessage());

	                System.out.println("Try again with password length between 6 to 15");

	            }

	        } catch (Exception e) {

	            System.out.println(e.getMessage());

	            System.out.println("Try again with different username.");

	        }

	    }

	 

	
}
