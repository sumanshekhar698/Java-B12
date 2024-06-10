package com.java.advance.mutithreading;

public class CustomTiming {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("START");
//		System.out.println(Thread.currentThread().getState());

		Thread t5 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(i + " | " + Thread.currentThread() + " | " + Thread.currentThread().getState());
			}

		});
		System.out.println("t5 " + t5.getState());

//		System.out.println(Thread.currentThread().getState());

		t5.start();
		System.out.println("t5 " + t5.getState());

		t5.join();
		System.out.println("t5 " + t5.getState());

		System.out.println("END");
//		System.out.println(Thread.currentThread().getState());
		System.out.println("t5 " + t5.getState());

	}

}
