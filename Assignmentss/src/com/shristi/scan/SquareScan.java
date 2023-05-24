package com.shristi.scan;

import java.util.Scanner;

public class SquareScan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] a=new int[5];
		    for(int i=0;i<a.length;i++)
		    {
		    a[i]=sc.nextInt();
		    
			}
		    
		    for(int i=0;i<a.length;i++)
		    {
		    	a[i]=a[i]*a[i];
		    }
		    for(int k:a)
		    {
		    	System.out.print(k+" ");
		    }
	}

}
