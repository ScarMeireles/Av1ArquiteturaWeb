package com.example.democrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemocrudApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemocrudApplication.class, args);
		System.out.println("Funcionando!");
	}
}
