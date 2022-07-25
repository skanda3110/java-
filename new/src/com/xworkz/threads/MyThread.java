package com.xworkz.threads;

public class MyThread extends Thread {

	@Override
	public void run() { // job of thread
		for (int i = 0; i <4; i++) {
			System.out.println(i+" I'm child thread");
		}
		
	}
}
