package com.shristi.basic;

public class Greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,20,30,50,70,2,59};
		int greatest=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>greatest)
			{
				greatest=a[i];
			}
		}
		System.out.println("greatest number is"+greatest);

	}

}
