package com.xworkz.uncheckedExcepyion4;

import java.util.Scanner;

public class Password {
static void password(User user) {
	System.out.println("Enter the password:");
	
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	if (s.equals(user.Password)) {
		System.out.println("Loged in successfully");
	}
	else {
		throw new PasswordWrongException("wrong password... ");
	}
}
}
