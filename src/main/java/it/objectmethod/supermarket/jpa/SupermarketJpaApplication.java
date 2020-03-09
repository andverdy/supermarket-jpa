package it.objectmethod.supermarket.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@ComponentScan("module-service")
public class SupermarketJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SupermarketJpaApplication.class, args);
	}

}
