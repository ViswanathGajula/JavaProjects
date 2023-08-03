package com.userapp.service;

public class MainIValidation {

	public static void main(String[] args) {

		 IValidationServiceImpl ivalimpl=new  IValidationServiceImpl();
		 
		 try {
			 ivalimpl.validateUsername("nikki");
			 ivalimpl.validatePassword("nikki");
			 
		 }
		 catch(Exception e) {
			 System.out.println(e.getMessage());
		 }
	} 

}
