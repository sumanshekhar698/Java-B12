package com.java.oops;

public class Main {

	public static void main(String[] args) {

		Dog d1 = new Dog();
		int x;// loacl variables
//		System.out.println(x);
		System.out.println(d1);//2a139a55 hexadcecimal number
		System.out.println(d1.hashCode());//705927765

		System.out.println(d1.age);
		System.out.println(d1.legs);
		System.out.println(d1.name);

		d1.name = "Zeus";
		d1.age = 15;
		d1.color = "Black";
		d1.species = "Labrador Retriever";
		System.out.println(d1.age);
		System.out.println(d1.legs);
		System.out.println(d1.name);

		d1.bark();
		String d1Name = d1.sayMyDogName();
		System.out.println(d1Name);

		Dog d2 = new Dog();
		Dog d3 = new Dog();
		Dog d4 = new Dog();
		d2.name = "Odin";
		System.out.println(d3.name);
		
		Dog d5 = null;
		d5 = d3;
		d3 = null;
//		System.out.println(d3.name);
		
		System.out.println(d5);
		


	}

}
