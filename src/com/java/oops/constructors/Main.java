package com.java.oops.constructors;

public class Main {

	public static void main(String[] args) {

//		Toy toy1 = new Toy();
//		System.out.println(toy1);

		Toy toy2 = new Toy("Doll", "Peach", 250.5f, true);
		System.out.println(toy2.name);

		System.out.println(toy2.hashCode());
		Toy giveCurrentObject = toy2.giveCurrentObject();
		System.out.println(giveCurrentObject.hashCode());

	}

}
