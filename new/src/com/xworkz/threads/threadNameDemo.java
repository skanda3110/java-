package com.xworkz.threads;

public class threadNameDemo {

	public static void main(String[] args) {
		System.out.println("before");
		System.out.println("main thread name " +Thread.currentThread().getName());
		
		MyThread mt = new MyThread();
		mt.start();
		System.out.println("child thread name "+mt.getName());
		System.out.println("after");
		Thread.currentThread().setName("sub");
		System.out.println("main thread name " +Thread.currentThread().getName());
		mt.setName("instagram");
	}
}
