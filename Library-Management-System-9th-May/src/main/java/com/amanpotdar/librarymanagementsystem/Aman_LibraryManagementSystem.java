package com.amanpotdar.librarymanagementsystem;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;

import com.amanpotdar.librarymanagementsystem.entity.*;
import com.amanpotdar.librarymanagementsystem.service.Service_of_Book;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class Aman_LibraryManagementSystem {

	public static void main(String[] args) {
		SpringApplication.run(Aman_LibraryManagementSystem.class, args);
	}

	@Bean
	public CommandLineRunner initialCreate(Service_of_Book bookService) {
		return (args) -> {

			Book book = new Book("Test isbn", "Test name", "Test serial name", "Test description");
			Author author = new Author("Test author name", "Test description");
			Category category = new Category("Test category name");
			name_of_publisher publisher = new name_of_publisher("Test publisher name");

			book.addAuthors(author);
			book.addCategories(category);
			book.addPublishers(publisher);

			bookService.createBook(book);

			Book bk11 = new Book("Test isbn1", "Test name1", "Test serial name1", "Test description1");
			Author athr11 = new Author("Test author name1", "Test description1");
			Category ctgry11 = new Category("Test category name1");
			name_of_publisher pblshr1



					= new name_of_publisher("Test publisher name1");

			book1.addAuthors(author1);
			book1.addCategories(category1);
			book1.addPublishers(pblshr1



			);

			bookService.createBook(book1);

			Book book2 = new Book("Test isbn2", "Test name2", "Test serial name2", "Test description2");
			Author author2 = new Author("Test author name2", "Test description2");
			Category category2 = new Category("Test category name2");
			name_of_publisher publisher2 = new name_of_publisher("Test publisher name2");

			book2.addAuthors(author2);
			book2.addCategories(category2);
			book2.addPublishers(publisher2);

			bookService.createBook(book2);

		};
	}
}
