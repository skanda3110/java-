package com.xworkz.uncheckedException;

public class Election {

	void vote(int age) {
		if (age<18) {
			PublicEXc publicEXc = new PublicEXc();
			throw publicEXc;
		}
		else {
			System.out.println("Thanks for voting...");
		}
	}
}
