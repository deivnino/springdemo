package com.asw.spring.springdemo.service;

import java.util.List;
import java.util.Optional;

import com.asw.spring.springdemo.model.Country;

public interface CountryService {
    Country createCountry(Country country);
    Optional<Country> getCountry(String id);
    Country editCountry(Country country);
    void deleteCountry(Country country);
    void deleteCountry(String id);
    List<Country> getAllCountries(int pageNumber, int pageSize);
    List<Country> getAllCountries();
    long countCountries();
}
