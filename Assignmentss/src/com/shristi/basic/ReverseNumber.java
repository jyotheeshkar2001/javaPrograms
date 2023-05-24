package com.shristi.basic;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int num=123;
  int sum=0;
  while(num>0)
  {
	  int last=num%10;
	  sum=sum*10+last;
	  num/=10;
	  
  }
  System.out.println(sum);
	}

}
