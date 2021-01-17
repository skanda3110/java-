package com.xworkz.threads;

public class MyRunnable implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 4; i++) {
			System.out.println("I'm child thread");
		}
		
	}

}
