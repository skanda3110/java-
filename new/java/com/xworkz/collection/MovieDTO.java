package com.xworkz.collection;

public class MovieDTO {
	
	String name;
	double duration;
	double rating;
	String genre;
	public MovieDTO(String name, double duration, double rating, String genre) {
		super();
		this.name = name;
		this.duration = duration;
		this.rating = rating;
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "MovieDTO [name=" + name + ", duration=" + duration + ", rating=" + rating + ", genre=" + genre + "]";
	}
	
	

}
