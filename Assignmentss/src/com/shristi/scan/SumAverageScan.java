package com.shristi.scan;
import java.util.Scanner;

public class SumAverageScan {
	public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
int[] a=new int[5];
    for(int i=0;i<a.length;i++)
    {
    a[i]=sc.nextInt();
    
	}
    int sum=0;
    for(int j:a)
    {
    	sum+=j;
    }
    System.out.println(sum);
    float avg=sum/a.length;
    System.out.println(avg);

}
}
