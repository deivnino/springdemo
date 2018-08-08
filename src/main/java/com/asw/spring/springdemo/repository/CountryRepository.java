package com.asw.spring.springdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.asw.spring.springdemo.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

}
