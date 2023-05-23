package com.shristi.objbasics;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter id");
		int id=sc.nextInt();
		int []a=new int[6];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		Student student1=new Student("ram","cse");
		student1.printDetails();
		System.out.println(student1.getGrades(a));
		System.out.println("enter name");
		String name1=sc.next();
		System.out.println("enter id");
		int id1=sc.nextInt();
		int []b=new int[6];
		for(int i=0;i<a.length;i++)
		{
			b[i]=sc.nextInt();
		}
		Student student2=new Student("jag","csd");
		student1.printDetails();
		System.out.println(student2.getGrades(b));

		

	}

}
