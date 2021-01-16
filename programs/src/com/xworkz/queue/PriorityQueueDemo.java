package com.xworkz.queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
public static void main(String[] args) {
	
	PriorityQueue pq = new PriorityQueue<>();
	
	pq.offer('a');
	pq.offer('c');
	pq.offer('b');
	pq.offer('d');
	pq.remove();
	pq.poll();
	System.out.println(pq);
	
	
}
}

