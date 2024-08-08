package com.library;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.service.BookService;

public class LibraryManagementApplication {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		context object has method getBean() returns the bean object
		BookService bookService = context.getBean("bookService", BookService.class);
//		test injection
		bookService.testMessage();
	}
}