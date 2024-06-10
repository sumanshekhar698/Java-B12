package com.java.advance.mutithreading;

import java.util.concurrent.ThreadPoolExecutor;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("START");

		System.out.println(Thread.currentThread());

		Runner t1 = new Runner();// All the thread have priority of 5 [1,10]
		t1.setName("t1");
		t1.setPriority(8);
		t1.start();

		Runner t2 = new Runner();
		t2.setName("t2");
		t2.setPriority(Thread.MAX_PRIORITY);
		t2.start();

		Runner t3 = new Runner();
		t3.setPriority(Thread.MIN_PRIORITY);

		t3.setName("t3");
		t3.start();

		Thread t4 = new Thread(new Work());
		t4.setName("t4");
		t4.start();

		Thread t5 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(i + " | " + Thread.currentThread());
			}

		});
		t5.start();
		

//		for (int i = 0; i < 10; i++) {
//			Thread.sleep(500);
//			System.out.println(i);
//		}

		System.out.println("END");

	}

}
