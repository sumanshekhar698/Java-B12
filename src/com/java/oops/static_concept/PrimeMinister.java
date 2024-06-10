package com.java.oops.static_concept;

public class PrimeMinister {//Singelton Pattern

	String name;
	int age;
	private static PrimeMinister pm = null;

	@Override
	public String toString() {
		return "PrimeMinister [name=" + name + ", age=" + age + "]";
	}

	private PrimeMinister(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	synchronized static PrimeMinister electMyPM(String name, int age) {//Only 1 thread can access at a time
		if (pm == null) {
			pm = new PrimeMinister(name, age);
			return pm;
		} else
			return pm;

	}

}
//Thread Pool
//Thread Local
//Future Classes
//Semaphore
//Locks
//Executors
