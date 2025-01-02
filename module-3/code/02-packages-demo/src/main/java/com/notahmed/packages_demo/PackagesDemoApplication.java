package com.notahmed.packages_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"org.example.test", "com.notahmed.packages_demo"})
public class PackagesDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PackagesDemoApplication.class, args);
	}

}
