package com.xworkz.threads;

public class RunnableDemo {

	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
//		Thread t1 = new Thread();
		Thread thread = new Thread(myRunnable);
		thread.start();
//		t1.start();
		
		for (int i = 0; i < 4; i++) {
			System.out.println("main thread");
			
		}
	}
}
