package com.example.python_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan // class path 존재하는 모든 ConfigurationProperties Scan
@SpringBootApplication
public class PythonSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PythonSpringApplication.class, args);
	}

}
