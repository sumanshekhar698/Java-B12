package com.java.oops.inheritance;

public class Main {

	public static void main(String[] args) {
		IPLPLayer viratKohli = new IPLPLayer("Virat Kohli", 35, "INDIA", Gender.MALE, false, 18, 2378, "RCB");
		System.out.println(viratKohli);
		viratKohli.sayMyName();
//		viratKohli.gender();

	}

}
