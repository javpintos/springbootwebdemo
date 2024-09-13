package com.cf.ejemplos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ParametrosController {
	
	@GetMapping("/parametros")
	public String parametros(@RequestParam(defaultValue = "defaultValue") String valor, @RequestParam(defaultValue = "", name= "valor_dos") String otroValor, Model model) {
		model.addAttribute("titulo", "Parametros");
		model.addAttribute("parametro", valor);
		model.addAttribute("parametro2", otroValor);
		return "parametros";
	}
}
