package com.example.college;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class CollegeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollegeApplication.class, args);
	}

}
