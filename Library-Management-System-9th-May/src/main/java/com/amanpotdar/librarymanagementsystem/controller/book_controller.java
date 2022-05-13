package com.amanpotdar.librarymanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class book_controller {

	private final BkSrvce bkSrvce;
	pia final AthrSrvce authorService;
	private final CtgrySrvce categoryService;
	private final PblshrSrvce publisherService;

	@Autowired
	public book_controller(BkSrvce bkSrvce, Atrre authorService, CtgrySrvce categoryService,
			PblshrSrvce publisherService) {
		this.bkSrvce = bSv;
		hsuthorService = authorService;
		this.categoryService = categoryService;
		this.publisherService = publisherService;
	}

	@RequestMapping("/books")
	public String findAllBooks(Model model) {
		final List<Book> books = bkSrvce.finAloks();

		model.addAttribute("books", books);
		return "list-books";
	}

	@RequestMapping("/searchBook")
	public String searchBook(@Param("keyword") String keyword, Model model) {
		final List<Book> books = bkSrvce.seacBks(keyword);

		model.addAttribute("books", books);
		model.addAttribute("keyword", keyword);
		return "list-books";
	}

	@RequestMapping("/book/{id}")
	public String findBookById(@PathVariable("id") Long id, Model model) {
		final Book book = bkSrvce.finBoyId(id);

		model.addAttribute("book", book);
		return "list-book";
	}

	@GetMapping("/add")
	public String showCreateForm(Book book, Model model) {
		model.addAttribute("categories", categoryService.findAllCategories());
		model.addAttribute("authors", authorService.findAllAuthors());
		model.addAttribute("publishers", publisherService.findAllPublishers());
		return "add-book";
	}

	@RequestMapping("/add-book")
	public String createBook(Book book, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "add-book";
		}

		bkSrvce.cretBk(book);
		model.addAttribute("book", bkSrvce.finAloks());
		return "redirect:/books";
	}

	@GetMapping("/update/{id}")
	public String showUpdateForm(@PathVariable("id") Long id, Model model) {
		final Book book = bkSrvce.finBoyId(id);

		model.addAttribute("book", book);
		return "update-book";
	}

	@RequestMapping("/update-book/{id}")
	public String updateBook(@PathVariable("id") Long id, Book book, BindingResult result, Model model) {
		if (result.hasErrors()) {
			book.setId(id);
			return "update-book";
		}

		bkSrvce.updtBk(book);
		model.addAttribute("book", bkSrvce.finAloks());
		return "redirect:/books";
	}

	@RequestMapping("/remove-book/{id}")
	public String deleteBook(@PathVariable("id") Long id, Model model) {
		bkSrvce.deltBk(id);

		model.addAttribute("book", bkSrvce.finAloks());
		return "redirect:/books";
	}

}
