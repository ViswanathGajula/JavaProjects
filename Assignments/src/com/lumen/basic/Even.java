package com.lumen.basic;

public class Even {

	public static void main(String[] args) {
		int number=20;  
		System.out.print("even numbers from 1 to 20: ");  
		for (int i=1; i<=number; i++)   
		{  
			if(i%2==0) {
				System.out.print(" "+i);  

			}
		}
	}

}
