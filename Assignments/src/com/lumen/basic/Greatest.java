package com.lumen.basic;;

public class Greatest {

	public static void main(String[] args) {
        int [] array = new int [] {25, 11, 7, 75, 56}; 
        int greatest=array[0];
        
        for (int i = 0; i < array.length; i++) {  
              if(array[i] > greatest)  
               greatest = array[i];  
        }
        System.out.println("Greatest number is :"+greatest);
   


	}

}
