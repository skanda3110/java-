package com.xworkz.collection_demo.linked_list;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
public static void main(String[] args) {
	LinkedList ll = new LinkedList<>();
	
	ll.add('a');
	ll.add('b');
	ll.add('c');
	ll.add('d');
	
	ListIterator li = ll.listIterator();
	
	while (li.hasNext()) {
		System.out.println(li.next());
		
	}
}
}
