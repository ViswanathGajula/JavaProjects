package com.lumen.basic;

public class ReverseArray {

	public static void main(String[] args) {
     int[] array=new int[] {1234,108,657528};
     for(int num:array) {
    	 int reversed=0;
    	 while(num != 0) {
		      int digit = num % 10;
		      reversed = reversed * 10 + digit;
             num /= 10;
		    }

		    System.out.print(reversed);
		    System.out.println(" ");

     }
	}

}
