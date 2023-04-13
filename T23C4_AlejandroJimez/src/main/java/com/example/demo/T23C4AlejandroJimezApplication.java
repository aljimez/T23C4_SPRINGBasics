package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class T23C4AlejandroJimezApplication {

	public static void main(String[] args) {
		SpringApplication.run(T23C4AlejandroJimezApplication.class, args);
	}
	@GetMapping("/")
	public String welcome() {
		return String.format("Bienvenido a Spring Format");
	}
	
    @GetMapping("/hello")
    public String hello() {
    	return String.format("Hola Mundo");
    }
    
    @GetMapping("/saluda")
    public String saluda(@RequestParam(value="name",defaultValue = "World") String name) {
    	return String.format("Hola %s!",name);
    }
    
}