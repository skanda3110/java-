package com.xworkz.threads;

public class multiThreadDemo {
public static void main(String[] args) {
	MyThread myThread = new MyThread(); //instantiation of thread
	myThread.start();                   
//	 AT HIS POINT THERE ARE 2 THREADS
//	 one is main thread another one is child thread
	for (int i = 0; i < 4; i++) {
		System.out.println(i+" i'm main thread");
	}
	
}
}
//thread scheduler decides the execution of threads

//difference between start and rum method
// start method creates child thread or new thread and run() is a job of thread
// start method is heart of threading
// start method 1. it registers thread with thread scheduler
//              2. all other mandatory activities
//              3. invokes run() method

//overriding of run method is highly recommended
//overriding of start method is not recommended
//can not start a thread which is already started it gives IllegalThreadStateException()


//  Another way of creating thread 
//      Runnable interface  present in java.lang
//     Thread class also implements Runnable interface
//  Runnable interface contains only one method i.e, run() method it is an 
//  abstract method
//   

