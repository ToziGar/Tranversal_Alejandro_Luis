package com.example;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TransversalApplication {
	@PersistenceUnit(unitName= "myPersistenceUnit")
	private EntityManagerFactory emf;
	public static void main(String[] args) {
		
		SpringApplication.run(TransversalApplication.class, args);
		System.out.println("version 1");
		System.out.println("");
	}

}
