package com.nelson.springbootmaverick;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@EnableAsync
public class SpringBootMaverickApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMaverickApplication.class, args);
	}

	@GetMapping
	public List<String> hello(){
		return List.of("Hello", "world");
	}
}
