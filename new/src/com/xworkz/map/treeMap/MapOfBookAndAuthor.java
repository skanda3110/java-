package com.xworkz.map.treeMap;

import java.util.Map;
import java.util.TreeMap;

public class MapOfBookAndAuthor {

	public static void main(String[] args) {
		Book b1 = new Book("Curse Of clown fish" , 250.0);
		Book b2 = new Book("modern history", 300.0);
		Book b3 = new Book("winges of fire", 500.0);
		Book b4 = new Book("harry Potter", 700.0);
		Book b5 = new Book("kannuru heggadathi", 600.0);
		
		Author a1 = new Author("Subhash");
		Author a2 = new Author("Bipin Chandr");
		Author a3 = new Author("APJ Abdul Kalam");
	    Author a4 = new Author("JK Rowling");
	    Author a5 = new Author("Kuvempu");
	    
	    TreeMap<Book, Author> tm = new TreeMap<>();
	    tm.put(b1, a1);
	    tm.put(b2, a2);
	    tm.put(b3, a3);
	    tm.put(b4, a4);
	    tm.put(b5, a5);
	    
	   for (Map.Entry<Book, Author> entry : tm.entrySet()) {
		Book book = entry.getKey();
		Author author = entry.getValue();
		System.out.println(book.name +": "+book.price+": "+author.name);
		
	}
	    
	}
}
