package com.shristi.basic;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,30,60,32,2,5};
		for(int i=0;i<a.length;i++)
		{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]>a[j])
			{
				int temp=a[i];
				 a[i]=a[j];
				 a[j]=temp;
			}
		}
		}
		System.out.println("second largest"+a[a.length-2]);
	}

}
