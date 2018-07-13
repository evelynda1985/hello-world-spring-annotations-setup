package com.evelynda1985.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ControllerHelloWorld {

	@RequestMapping("/helloWorld") // to test it http://localhost:8080/hello-world-spring-annotations/helloWorld
	public String showHelloWorld() {
		
		System.out.println("hello World");
		
		return "helloWorld"; //this is the name of the jps file in the view folder
		
	}
	
	//You can also use... for now is not important the different but @GetMapping is use for HTTP REST request
	@GetMapping("/helloWorld2") // // to test it http://localhost:8080/hello-world-spring-annotations/helloWorld2
	public String showHelloWorld2() {
		
		System.out.println("hello World");
		
		return "helloWorld";
		
	}
	
}
