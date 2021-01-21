package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MoviesCollection {
	
	public static void main(String[] args) {
		
		MovieDTO movie1 = new MovieDTO("kgf", 2.5, 5.0, "action");
		MovieDTO movie2 = new MovieDTO("kgf2", 2.5, 4.0, "action");
		MovieDTO movie3 = new MovieDTO("kgf", 2.5, 5.0, "action");
		MovieDTO movie4 = new MovieDTO("kgf2", 2.5, 4.0, "action");
		
		Collection<MovieDTO> movie = new ArrayList<>();
		
		movie.add(movie1);
		movie.add(movie2);
		movie.add(movie3);
		movie.add(movie4);
		
		Iterator<MovieDTO> iterator = movie.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
	}

}
