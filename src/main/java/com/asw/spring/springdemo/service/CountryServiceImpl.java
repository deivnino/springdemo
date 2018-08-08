package com.asw.spring.springdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.asw.spring.springdemo.model.Country;
import com.asw.spring.springdemo.repository.CountryRepository;

@Service
public class CountryServiceImpl implements CountryService {

    private final CountryRepository countryRepository;

    @Autowired
    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public Country createCountry(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public Optional<Country> getCountry(String id) {
        return countryRepository.findById(id);
    }

    @Override
    public Country editCountry(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public void deleteCountry(Country country) {
        countryRepository.delete(country);
    }

    @Override
    public void deleteCountry(String id) {
        countryRepository.deleteById(id);
    }

    @Override
    public List<Country> getAllCountries(int pageNumber, int pageSize) {
        return countryRepository.findAll(new PageRequest(pageNumber, pageSize)).getContent();
    }

    @Override
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    @Override
    public long countCountries() {
        return countryRepository.count();
    }


}
