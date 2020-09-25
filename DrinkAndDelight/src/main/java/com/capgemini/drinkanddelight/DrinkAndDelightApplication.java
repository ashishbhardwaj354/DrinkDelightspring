package com.capgemini.drinkanddelight;

import javax.persistence.EntityManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;

@SpringBootApplication
public class DrinkAndDelightApplication extends JpaRepositoryFactory{

	public DrinkAndDelightApplication(EntityManager entityManager) {
		super(entityManager);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		SpringApplication.run(DrinkAndDelightApplication.class, args);
	}

}
