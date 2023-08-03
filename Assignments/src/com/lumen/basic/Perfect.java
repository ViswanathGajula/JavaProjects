package com.lumen.basic;

public class Perfect {

	public static void main(String[] args) {
		int number = 6;
	    int sum = 0;
	    int i = 1;
	    while(i<=number/2)
	    {
	        if(number%i == 0)
	        {
	            sum+=i;
	        }
	        i++;
	        
	    }
	    if(sum == number) {
	        System.out.println("It is Perfect Number");
	    }
	    else 
	    	{
	    	System.out.println("It is not Perfect Number");
	    	}

	}

}
