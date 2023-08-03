package com.lumen.objbasics;

public class StudentMain {
	public static void main(String[] args) {
		Student student=new Student("viswanath","cse");
		Student student1=new Student("nikki","ece");
		Student student2=new Student("karthik","eee");
		
		student.printDetails();
		student.getDetails(40,40,20);
		student1.printDetails();
		student.getDetails(40,40,10);
		student2.printDetails();
		student.getDetails(40,40,30);

		
		
	}

}
