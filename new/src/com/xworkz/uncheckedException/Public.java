package com.xworkz.uncheckedException;

public class Public {
public static void main(String[] args) {
	Election election = new Election();
	try {
		election.vote(15);
	} catch (PublicEXc e) {
		// TODO: handle exception
		System.out.println(e);
	}
}
}
