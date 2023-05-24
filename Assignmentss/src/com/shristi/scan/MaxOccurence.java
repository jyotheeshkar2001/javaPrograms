package com.shristi.scan;

public class MaxOccurence {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		String s = "jyotheesh";

		char[] c = s.toCharArray();
		int[] a = new int[c.length];
		for (int i = 0; i < c.length; i++) {
			int count = 0;
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] == c[j]) {
					count++;
					c[j] = (char) -1;
				}
			}
			a[i] = count;
		}

		int max = 1;
		int m = 0;

		for (int i = 0; i < c.length; i++) {
			if (c[i] != -1 && a[i] > max) {
				max = a[i];

			}
		}

		for (int k = 0; k < a.length; k++) {
			if (max == a[k]) {
				System.out.println(c[k]);
			}
		}

	}

}
