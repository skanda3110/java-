package com.xworkz.queue;

import java.util.PriorityQueue;

public class WatchTest {
public static void main(String[] args) {
	
	watch sonata = new watch("sonata", "analog", 999.00);
	watch fasttrack = new watch("fastTrack", "analog", 1999.00);
	watch titan = new watch("titan", "analog", 1500.00);
	watch apple = new watch("apple", "digital", 30000.00);
	
	PriorityQueue<watch> pq = new PriorityQueue<watch>();
	pq.offer(sonata);
	pq.offer(fasttrack);
	pq.offer(titan);
	pq.offer(apple);
	
	for (watch watch : pq) {
		System.out.println(watch);
	}
	
}
}
