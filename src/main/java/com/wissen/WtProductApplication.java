package com.wissen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.wissen")
public class WtProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(WtProductApplication.class, args);
	}

}
