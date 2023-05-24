package com.bookapp.main;

import java.util.List;

import com.bookapp.model.Book;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;

public class Client {
  public static void main(String[] args)
  {
	  IBookService iBookService=new BookServiceImpl();
	  System.out.println(iBookService.getAll());
	  
	  	  
	 System.out.println(iBookService.getByAuthor("kathy")) ;
	 System.out.println(iBookService.getById(2));
	 System.out.println(iBookService.getByCategory("tech")) ;
	  
  }
}
