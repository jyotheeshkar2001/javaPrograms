package com.shristi.basic;

public class Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,20,3,50,7,20,59};
		int smallest=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<smallest)
			{
				smallest=a[i];
			}
		}
		System.out.println("greatest number is"+smallest);


	}

}
