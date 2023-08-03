package com.lumen.basic;

public class Armstrong {

	public static void main(String[] args) {
		int n = 151;
		int temp = n;
		int sum = 0;

		while (temp != 0) {
			int r = temp % 10;
			sum =  (int) (sum + Math.pow(r, 3));
			temp = temp / 10;
		}
		if(sum==n)
		{
			System.out.println("Armstrong");
		}
		else {
			System.out.println("not armstrong");
		}

	}

}
