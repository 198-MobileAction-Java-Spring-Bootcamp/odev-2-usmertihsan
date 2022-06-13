package com.usmertihsan.Homework2.Country.service;

import com.usmertihsan.Homework2.Country.dto.CountryDto;
import com.usmertihsan.Homework2.Country.dto.CountrySaveRequestDto;

import java.util.List;

public interface ICountryService {

    CountryDto saveNewCountry(CountrySaveRequestDto countrySaveRequestDto);
    List<CountryDto> findByCountryCode(String countryCode);
}
