package com.library;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.service.BookService;

public class LibraryManagementApplication {
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    	BookService bookService = context.getBean(BookService.class);

        // Test the bookService bean here
        System.out.println("BookService Bean: " + bookService);
    }
}
