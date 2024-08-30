package com.example.helloworldTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class HelloworldTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloworldTestApplication.class, args);
	}

	@GetMapping
	public List<Greeting> getGreeting() {
		return List.of(
				new Greeting("Hello", "World")
		);
	}

}
