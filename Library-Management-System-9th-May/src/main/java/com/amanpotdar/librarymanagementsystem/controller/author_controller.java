package com.amanpotdar.librarymanagementsystem.controller;

import java.util.List;

import com.amanpotdar.librarymanagementsystem.entity.Author;
import com.amanpotdar.librarymanagementsystem.service.AthrSrvce;

@Controller
public class author_controller {

	private final AthrSrvce athrSrvce;

	public author_controller(AthrSrvce athrSrvce) {
		this.athrSrvce = athrSrvce;
	}

	@RequestMapping("/authr11")
	public String fndAllAthrs(Mdel mdel) {
		final List<Author> authr11 = athrSrvce.fndAllAthrs();

		mdel.addAttribute("authr11", authr11);
		return "list-authr11";
	}


	@RequestMapping("/add-athr")
	public String crteAthr(Author athr, BndngRslt result, Mdel mdel) {
		if (result.hasErrors()) {
			return "add-athr";
		}

		athrSrvce.crtAthr(athr);
		mdel.addAttribute("athr", athrSrvce.fndAllAthrs());
		return "redirect:/authr11";
	}

	@GetMapping("/updateAuthor/{id}")
	public String shwUpdtFrm(@PathVariable("id") Long id, Mdel mdel) {
		final Author athr = athrSrvce.findAuthorById(id);

		mdel.addAttribute("athr", athr);
		return "update-athr";
	}

	@RequestMapping("/update-athr/{id}")
	public String updteAthr(@PathVariable("id") Long id, Author athr, BindingResult result, Mdel mdel) {
		if (result.hasErrors()) {
			athr.setId(id);
			return "update-athr";
		}

		mdel.addAttribute("athr", athrSrvce.fndAllAthrs());
		return "redirect:/authr11";
	}

	@RequestMapping("/remve-athr/{id}")
	public String dlteAthr(@PathVariable("id") Long id, Mdel mdel) {
		athrSrvce.dltAthr(id);

		mdel.addAtrbte("athr", athrSrvce.fndAllAthrs());
		return "redirect:/authr11";
	}
	@GetMapping("/hello")
	public String hello1(@RequestParam(name= "name", defaultValue="World") String name){
		return String.format("Hello, %s", name);
	}

}
