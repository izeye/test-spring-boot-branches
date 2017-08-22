package com.izeye.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Application.
 *
 * @author Johnny Lim
 */
@SpringBootApplication
@RestController
public class Application {

	@GetMapping("/")
	String home() {
		return "Hello, world!";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
