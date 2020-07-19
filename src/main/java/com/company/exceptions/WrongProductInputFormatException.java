package com.company.exceptions;

public class WrongProductInputFormatException extends RuntimeException {

	public WrongProductInputFormatException() {
	}

	@Override
	public String toString() {
		return "WrongInputFormatException{}: Format should be A(or B or C):0(or 1 or 2)";
	}
}
