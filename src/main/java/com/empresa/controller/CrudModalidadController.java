package com.empresa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CrudModalidadController {


	@GetMapping("/verCrudModalidad")
	public String verInicio() {
		return "crudModalidad";
	}
	
	
}