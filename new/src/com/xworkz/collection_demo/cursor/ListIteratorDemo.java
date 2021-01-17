package com.xworkz.collection_demo.cursor;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
public static void main(String[] args) {
	
	LinkedList<String> li = new LinkedList<String>();
	li.add("a");
	li.add("b");
	li.add("c");
	li.add("d");
	li.add("e");
	
	ListIterator<String> l = li.listIterator();
	
	while (l.hasNext()) {
		String s = l.next();
		if (s.equals("a")) {
			l.remove();
		}
		else if (s.equals("c")) {
			l.add("f");
		}
		else if (s.equals("d")) {
			l.set("cat");
		}
		
	}
	System.out.println(li);
}
}
