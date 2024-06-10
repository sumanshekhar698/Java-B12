package com.java.oops.static_concept;

public class PMElection {

	public static void main(String[] args) {

		// Singleton Pattern
//		PrimeMinister pm1 = new PrimeMinister("Mr Modi", 60);//TODO

		PrimeMinister pm1 = PrimeMinister.electMyPM("Mr Modi", 60);
		System.out.println(pm1);

		PrimeMinister pm2 = PrimeMinister.electMyPM("Mr Gandhi", 50);
		System.out.println(pm2);

//		PrimeMinister pm2 = new PrimeMinister("Mr Gandhi", 50);
//		System.out.println(pm2);

	}

}
