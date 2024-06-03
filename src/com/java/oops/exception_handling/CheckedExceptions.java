package com.java.oops.exception_handling;

import java.util.Iterator;

public class CheckedExceptions {

	public static void main(String[] args) {

		for (int i = 0; i < 6; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {// checked exception
				e.printStackTrace();
			}
			
			System.out.println(i);
		}

	}

}
