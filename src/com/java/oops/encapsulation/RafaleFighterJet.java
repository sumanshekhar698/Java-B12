package com.java.oops.encapsulation;

public class RafaleFighterJet {

	public String company;
	private float topSpeedInMach;
	private int celingHeightInFeets;
	final private float generation;// final with instance vars

	public float getTopSpeedInMach() {
		return topSpeedInMach;
	}

	public int getCelingHeightInFeets() {
		return celingHeightInFeets;
	}

	public void setTopSpeedInMach(float topSpeedInMach) {
		this.topSpeedInMach = topSpeedInMach;
	}

	public RafaleFighterJet(String company, float topSpeedInMach, int celingHeightInFeets, float gen) {
		this.generation = gen;
		this.company = company;
		this.topSpeedInMach = topSpeedInMach;
		this.celingHeightInFeets = celingHeightInFeets;
	}

	private void speedOfJetInKmph() {
		System.out.println(this.topSpeedInMach * 1234.8);
	}

	@Override
	public String toString() {
		speedOfJetInKmph();
		return "RafaleFighterJet [company=" + company + ", topSpeedInMach=" + topSpeedInMach + ", celingHeightInFeets="
				+ celingHeightInFeets + ", generation=" + generation + "]";
	}



}
