package com.asw.spring.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.asw.spring.springdemo.service.CountryService;

@SpringBootApplication
public class SpringdemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringdemoApplication.class, args);
	}
	
	@Autowired
	private CountryService service;
	
	@Override
	public void run(String... strings) {

		//LOG.info("Current objects in DB: {}", service.);
		System.out.println("current countries: "+service.countCountries());
				
	}
}

