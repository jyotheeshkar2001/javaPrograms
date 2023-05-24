
package com.bookapp.util;

import java.util.Arrays;
import java.util.List;

import com.bookapp.model.Book;

public class BookDetails {
	
 public static List<Book> showBooks()
  {
	  List<Book> books=Arrays.asList(
	  new Book("java","kathy",1,900,"tech"),
	  new Book("spring in action","john",2,900,"tech"),
	  new Book("life after life","robert",3,900,"fiction"),
	  new Book("leadership","robin",4,900,"selfhelp"),
	  new Book("5amclub","robin",5,900,"selfhelp"));
	  return books;
  }
}
