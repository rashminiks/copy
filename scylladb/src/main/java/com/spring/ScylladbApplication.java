package com.spring;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScylladbApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(ScylladbApplication.class, args);
		System.out.println("\n Application Landed .....!");
	}

}
