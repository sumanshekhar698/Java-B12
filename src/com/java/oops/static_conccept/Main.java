package com.java.oops.static_conccept;

public class Main {

	public static void main(String[] args) {

		System.out.println(Employee.company);
		Employee emp1 = new Employee("Sunny", "Code County", "5", 45);
		Employee emp2 = new Employee("Bunny", "Code County", "4", 32);
		Employee emp3 = new Employee("Honey", "Code County", "9", 26);

		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		
//		emp1.company = "CocaCola";
		Employee.company = "CocaCola";
		System.out.println(emp1.company);
		System.out.println(Employee.company);
		
		System.out.println(Constants.VALUE_OF_A_PI);
		System.out.println(Math.E);
		System.out.println(Employee.noOfEmp());
		

	}

}
