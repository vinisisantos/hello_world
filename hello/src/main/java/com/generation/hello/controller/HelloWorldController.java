package com.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld")
public class HelloWorldController {
	
	@GetMapping()
	public String hello() {
		return "Hellow World <br> BSMs QUE ESTOU MAIS FOCADO <br> Persistência <br> Orientação aos detalhes <br> Comunicação <br> ";
	}
	
}
