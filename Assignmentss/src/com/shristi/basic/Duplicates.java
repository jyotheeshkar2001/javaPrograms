package com.shristi.basic;

public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {10,2,2,3,6,5,6};
int[] f=new int[a.length];
for(int i=0;i<a.length;i++)
{
	int count=1;
	for(int j=i+1;j<a.length;j++)
	{
		if(a[i]==a[j])
		{
			a[j]=-1;
			count++;
		}
		f[i]=count;
	}
}
System.out.println("duplicates are");
for(int i=0;i<a.length;i++)
{
	if(a[i]!=-1&&f[i]>1)
	{
		System.out.println(a[i]+" ");
	}
}
	}

}
