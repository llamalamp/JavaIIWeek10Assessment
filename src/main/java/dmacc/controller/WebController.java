package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.WineBottle;
import dmacc.repository.WineRepository;

/**
 * @author kenne-krcutkomp CIS175 - Fall 2022
 */
@Controller
public class WebController {
	@Autowired 
	WineRepository repo;

	@GetMapping({ "/", "viewAll" })
	public String viewAllBottles(Model model) {
		if (repo.findAll().isEmpty()) {
			return addNewBottle(model);
		}
		model.addAttribute("bottles", repo.findAll());
		return "results";
	}

	@GetMapping("/inputBottle")
	public String addNewBottle(Model model) {
		WineBottle w = new WineBottle();
		model.addAttribute("newBottle", w);
		return "input";
	}

	@PostMapping("/inputBottle")
	public String addNewBottle(@ModelAttribute WineBottle w, Model model) {
		repo.save(w);
		return viewAllBottles(model);
	}

	@GetMapping("/edit/{id}")
	public String showUpdateBottle(@PathVariable("id") long id, Model model) {
		WineBottle w = repo.findById(id).orElse(null);
		model.addAttribute("newBottle", w);
		return "input";
	}

	@PostMapping("/update/{id}")
	public String reviseBottle(WineBottle w, Model model) {
		repo.save(w);
		return viewAllBottles(model);
	}

	@GetMapping("/delete/{id}")
	public String deleteBottle(@PathVariable("id") long id, Model model) {
		WineBottle w = repo.findById(id).orElse(null);
		repo.delete(w);
		return viewAllBottles(model);
	}

}
