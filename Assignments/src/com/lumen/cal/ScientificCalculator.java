package com.lumen.cal;

public class ScientificCalculator extends BasicCalculator implements Scientific{

	@Override
	public void sqtr(int x) {
	
		System.out.println("sqtr"+Math.pow(x, 2));
		
	}

	@Override
	public void cube(int x) {
System.out.println("cube"+Math.pow(x, 3));		
	}

}
