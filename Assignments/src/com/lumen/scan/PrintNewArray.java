package com.lumen.scan;

import java.util.Scanner;

public class PrintNewArray {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Size of the array:-");
		int arraySize=scanner.nextInt();
		int[] array=new int [arraySize];
		
		for(int i=0;i<arraySize;i++) {
			array[i]=scanner.nextInt();
			
		}
		double[] sqtrarray= new double[arraySize];
		for(int i=0;i<arraySize;i++) {
			sqtrarray[i]=Math.sqrt(array[i]);
		}
		for(double num:sqtrarray) {
			System.out.println(num);
		}
		scanner.close();
		
		 
	}

}
