package com.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.repository.BookRepository;

@Service
public class BookService {
	private  BookRepository bookRepository;
	//constructor
      public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
	
	public BookRepository getBookRepository() {
		return bookRepository;
	}
	public void setBookRepository(BookRepository bookRepository1) {
		this.bookRepository = bookRepository1;
	}   
}