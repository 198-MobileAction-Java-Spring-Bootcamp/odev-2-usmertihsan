package com.usmertihsan.Homework2.Country.converter;

import com.usmertihsan.Homework2.Country.dto.CountryDto;
import com.usmertihsan.Homework2.Country.dto.CountrySaveRequestDto;
import com.usmertihsan.Homework2.Country.entity.Country;

import java.util.ArrayList;
import java.util.List;


public class CountryConverter {

    public Country saveReqConvertToCountry(CountrySaveRequestDto countrySaveRequestDto){
        Country country = new Country();
        country.setCountryName(countrySaveRequestDto.getCountryName());
        country.setCountryCode(countrySaveRequestDto.getCountryCode());
        return country;
    }

    public Country convertToCountry(CountryDto countryDto){
        Country country = new Country();
        country.setCountryName(countryDto.getCountryName());
        country.setCountryCode(countryDto.getCountryCode());
        return country;
    }

    public CountryDto convertToCountryDto(Country country){
        CountryDto countryDto = new CountryDto();
        countryDto.setCountryName(country.getCountryName());
        countryDto.setCountryCode(country.getCountryCode());
        return countryDto;
    }

    public List<CountryDto> convertToCountryDtoList(List<Country> countryList){
        List<CountryDto> countryDtoList = new ArrayList<>();
        for (Country country : countryList) {
            CountryDto countryDto = convertToCountryDto(country);
            countryDtoList.add(countryDto);
        }
        return countryDtoList;
    }





}
