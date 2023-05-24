package com.shristi.basic;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153;
		int num2=num;
		int num3=num;
		int count=0;
		int sum=0;
		while(num>0)
		{
			count++;
			num=num/10;
			
		}
		while(num2>0)
		{
			int last=num2%10;
			int prod=1;
			for(int i=1;i<=count;i++)
			{
			   prod*=last;	
			}
			sum+=prod;
			num2=num2/10;
		}
		if(sum==num3)
		{
			System.out.println("armstrong number");
		}
		else {
			System.out.println("not armstrong number");
		}
		

	}

}
