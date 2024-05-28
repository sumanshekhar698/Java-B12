package com.java.oops.inheritance;

public class Player {

	String name;
	int age;
	String country;
	Gender gender;

	public Player(String name, int age, String country, Gender gender) {
//		super();
		this.name = name;
		this.age = age;
		this.country = country;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", age=" + age + ", country=" + country + ", gender=" + gender + "]";
	}

	void sayMyName() {
		System.out.println(name);
	}
	
	final void sayMyAge() {
		System.out.println(age);
	}

	private void gender() {
		System.out.println(gender);
	}

}
