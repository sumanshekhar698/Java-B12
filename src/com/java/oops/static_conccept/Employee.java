package com.java.oops.static_conccept;

public class Employee {

	String name;
	static String company = "Demo";// now company is NOT a instance variable; it is a static variable
	String id;
	int age;
	// EMP1 EMP2
	private static long COUNTER = 0;

	{
		System.out.println("Block 1");

	}

	{
		System.out.println("Block 2");

	}

	static {
//		System.out.println(name);
		company = "Dummy";
		System.out.println("Block 3 static");

	}

	static {
		System.out.println("Block 4 static");

	}

	public Employee(String name, String company, String id, int age) {
		System.out.println("Constructor Called");
//		super();
		this.name = name;
		Employee.company = company;
		this.id = "EMP" + ++COUNTER;
		this.age = age;
	}

	void sayMyName() {
		System.out.println(name);
		System.out.println(company);

	}

	static void sayMyCompanyName() {// non static things cannot be accessed directly within static context
//		System.out.println(name);
		System.out.println(company);
	}

	static long noOfEmp() {
		return COUNTER;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", company=" + company + ", id=" + id + ", age=" + age + "]";
	}

}
