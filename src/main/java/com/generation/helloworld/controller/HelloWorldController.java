package com.generation.helloworld.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

	@GetMapping
	public String helloWorld() {
		return "Hello World!!";
	}
	
	@GetMapping("/bsm")
	public List<String> bsm() {
		return List.of(
				"LISTA DE BSMs DA GENERATION:",
				"- Orientação ao futuro",
				"- Persistência",
				"- Responsabilidade Pessoal",
				"- Mentabilidade de Crescimento",
				"- Comunicação",
				"- Proatividade",
				"- Orientação ao Detalhe",
				"- Trabalho em equipe"
				);
	}
	
	@GetMapping("/objetivos")
	public List<String> objetivos() {
		return List.of(
				"LISTA DE OBJETIVOS DA SEMANA:",
				"- Revisar Banco de dados",
				"- Fazer exercícios em SQL",
				"- Estudar o conteúdo de Spring",
				"- Treinar o Pitch"
				);
}
}
