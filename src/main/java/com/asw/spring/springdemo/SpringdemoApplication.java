package com.asw.spring.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.asw.spring.springdemo.service.CountryService;

@SpringBootApplication
public class SpringdemoApplication /*extends SpringBootServletInitializer*/ implements CommandLineRunner  {

	public static void main(String[] args) {
		SpringApplication.run(SpringdemoApplication.class, args);
	}
	
	@Autowired
	private CountryService service;
	
	@Override
	public void run(String... strings) {

		System.out.println("current countries: "+service.countCountries());				
	}
}