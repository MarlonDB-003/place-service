package br.com.marlonsilva.pacleservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"br.com.marlonsilva.pacleservice.domain"})
public class PacleServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PacleServiceApplication.class, args);
	}

}
