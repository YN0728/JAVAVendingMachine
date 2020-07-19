package com.company.exceptions;

public class WrongQuestionAnsweringInput extends RuntimeException {
	public WrongQuestionAnsweringInput() {
	}

	@Override
	public String toString() {
		return "WrongQuestionAnsweringInput{} Answer to question should be y or n";
	}
}
