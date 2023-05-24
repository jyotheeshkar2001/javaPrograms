package com.shristi.basic;

public class FibanonciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		System.out.print(a+" "+b+" ");
		for(int i=1;i<5;i++)
		{
			int c=a+b;
			System.out.print(c+" ");
			b=c;
			a=b;
		}

	}

}
