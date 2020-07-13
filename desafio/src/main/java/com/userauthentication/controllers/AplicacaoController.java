package com.userauthentication.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Classe controller da aplicação
 * @author Giovanna Severo
 *
 */
@RestController
public class AplicacaoController {
	
	@GetMapping("/")
	public String home() {
		return ("<h1>Bem vindo a Tela Home!</h1>");
	}
	
	@GetMapping("/usuario-comum")
	public String usuarioComum() {
		return("<h1>Tela de acesso Usuário comum!</h1>");
	}
	
	@GetMapping("/admin")
	public String admin() {
		return("<h1>Tela de acesso Usuário admin!</h1>");
	}
	
	
}
