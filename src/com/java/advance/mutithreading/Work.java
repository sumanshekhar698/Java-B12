package com.java.advance.mutithreading;

public class Work implements Runnable {//2.

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i + " | " + Thread.currentThread());
		}

	}

}
