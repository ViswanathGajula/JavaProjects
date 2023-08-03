package com.lumen.basic;

public class ReverseNum {

	public static void main(String[] args) {

		 int num = 1234, reversed = 0;
		    
		    System.out.println("Given Number is: " + num);

		 
		    while(num != 0) {
		      int digit = num % 10;
		      reversed = reversed * 10 + digit;
              num /= 10;
		    }

		    System.out.println("Reverse Number is : " + reversed);
	}

}
