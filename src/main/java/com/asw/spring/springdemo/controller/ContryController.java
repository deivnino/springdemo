package com.asw.spring.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.asw.spring.springdemo.model.Country;
import com.asw.spring.springdemo.service.CountryService;

@Controller
@RequestMapping("v1")
public class ContryController {

	@Autowired
	CountryService service;
	
	
	//GET
	@RequestMapping(value="/countries",method=RequestMethod.GET,headers="Accept=application/json")
	public ResponseEntity<List<Country>> getCountries(){
		
		List<Country> countries;
		countries = service.getAllCountries();

		return new ResponseEntity<List<Country>>(countries, HttpStatus.OK);
	}
	
}
