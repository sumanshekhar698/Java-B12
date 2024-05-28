package com.java.oops.inheritance;

public class FifaPlayer extends Player {

//	Rules
//	1. A class can have only 1 immediate Parent
//	2. A class can have multiple children [Multiple Inheritance is Not allowed]
//	3. Circular Inheritance is NOT allowed
//	4. Multilevel inheritance is allowed
//	5. private things cannot be inherited
//	6. final methods cannot be overridden
//	7. final classes don't have children and cannot be extended.
	
//	8. static fn also gets inherited
	
	
	

	int goals;
	boolean isGoalKeeper;

	public FifaPlayer(String name, int age, String country, Gender gender, int goals, boolean isGoalKeeper) {
		super(name, age, country, gender);
		this.goals = goals;
		this.isGoalKeeper = isGoalKeeper;
	}

}
