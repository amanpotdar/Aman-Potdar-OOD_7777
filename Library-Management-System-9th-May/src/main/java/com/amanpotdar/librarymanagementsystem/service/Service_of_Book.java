package com.amanpotdar.librarymanagementsystem.service;

import java.util.List;

import com.amanpotdar.librarymanagementsystem.entity.Book;

public interface Service_of_Book {

	public List<Book> findAllBooks();
	
	public List<Book> searchBooks(String keyword);

	public Book findBookById(Long id);

	public void createBook(Book book);

	public void updateBook(Book book);

	public void deleteBook(Long id);

}
