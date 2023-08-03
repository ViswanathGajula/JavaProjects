package com.lumen.fun;

public class MainFun {

	public static void main(String[] args) {
     ShapeFactory shapefactory=new ShapeFactory();
     shapefactory.printArea((x, y) -> {
    	 return (0.5*x*y);
     }, 10, 20);
     shapefactory.printArea((x, y) -> {
    	 return (x*y);
     }, 10, 20);
	
	}

}
