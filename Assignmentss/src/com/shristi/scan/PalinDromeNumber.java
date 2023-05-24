package com.shristi.scan;

public class PalinDromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 323;
		int number1 = number;
		int sum = 0;
		while (number > 0) {
			int last = number % 10;
			sum = sum * 10 + last;
			number = number / 10;
		}
		if (sum == number1) {
			System.out.println("palindrome number");
		} else {
			System.out.println("not a palindrome number");
		}
		
		
		
		
		
	
	}

}
