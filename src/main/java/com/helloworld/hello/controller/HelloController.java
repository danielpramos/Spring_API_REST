package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "A mentalidade que tive foi a de persistência para aprender algo novo, e atenção aos detalhes, para entender como criar a lógica da API";
	}
	
	@GetMapping("/2")
	public String hello2() {
		return "Essa semana meu foco será em Spring Boot e MySQL a fim de construir uma API completa com todas as camadas http";
	}
}
