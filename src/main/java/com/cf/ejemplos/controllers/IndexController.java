package com.cf.ejemplos.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

	@GetMapping(value="/")
	public String index(Model model) {
		model.addAttribute("titulo", "Soy el titulo");
		model.addAttribute("saludo", "Hola mundo!!!");
		model.addAttribute("show", false);
		//List<String> series = List.of("Game of thrones", "Vikings", "Dexter");//null;
		//model.addAttribute("series", series);
		return "index";
	}
	
	@GetMapping(value="/index-mv")
	public ModelAndView indexMV(ModelAndView mv) {
		mv.addObject("titulo", "Titulo con MV");
		mv.addObject("saludo", "Saludo con MV");
		mv.addObject("show", true);
		//List<String> series = List.of("Game of thrones", "Vikings", "Dexter");//null;
		//mv.addObject("series", series);
		mv.setViewName("index");
		return mv;
	}
	
	@ModelAttribute("series")
	public List<String> getSeries(){
		return List.of("Game of thrones", "Vikings", "Dexter", "The last of us");
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
