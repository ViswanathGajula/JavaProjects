package com.lumen.basic;

public class Smallest {

	public static void main(String[] args) {
		int [] array = new int [] {25, 11, 7, 75, 56}; 
        int smallest=array[0];
        
        for (int i = 0; i < array.length; i++) {  
              if(array[i] < smallest)  
               smallest = array[i];  
        }
        System.out.println("Smallest number is :"+smallest);
   

	}


	}


