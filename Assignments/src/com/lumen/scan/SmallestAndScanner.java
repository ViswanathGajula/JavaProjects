package com.lumen.scan;

import java.util.Scanner;

public class SmallestAndScanner {

	public static void main(String[] args) {
		
		
		 Scanner scan = new Scanner(System.in);

		 System.out.println("enter frist number");
		 
         int num1 = scan.nextInt();
         System.out.println("enter second number");
	     int num2=  scan.nextInt();
	     System.out.println("enter third number");
	     int num3=  scan.nextInt();
	     
	     
	     
	     if(num1<  num2 && num1<num2) {
	    	 
	 		System.out.println("a is smaller");
	 		
	     }
	     else if(num2<num3) {
	    	 num2=scan.nextInt();
 		System.out.println("b is smaller");
	 		
	 	}
	     else {
	 		System.out.println("c is smaller");
	     }
	
		
		scan.close();
	}
}

	
	
	


