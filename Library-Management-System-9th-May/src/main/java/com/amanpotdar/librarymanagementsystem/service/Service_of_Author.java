package com.amanpotdar.librarymanagementsystem.service;

import java.util.List;

import com.amanpotdar.librarymanagementsystem.entity.Author;

public interface Service_of_Author {

	public List<Author> findAllAuthors();

	public Author findAuthorById(Long id);

	public void createAuthor(Author author);

	public void updateAuthor(Author author);

	public void deleteAuthor(Long id);

}
