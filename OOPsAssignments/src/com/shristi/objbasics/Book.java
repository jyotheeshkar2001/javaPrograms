package com.shristi.objbasics;

public class Book {
	String title;
	String author;
	double price;
	String category;
	Book(String title,String author,double price)
	{
		this.title=title;
		this.author=author;
		this.price=price;
	}
	void getDetails()
	{
		System.out.println("title:"+title);
		System.out.println("author:"+author);
		System.out.println("price:"+price);
		if(price>500)
		{
			System.out.println("Premium book");
		}
		else {
			System.out.println("Standard book");
		}
	
	
		
	}

}
