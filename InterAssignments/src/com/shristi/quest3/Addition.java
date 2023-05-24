package com.shristi.quest3;

import java.util.function.Consumer;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = 10;
		int number2 = 10;
		Consumer<Integer> addition = (result) -> System.out.println("The addition result is+" + result);
		performAddition(number1, number2, addition);

	}

	public static void performAddition(int number1, int number2, Consumer<Integer> addition) {
		int result = number1 + number2;
		addition.accept(result);
	}

}
