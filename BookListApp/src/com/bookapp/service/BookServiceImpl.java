package com.bookapp.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.bookapp.model.Book;
import com.bookapp.util.BookDetails;

public class BookServiceImpl implements IBookService {

	@Override
	public List<Book> getAll() {
		// TODO Auto-generated method stub
		List<Book> books= BookDetails.showBooks();
		return  books;
	}

	@Override
	public List<Book> getByAuthor(String author) {
		// TODO Auto-generated method stub
		List<Book> books=BookDetails.showBooks();
		List<Book> book1= books.stream().filter(book->  book.getAuthor().equals(author)).collect(Collectors.toList());
		return book1;
	}

	@Override
	public Optional<Book> getById(int bookId) {
		// TODO Auto-generated method stub
		List<Book> books=BookDetails.showBooks();
		Optional<Book> book1=books.stream().filter(book->((Integer)book.getBookId()).equals((Integer)bookId)).findFirst();
		return book1;
	}

	@Override
	public List<Book> getByCategory(String category) {
		// TODO Auto-generated method stub
		List<Book> books=BookDetails.showBooks();
		List<Book> book1= books.stream().filter(book->  book.getCategory().equals(category)).collect(Collectors.toList());
		return book1;
		
	}

	
	}


