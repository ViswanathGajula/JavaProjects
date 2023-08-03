package com.lumen.fun;

public class EmployeeMain {

	public static void main(String[] args) {
		

	        // TODO Auto-generated method stub

	        Employee programmer = new Employee("niketan", "sde");

	        Employee manager = new Employee("karthik", "asistant");

	        Employee director = new Employee("amar", "senior");

	        

	        System.out.println("programmer bonus "+programmer.calcBonus(10000));

	        System.out.println("manager bonus "+manager.calcBonus(233434, 10000));

	        System.out.println("director bonus "+director.calcBonus(2743434, 121210, 121210));

	 

	    }
	}


