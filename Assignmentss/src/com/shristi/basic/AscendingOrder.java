package com.shristi.basic;

public class AscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {2,5,1,9,3};
  for(int i=0;i<a.length;i++)
  {
	  for(int k=i+1;k<a.length;k++)
	  {
		  if(a[i]>a[k])
		  {
			  int temp=a[i];
			  a[i]=a[k];
			  a[k]=temp;
		  }
	  }
  }
  for(int j:a)
  {
	  System.out.print(j+" ");
  }
	}

}
