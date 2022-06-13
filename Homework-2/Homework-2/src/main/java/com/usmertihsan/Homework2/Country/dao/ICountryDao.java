package com.usmertihsan.Homework2.Country.dao;

import com.usmertihsan.Homework2.Country.dto.CountryDto;
import com.usmertihsan.Homework2.Country.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICountryDao extends JpaRepository<Country,Long> {

    List<Country> findByCountryCode(String countryCode);



}
