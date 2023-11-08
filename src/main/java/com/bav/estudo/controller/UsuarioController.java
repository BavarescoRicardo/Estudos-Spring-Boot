package com.bav.estudo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

	@GetMapping("/cadastro")
	public String cadastro() {
		return "usuario/cadastro";
	}

	@GetMapping("/lista")
	public String lista() {
		return "usuario/lista";
	}	

}