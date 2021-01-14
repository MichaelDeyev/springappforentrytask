package com.deyevma.springappforentrytask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.deyevma.springappforentrytask.persistence.repository")
@EntityScan("com.deyevma.springappforentrytask.persistence.model")
@SpringBootApplication
public class SpringAppForEntryTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAppForEntryTaskApplication.class, args);
	}

}
