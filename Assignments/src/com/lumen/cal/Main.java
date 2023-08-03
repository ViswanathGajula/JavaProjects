package com.lumen.cal;

public class Main {
	public static void main(String[] args) {
		Calculator calcul=new BasicCalculator();
		calcul.add(10,20);
		calcul.product(2,3);
		calcul.difference(20, 4);
		Scientific scientific=new ScientificCalculator();
		scientific.sqtr(5);
		scientific.cube(4);
		scientific.add(10,20);
		scientific.product(2, 6);
	}

}