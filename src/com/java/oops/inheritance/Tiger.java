package com.java.oops.inheritance;

public class Tiger {

	String place;

	boolean isHunter;

	void isHunter() {
		System.out.println(isHunter);
	}

}

class Cub extends Tiger {

	boolean isBabyTiger;
	int age;

	void stats() {
		System.out.println(age + "|" + isBabyTiger);
	}
}
