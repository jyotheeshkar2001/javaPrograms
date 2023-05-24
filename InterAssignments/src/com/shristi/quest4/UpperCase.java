package com.shristi.quest4;

import java.util.function.Supplier;

public class UpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "hello world";
		Supplier<String> upperCase = () -> input.toUpperCase();

		
		System.out.println("Uppercase result: " + upperCase.get());
	}



}
