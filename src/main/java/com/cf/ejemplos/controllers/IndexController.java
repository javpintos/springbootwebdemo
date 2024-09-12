package com.cf.ejemplos.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class IndexController {

	@GetMapping(value="/")
	public String index(Model model) {
		model.addAttribute("titulo", "Soy el titulo");
		model.addAttribute("saludo", "Hola mundo!!!");
		model.addAttribute("show", false);
		List<String> series = List.of("Game of thrones", "Vikings", "Dexter");//null;
		model.addAttribute("series", series);
		return "index";
	}
	
	/*
	@RequestMapping(value="/index-rm", method = RequestMethod.GET)
	public String indexRequestMapping() {
		return "index";
	}
	*/
	
	@PostMapping(value="/index-post")
	public String indexPost() {
		return "index";
	}
}
