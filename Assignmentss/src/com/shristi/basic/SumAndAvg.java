package com.shristi.basic;

public class SumAndAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5,6,7,8,9};
		int sum=0;
		for(int i:a)
		{
			sum+=i;
		}
		System.out.println("sum:"+sum);
		float average=sum/a.length;
		System.out.println("average:"+average);
		

	}

}
