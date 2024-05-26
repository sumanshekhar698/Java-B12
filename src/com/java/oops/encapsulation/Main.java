package com.java.oops.encapsulation;

public class Main {

	public static void main(String[] args) {

		RafaleFighterJet rafaleFighterJet = new RafaleFighterJet("Dassault", 2.0f, 50000, 4.5f);
		System.out.println(rafaleFighterJet);
//
//		rafaleFighterJet.celingHeightInFeets = -10;
		System.out.println(rafaleFighterJet.getTopSpeedInMach());

		rafaleFighterJet.setTopSpeedInMach(1.8f);
		System.out.println(rafaleFighterJet.getTopSpeedInMach());

//		rafaleFighterJet.speedOfJetInKmph();
//		System.out.println(rafaleFighterJet.celingHeightInFeets);

	}

}
