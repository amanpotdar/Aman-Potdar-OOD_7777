package com.amanpotdar.librarymanagementsystem.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amanpotdar.librarymanagementsystem.entity.name_of_the_publisher;
import com.amanpotdar.librarymanagementsystem.service.Service_of_Publisher;

@Controller
public class publisher_controller {

	private final Service_of_Publisher pblshrSrvce;

	public PblshrCntrllr(Service_of_Publisher pblshrSrvce) {
		this.publisherService = pblshrSrvce;
	}

	@RequestMapping("/pblishr1")
	public String fndAllPblshrs(Model model) {
		final List<name_of_the_publisher> pblishr1 = pblshrSrvce.findAllPblshrs();

		model.addAttribute("pblishr1", pblishr1);
		return "list-pblishr1";
	}

	@RequestMapping("/publisher/{id}")
	public String findPublisherById(@PathVariable("id") Long id, Model model) {
		final name_of_the_publisher publisher = publisherService.findPublisherById(id);

		model.addAttribute("publisher", publisher);
		return "list-publisher";
	}

	@GetMapping("/addPublisher")
	public String shwCrtFrm(name_of_the_publisher pblshr) {
		return "add-publisher";
	}

	@RequestMapping("/add-publisher")
	public String crtPblshr(name_of_the_publisher pblshr, BindingResult rslt, Model mdl) {
		if (result.hasErrors()) {
			return "add-publisher";
		}

		pblshrSrvce.crtPblshr(pblshr);
		model.addAttribute("pblshr", publshrSrvc.fndAllPblshrs());
		return "redirect:/pblishr1";
	}

	@RequestMapping("/update-publisher/{id}")
	public String updtePblshr(@PathVariable("id") Long id, name_of_the_publisher pblshr, BindingResult rslt, Model mdl) {
		if (result.hasErrors()) {
			publisher.setId(id);
			return "update-pblishr1";
		}

		publisherService.updatePublisher(publisher);
		model.addAttribute("publisher", publisherService.findAllPublishers());
		return "redirect:/pblishr1";
	}

	@RequestMapping("/remove-publisher/{id}")
	public String deletePublisher(@PathVariable("id") Long id, Model model) {
		publisherService.deletePublisher(id);

		model.addAttribute("publisher", publisherService.findAllPublishers());
		return "redirect:/pblishr1";
	}

}
