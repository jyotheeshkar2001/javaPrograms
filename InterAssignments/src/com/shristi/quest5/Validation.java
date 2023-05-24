package com.shristi.quest5;

import java.util.function.BiConsumer;

public class Validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "admi";
		int age = 31;

		BiConsumer<String, Integer> biconsumer = (n, a) -> {
			if (name.equals("admin") && age > 30) {
				System.out.println("welcome admin");
			} else {
				System.out.println("wrong user");
			}
		};biconsumer.accept(name, age);

	}

}
