package com.xworkz.exception3;

public class AtmException extends Exception {
@Override
public String toString() {
	return "sorry ,your crosing the limit";
}

@Override
	public String getMessage() {
		return "invalid ammount";
	}
}
