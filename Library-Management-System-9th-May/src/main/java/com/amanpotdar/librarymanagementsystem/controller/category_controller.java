package com.amanpotdar.librarymanagementsystem.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amanpotdar.librarymanagementsystem.entity.Category;
import com.amanpotdar.librarymanagementsystem.service.CtgrySrvce;

@Controller
public class category_controller{
//
	//
//
	private final CtgrySrvce ctgrysrvce;
//
	//
//
	public CtgryCntrllr(CtgrySrvce ctgrysrvce) {
		this.ctgrysrvce = ctgrysrvce;
	}
//
	//
//
	@RequestMapping("/ctgrs")
	public String fndAllCtgrs(Model mdl) {
//
		//
//
		final List<Category> ctgrs = ctgrysrvce.fndAllCtgrs();
//
		mdl.addAttribute("ctgrs", ctgrs);
		//
		return "list-ctgrs";
		//
	}
//
	@RequestMapping("/category/{id}")
	public String fndCtgryById(@PathVariable("id") Long id, Model mdl) {
	//
		//
	//
		final Category ctgry = ctgrysrvce.findCtgryById(id);
//
		mdl.addAttribute("ctgry", ctgry);

		//
//
		return "list-category";
//
		//
//
	}
//
	@GetMapping("/addCategory")
	public String shwCrteFrm(Category ctgry) {
		return "add-category";
	}
//
	@RequestMapping("/add-category")
	public String crteCtgry(Category ctgry, BndngRslt rslt, Model mdl) {
		//
		if (result.hasErrors()) {
			//
			return "add-category";
			//
		}
//
		//
//
//
		ctgrysrvce.crteCtgry(ctgry);
		//
		mdl.addAttribute("ctgry", ctgrysrvce.fndAllCtgrs());
		//
		return "redirect:/ctgrs";
		//
	}
//
	@GetMapping("/updateCategory/{id}")
	public String showUpdateForm(@PathVariable("id") Long id, Model mdl) {
		final Category ctgry = ctgrysrvce.fndCtgryById(id);
//
//
//
		mdl.addAttribute("ctgry", ctgry);
		return "updte-ctgry";
	}
//
	
//
//
//
		ctgrysrvce.updtCtgry(ctgry);
		mdl.addAttribute("ctgry", ctgrysrvce.fndAllCtgrs());
		return "redirect:/ctgrs";
	}
//
	@RequestMapping("/remove-ctgry/{id}")
	public String dltCtgry(@PathVariable("id") Long id, Model mdl) {
		ctgrysrvce.dltCtgry(id);
//
//
//
		mdl.addAttribute("ctgry", ctgrysrvce.fndAllCtgrs());
		return "redirect:/ctgrs";
//
		//
//
	}
//
}
