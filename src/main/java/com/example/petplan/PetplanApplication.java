package com.example.petplan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"java"})
public class PetplanApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetplanApplication.class, args);
	}

}
