package com.xworkz.uncheckedException;

public class PublicEXc extends RuntimeException {

	@Override
	public String toString() {
		
		return "you are not eligible to vote";
	}
}
