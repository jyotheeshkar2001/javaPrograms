package com.shristi.scan;

public class Longest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "my name is Jyotheesh";
		String[] c = s.split(" ");
		String LongestWord = "";
		for (String words : c) {
			if (words.length() > LongestWord.length()) {
				LongestWord = words;
			}
		}
		System.out.println("longest word:"+LongestWord);

		
	}

}
