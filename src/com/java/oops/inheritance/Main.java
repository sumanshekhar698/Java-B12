package com.java.oops.inheritance;

public class Main {

	public static void main(String[] args) {
		IPLPLayer viratKohli = new IPLPLayer("Virat Kohli", 35, "INDIA", Gender.MALE, false, 18, 2378, "RCB");
		System.out.println(viratKohli);
		System.out.println(viratKohli.toString());

		viratKohli.sayMyName();
//		viratKohli.gender();

		
//		Casting in Java
		Cub cub = new Cub();
		cub.age = 2;
		cub.isBabyTiger = true;
		cub.stats();

		Tiger tiger1 = cub;// Upcasting and its natural|implicit
		System.out.println(tiger1.isHunter);

		Tiger tiger2 = new Cub();
//		tiger2.age = 2;
//		tiger2.isBabyTiger = true;
//		tiger2.stats();
		tiger2.isHunter();

		// Downcasting

//		Cub cub2 = (Cub) new Tiger();//Downcasting forceful|explicit
//		cub2.stats();

//		>> YOU CAN ONLY DOWNCAST THOSE THINGS WHICH ARE ALREADY UPCASTED
		Cub cub3 = (Cub)tiger1;
		cub3.stats();
		
//		TODO instanceof

	}

}
