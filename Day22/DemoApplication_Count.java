package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping; //THIS IS NEW
import org.springframework.web.bind.annotation.RequestParam; //THIS IS NEW
import org.springframework.web.bind.annotation.RestController; //THIS IS NEW

@SpringBootApplication
@RestController //THIS IS NEW
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	//THIS IS NEW
	@GetMapping("/hello")
	public String hello(@RequestParam(value="name", defaultValue="World") String name){
		return String.format("Hello %s!",name);
	}

	@GetMapping("/count")
	public String neato(@RequestParam(value="entry", defaultValue="") String entry){
		int count = entry.length();
		return String.format("The number of characters in %s is %d", entry, count);
	}



}
