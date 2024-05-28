package com.java.oops.inheritance;

public class IPLPLayer extends Player {

	boolean isAllrounder;
	int jerseyNumber;
	int matchesPlayed;
	String team;

	public IPLPLayer(String name, int age, String country, Gender gender, boolean isAllrounder, int jerseyNumber,
			int matchesPlayed, String team) {
		super(name, age, country, gender);// super --> immediate parent
		this.isAllrounder = isAllrounder;
		this.jerseyNumber = jerseyNumber;
		this.matchesPlayed = matchesPlayed;
		this.team = team;
	}

	@Override
	public String toString() {
		return "IPLPLayer [isAllrounder=" + isAllrounder + ", jerseyNumber=" + jerseyNumber + ", matchesPlayed="
				+ matchesPlayed + ", team=" + team + ", name=" + name + ", age=" + age + ", country=" + country
				+ ", gender=" + gender + "]";
	}

//	sayMyName //inherited methods

	void isAnOldPlayer() {// isAnOldPlayer is a special method to IPLPLayer player
		System.out.println(matchesPlayed > 500 ? "Old" : "Not Old");
	}

	@Override // Method Overriding :: Runtime Polymorphism
	void sayMyName() {
		System.out.println(name + " is a good player");
	}

//	@Override
//	void sayMyAge() {
//		System.out.println(age > 25 ? "Old" : "Young");
//	}

}
