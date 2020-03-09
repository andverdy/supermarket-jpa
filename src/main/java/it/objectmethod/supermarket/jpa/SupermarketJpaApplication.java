package it.objectmethod.supermarket.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("it.objectmethod.supermarket.jpa")
public class SupermarketJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SupermarketJpaApplication.class, args);
	}

}
